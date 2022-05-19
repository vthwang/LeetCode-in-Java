package main

import (
	"log"
	"net/http"

	"github.com/mozillazg/request"
)

const (
	loginPageURL = "https://leetcode.com/accounts/login/"
)

var req *request.Request

func newReq() *request.Request {
	if req == nil {
		req = signin()
	}
	return req
}

func signin() *request.Request {
	log.Println("Signing to your account... 🔑🔑🔑")
	cfg := getConfig()

	req := request.NewRequest(new(http.Client))

	req.Headers = map[string]string{
		"Content-Type":    "application/json",
		"Accept-Encoding": "",
		"cookie":          cfg.Cookie,
		"Referer":         "https://leetcode.com/accounts/login/",
		"origin":          "https://leetcode.com",
	}

	return req
}

func getCSRFToken(req *request.Request) string {
	resp, err := req.Get(loginPageURL)
	if err != nil {
		log.Panicf("❌ Failed to get from %s: %s", loginPageURL, err)
	}

	cookies := resp.Cookies()

	for _, ck := range cookies {
		if ck.Name == "csrftoken" {
			return ck.Value
		}
	}

	panic("❌ Failed to find CSRF token in Cookies.")
}

func login(req *request.Request) error {
	resp, err := req.Post(loginPageURL)
	defer resp.Body.Close()
	return err
}
