package main

import (
	"fmt"
	md "github.com/JohannesKaufmann/html-to-markdown"
	"github.com/TingSyuanWang/LeetCode-in-Java/MarkdownGenerator/libs"
	"github.com/gobeam/stringy"
	"log"
	"os"
	"runtime/debug"
	"sort"
	"strings"
	"syscall"
)

func buildProblemDir(problemNum int) {
	log.Printf("Generating the folder for problem %d... 🐎🐎🐎\n", problemNum)

	lc := newLeetCode()

	if problemNum >= len(lc.Problems) {
		log.Panicf("❌ %d exceeds the question range, please check the problem number.", problemNum)
	}
	if lc.Problems[problemNum].ID == 0 {
		log.Panicf("❌ %d doesn't exist, please check the problem number.", problemNum)
	}
	if lc.Problems[problemNum].IsPaid {
		log.Panicf("❌ %d can't read. Become a subsriber to read the qeustion. Comment out the code if you're subscribed.", problemNum)
	}

	build(lc.Problems[problemNum])

	log.Printf("The folder for problem %d has been generated. 🚀🚀🚀\n", problemNum)
}

func build(p problem) {
	if libs.Exist(p.Dir()) {
		log.Panicf("❌ The folder for problem %d already existed. Please **remove** %s folder.", p.ID, p.Dir())
	}

	defer func() {
		if err := recover(); err != nil {
			debug.PrintStack()
			log.Println(err)
			log.Println("Clean unnecessary files. 🚨🚨🚨")
			err := os.RemoveAll(p.Dir())
			if err != nil {
				log.Panicf("❌ Couldn't remove files: %s", err)
			}
		}
	}()

	mask := syscall.Umask(0)
	defer syscall.Umask(mask)

	err := os.Mkdir(p.Dir(), 0755)
	if err != nil {
		log.Panicf("❌ Couldn't create folder %s: %s", p.Dir(), err)
	}

	log.Printf("Creating the folder for %d %s... 🐎🐎🐎\n", p.ID, p.Title)

	content, fc := getProblemsGraphql(p)
	if fc == "" {
		log.Panicf("❌ Failed to get questions.")
	}

	CreateJava(p, fc)

	creatREADME(p, content)

	log.Printf("%d.%s's folder has been created. 🛫🛫🛫\n", p.ID, p.Title)
}

func CreateJava(p problem, function string) {
	// Change File Name
	titleSlug := stringy.New(p.TitleSlug)
	titleCamelCase := titleSlug.CamelCase()
	filename := fmt.Sprintf("%s/%s.java", p.Dir(), titleCamelCase)

	// Change main function
	function = strings.Replace(function, "class Solution", "class "+titleCamelCase, 1)

	libs.Write(filename, function)
}

func creatREADME(p problem, s string) {
	converter := md.NewConverter("", true, nil)
	converter.Remove()

	fileFormat := `# [%d. %s](%s)`

	s = replaceCharacters(s)

	s, _ = converter.ConvertString(s)

	s = replaceCodeBlock(s)

	content := fmt.Sprintf(fileFormat, p.ID, p.Title, p.link()) + "\n\n" + s + "\n\n## Solutions\n\n"

	filename := fmt.Sprintf("%s/README.md", p.Dir())

	libs.Write(filename, content)
}

func replaceCharacters(s string) string {
	changeMap := map[string]string{
		"&amp;lt;":   "<",
		"&amp;quot;": "\"",
		"&amp;nbsp;": " ",
		"&amp;#39;":  "`",
		"&quot;":     "\"",
		"&lt;":       "<",
		"&gt;":       ">",
		"&ge;":       ">=",
		"&nbsp;":     " ",
		"&amp;":      "&",
		"&#39;":      "'",
		"   \n":      "\n",
		"  \n":       "\n",
		" \n":        "\n",
		"\n\n\n\n\n": "\n\n",
		"\n\n\n\n":   "\n\n",
		"\n\n\n":     "\n\n",
	}

	olds := make([]string, 0, len(changeMap))
	for old := range changeMap {
		olds = append(olds, old)
	}

	sort.Strings(olds)

	news := make([]string, 0, len(olds))
	for _, old := range olds {
		news = append(news, changeMap[old])
	}

	for i := len(olds) - 1; 0 <= i; i-- {
		old, new := olds[i], news[i]
		s = strings.Replace(s, old, new, -1)
	}

	return s
}

func replaceCodeBlock(s string) string {
	var (
		newS  string
		count int
	)

	for len(s) > 0 {
		sIndex := strings.Index(s, "```")
		if sIndex == -1 {
			break
		}
		rString := s[:sIndex]
		count++
		if count == 2 {
			count = 0
			rString = strings.Replace(rString, "<strong>", "", -1)
			rString = strings.Replace(rString, "</strong>", "", -1)
			rString = strings.TrimSuffix(rString, "\n")
			rString = "```" + rString + "```"
		}
		newS += rString
		s = s[sIndex+3:]
	}

	return newS
}
