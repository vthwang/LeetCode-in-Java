package main

import (
	"fmt"
	"strings"
)

type problem struct {
	ID         int
	Title      string
	TitleSlug  string
	PassRate   string
	Difficulty string
	IsAccepted bool
	IsPaid     bool
	IsFavor    bool
	IsNew      bool
}

func newProblem(ps problemStatus) problem {
	level := []string{"", "Easy", "Medium", "Hard"}

	p := problem{
		ID:        ps.State.ID,
		Title:     ps.State.Title,
		TitleSlug: ps.State.TitleSlug,
		// p.Submitted + 1 is because new question's is 0
		PassRate:   fmt.Sprintf("%d%%", ps.ACs*100/(ps.Submitted+1)),
		Difficulty: level[ps.Difficulty.Level],
		IsAccepted: ps.Status == "ac",
		IsPaid:     ps.IsPaid,
		IsFavor:    ps.IsFavor,
		IsNew:      ps.State.IsNew,
	}

	return p
}

func (p problem) isAvailable() bool {
	if p.ID == 0 || p.IsPaid {
		return false
	}
	return true
}

func (p problem) Dir() string {
	path := "Algorithms"
	return fmt.Sprintf("./%s/%04d.%s", path, p.ID, p.TitleSlug)
}

func (p problem) link() string {
	return fmt.Sprintf("https://leetcode.com/problems/%s/", p.TitleSlug)
}

func (p problem) tableLine() string {
	res := fmt.Sprintf("|[%04d](%s)|", p.ID, p.link())

	t := ""
	if p.IsAccepted {
		t = fmt.Sprintf(`[%s](%s)`, strings.TrimSpace(p.Title), p.Dir())
	} else {
		t = fmt.Sprintf(` * %s`, p.Title)
	}
	if p.IsNew {
		t += " :new: "
	}
	res += t + "|"

	res += fmt.Sprintf("%s|", p.PassRate)

	res += fmt.Sprintf("%s|", p.Difficulty)

	f := ""
	if p.IsFavor {
		f = "[⭐](https://leetcode.com/list/yxanka6/)"
	}
	res += fmt.Sprintf("%s|\n", f)

	return res
}

func (p problem) listLine() string {
	return fmt.Sprintf("- [%d.%s](%s)\n", p.ID, p.Title, p.link())
}
