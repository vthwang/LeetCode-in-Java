package main

import (
	"encoding/json"
	"log"
)

type leetcodeUser struct {
	Data dataWrapper `json:"data"`
}

type dataWrapper struct {
	MatchedUser matchedUser `json:"matchedUser"`
}

type matchedUser struct {
	Username             string        `json:"username"`
	IsCurrentUserPremium bool          `json:"isCurrentUserPremium"`
	Contributions        contributions `json:"contributions"`
	Profile              profile       `json:"profile"`
}

type contributions struct {
	Points int `json:"points"`
}

type profile struct {
	Reputation int `json:"reputation"`
	Ranking    int `json:"ranking"`
}

func getRanking() int {
	URL := "https://leetcode.com/graphql"
	jsonData := map[string]string{
		"query": `
            {
				matchedUser(username: "` + getConfig().Username + `")
				{
					username
					isCurrentUserPremium
					contributions
					{
						points
					}
					profile
					{
						reputation
						ranking
					}
				}
			}
        `,
	}
	data := getGraphql(URL, jsonData)

	var leetcodeUser leetcodeUser
	err := json.Unmarshal(data, &leetcodeUser)
	if err != nil {
		log.Fatal("Unmarshal leetcodeUser failed with error: ", err.Error())
	}

	r := leetcodeUser.Data.MatchedUser.Profile.Ranking

	return r
}
