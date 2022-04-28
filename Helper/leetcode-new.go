package main

import (
	"time"
)

func getLeetCode() *leetcode {
	probs, record := parseAlgs(getAlgorithms())
	lc := &leetcode{
		Username: getConfig().Username,

		Record:   record,
		Problems: *probs,

		Ranking: getRanking(),
		Updated: time.Now(),
	}

	return lc
}

func parseAlgs(alg *algorithms) (*problems, record) {
	probs := &problems{}
	r := record{}

	for _, ps := range alg.Problems {
		p := newProblem(ps)
		probs.add(p)
		r.update(p)
	}

	return probs, r
}
