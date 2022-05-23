package main

import (
	"fmt"
	"math"
)

type record struct {
	Easy, Medium, Hard, Total count
}

type count struct {
	Solved, Total int
}

func (r *record) SolvedProblemsTable() string {
	res := fmt.Sprintln("| | Easy | Medium | Hard | Total |")
	res += fmt.Sprintln("|:---:|:---:|:---:|:---:|:---:|")

	res += fmt.Sprintf("| **Accepted** | %d |", r.Easy.Solved)
	res += fmt.Sprintf(" %d |", r.Medium.Solved)
	res += fmt.Sprintf(" %d |", r.Hard.Solved)
	res += fmt.Sprintf(" %d |\n", r.Total.Solved)

	res += fmt.Sprintf("| **Total** | %d |", r.Easy.Total)
	res += fmt.Sprintf(" %d |", r.Medium.Total)
	res += fmt.Sprintf(" %d |", r.Hard.Total)
	res += fmt.Sprintf(" %d |\n", r.Total.Total)

	res += fmt.Sprintf("| **Coverage** | %.2f %% |", calculateCoverage(r.Easy.Solved, r.Easy.Total))
	res += fmt.Sprintf(" %.2f %% |", calculateCoverage(r.Medium.Solved, r.Medium.Total))
	res += fmt.Sprintf(" %.2f %% |", calculateCoverage(r.Hard.Solved, r.Hard.Total))
	res += fmt.Sprintf(" %.2f %% |", calculateCoverage(r.Total.Solved, r.Total.Total))

	return res
}

func (r *record) update(p problem) {
	if !p.isAvailable() {
		return
	}
	switch p.Difficulty {
	case "Easy":
		r.Easy.Total++
		if p.IsAccepted {
			r.Easy.Solved++
		}
	case "Medium":
		r.Medium.Total++
		if p.IsAccepted {
			r.Medium.Solved++
		}
	case "Hard":
		r.Hard.Total++
		if p.IsAccepted {
			r.Hard.Solved++
		}
	}
	r.Total.Total++
	if p.IsAccepted {
		r.Total.Solved++
	}
}

func calculateCoverage(solved int, total int) float64 {
	if total == 0 {
		return 0
	}
	result := float64(solved) / float64(total) * 100
	return roundFloat(result, 2)
}

func roundFloat(val float64, precision uint) float64 {
	ratio := math.Pow(10, float64(precision))
	return math.Round(val*ratio) / ratio
}
