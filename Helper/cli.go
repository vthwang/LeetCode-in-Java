package main

import (
	"flag"
	"fmt"
	"log"

	"os"
)

const (
	USAGE = `Usage:
	leetcodeHelper readme
		Generate README.md
	leetcodeHelper prepare -number N
		Generate Number N's Question Folder`
)

type CLI struct{}

func (c *CLI) printUsage() {
	fmt.Println(USAGE)
}

func (c *CLI) checkArgs() {
	if len(os.Args) < 2 {
		c.printUsage()
		os.Exit(1)
	}
}

func (c *CLI) Run() {
	c.checkArgs()

	readmeCmd := flag.NewFlagSet("readme", flag.ExitOnError)

	prepareCmd := flag.NewFlagSet("prepare", flag.ExitOnError)
	problemNumber := prepareCmd.Int("number", 0, "Type in LeetCode Question Number:")

	switch os.Args[1] {
	case "readme":
		err := readmeCmd.Parse(os.Args[2:])
		check(err)
		buildReadme()
	case "prepare":
		err := prepareCmd.Parse(os.Args[2:])
		check(err)
		buildProblemDir(*problemNumber)
	default:
		c.printUsage()
		os.Exit(1)
	}
}

func check(err error) {
	if err != nil {
		log.Panic(err)
	}
}
