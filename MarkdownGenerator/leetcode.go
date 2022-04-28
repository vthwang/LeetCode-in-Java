package main

import (
	"encoding/json"
	"errors"
	"fmt"
	thousands "github.com/floscodes/golang-thousands"
	"io/ioutil"
	"log"
	"os"
	"strconv"
	"time"
)

const leetcodeJSON = "leetcode.json"

type leetcode struct {
	Username string
	Ranking  int
	Updated  time.Time

	Record   record
	Problems problems
}

func newLeetCode() *leetcode {
	log.Println("=== Getting data from LeetCode now ===")

	lc, err := readLeetCode()
	if err != nil {
		log.Println("Failed to get LeetCode's record, regenerate data now. Reason: ", err.Error())
		lc = getLeetCode()
	}

	lc.refresh()

	lc.save()

	log.Println("=== Got data from LeetCode ===")
	return lc
}

func readLeetCode() (*leetcode, error) {
	data, err := ioutil.ReadFile(leetcodeJSON)
	if err != nil {
		return nil, errors.New("Failed to read leetcode.json: " + err.Error())
	}

	lc := new(leetcode)
	if err := json.Unmarshal(data, lc); err != nil {
		return nil, errors.New("Unmarshal json failed: " + err.Error())
	}

	return lc, nil
}

func (lc *leetcode) save() {
	if err := os.Remove(leetcodeJSON); err != nil {
		log.Panicf("Failed to delete %s, Reason: %s", leetcodeJSON, err)
	}

	raw, err := json.MarshalIndent(lc, "", "\t")
	if err != nil {
		log.Fatal("Failed to  make json to []bytes: ", err)
	}
	if err = ioutil.WriteFile(leetcodeJSON, raw, 0666); err != nil {
		log.Fatal("Failed to save marshalled LeetCode to file: ", err)
	}
	log.Println("Saved latest LeetCode record.")
	return
}

func (lc *leetcode) refresh() {
	if time.Since(lc.Updated) < time.Minute {
		log.Printf("LeetCode updated %s ago，Skip this refresh.\n", time.Since(lc.Updated))
		return
	}

	log.Println("refresh LeetCode data.")
	newLC := getLeetCode()

	logDiff(lc, newLC)

	*lc = *newLC
}

func logDiff(old, new *leetcode) {
	str := fmt.Sprintf("Current Ranking is %d", new.Ranking)
	verb, delta := "Getting better for", old.Ranking-new.Ranking
	if new.Ranking > old.Ranking {
		verb, delta = "Getting worse for", new.Ranking-old.Ranking
	}
	str += fmt.Sprintf(", %s %d ranks", verb, delta)
	log.Println(str)

	lenOld, lenNew := len(old.Problems), len(new.Problems)
	hasNewFinished := false

	i := 0

	for i < lenOld && i < lenNew {
		o, n := old.Problems[i], new.Problems[i]
		if o.IsAccepted == false && n.IsAccepted == true {
			log.Printf("~New Completed~ %d - %s", n.ID, n.Title)
			hasNewFinished = true
		}

		if o.IsFavor == false && n.IsFavor == true {
			log.Printf("~New Favoriate~ %d - %s", n.ID, n.Title)
		} else if o.IsFavor == true && n.IsFavor == false {
			log.Printf("~Cancel Favoriate~ %d - %s", o.ID, o.Title)
			time.Sleep(time.Second)
		}

		if o.Title == "" && n.Title != "" {
			log.Printf("New Question: %d - %s", new.Problems[i].ID, new.Problems[i].Title)
		}

		i++
	}

	log.Printf("Checked %d questions\n", i)

	if !hasNewFinished {
		log.Println("~Can't find new completed question~")
	}

	for i < lenNew {
		if new.Problems[i].isAvailable() {
			log.Printf("New Question: %d - %s", new.Problems[i].ID, new.Problems[i].Title)
		}
		i++
	}
}

func (lc *leetcode) Badges() string {
	r, err := thousands.Separate(lc.Ranking, "en")
	if err != nil {
		log.Fatalf("thounsands error: %s", err.Error())
	}

	ranking := "[![LeetCode Ranking](https://img.shields.io/badge/TingSyuanWang-" + r + "-blue.svg)](https://leetcode.com/TingSyuanWang/)"

	s := strconv.Itoa(lc.Record.Total.Solved)

	solved := "[![Solved](https://img.shields.io/badge/Solved-" + s + "-blue.svg)](https://leetcode.com/TingSyuanWang/)"

	language := " [![Java](https://img.shields.io/badge/Java-11-green.svg)](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html)"

	res := fmt.Sprintln(ranking)
	res += fmt.Sprintln(solved)
	res += fmt.Sprint(language)

	return res
}

func (lc *leetcode) SolvedProblemsTable() string {
	return lc.Record.SolvedProblemsTable()
}

func (lc *leetcode) SolutionsTable() string {
	return lc.Problems.solutions().table()
}

func (lc *leetcode) FavoriteTable() string {
	return lc.Problems.favorite().table()
}

func (lc *leetcode) FavoriteCount() int {
	return len(lc.Problems.favorite())
}
