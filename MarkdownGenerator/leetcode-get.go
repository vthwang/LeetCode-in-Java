package main

import (
	"bytes"
	"encoding/json"
	"io"
	"log"
	"net/http"
	"time"
)

type JsL4CodeSnippets []struct {
	Lang string
	Code string
}

type JsL3Detail struct {
	Content      string
	CodeSnippets JsL4CodeSnippets
}

type JsL2Question struct {
	Question JsL3Detail
}

type JsL1Data struct {
	Data JsL2Question
}

func getRaw(URL string) []byte {
	log.Printf("Downloading data from %s... 🛬🛬🛬", URL)

	req := newReq()
	resp, err := req.Get(URL)
	if err != nil {
		log.Fatal("getRaw: Get Error: " + err.Error())
	}

	body, err := io.ReadAll(resp.Body)
	if err != nil {
		log.Fatal("getRaw: Read Error: " + err.Error())
	}
	return body
}

func getGraphql(URL string, body map[string]string) []byte {
	log.Printf("Downloading data from %s... 🛬🛬🛬", URL)

	jsonValue, _ := json.Marshal(body)
	req, err := http.NewRequest("POST", URL, bytes.NewBuffer(jsonValue))
	req.Header.Set("Content-Type", "application/json")
	client := &http.Client{Timeout: time.Second * 10}
	resp, err := client.Do(req)
	defer resp.Body.Close()

	if err != nil {
		log.Fatal("❌ The HTTP request failed with error: ", err.Error())
	}

	data, _ := io.ReadAll(resp.Body)

	return data
}

func getProblemsGraphql(p problem) (string, string) {
	// req := newReq()

	params := make(map[string]interface{})
	params["operationName"] = "questionData"
	params["query"] = "query questionData($titleSlug: String!) { question(titleSlug: $titleSlug) { content codeSnippets { lang code } } }"
	titleSlug := make(map[string]string)
	titleSlug["titleSlug"] = p.TitleSlug
	params["variables"] = titleSlug

	// Make this JSON
	postJson, _ := json.Marshal(params)

	// http.POST expects an io.Reader, which a byte buffer does
	postContent := bytes.NewBuffer(postJson)

	resp, err := http.Post("https://leetcode.com/graphql", "application/json", postContent)
	if err != nil {
		log.Fatal("❌ getGraphql - POST Error: " + err.Error())
	}

	defer resp.Body.Close()

	if resp.StatusCode != 200 {
		log.Fatal("❌ Get question failed. code: " + resp.Status)
	}

	respBytes, err := io.ReadAll(resp.Body)
	if err != nil {
		log.Fatal("❌ getGraphql - Read Error: " + err.Error())
	}

	res := &JsL1Data{}
	err = json.Unmarshal(respBytes, &res)
	if err != nil {
		log.Fatal("❌ Unmarshal Error: " + err.Error())
	}

	code := ""
	for _, qc := range res.Data.Question.CodeSnippets {
		if qc.Lang == "Java" {
			code = qc.Code
		}
	}
	return res.Data.Question.Content, code
}
