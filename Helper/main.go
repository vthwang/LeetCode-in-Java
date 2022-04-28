package main

import "log"

func main() {
	log.Printf("Hi, %s. Welcome to leetcode generator.\n", getConfig().Username)

	cli := new(CLI)
	cli.Run()
}
