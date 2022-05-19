package main

import "log"

func main() {
	log.Printf("Hi, %s. Welcome to Leetcode generator. 🎉 \n", getConfig().Username)

	cli := new(CLI)
	cli.Run()
}
