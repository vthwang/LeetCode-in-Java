package main

import (
	"bytes"
	"github.com/TingSyuanWang/LeetCode-in-Java/MarkdownGenerator/libs"
	"html/template"
	"io/ioutil"
	"log"
	"os"
)

func buildReadme() {
	log.Println("README.md is updating... 🐎🐎🐎")

	lc := newLeetCode()

	makeReadmeFile(lc)

	makeMyFavoriteFile(lc)

	log.Println("README.md has been updated. 🚀🚀🚀")
}

func makeReadmeFile(lc *leetcode) {
	file := "README.md"
	err := os.Remove(file)
	if err != nil {
		log.Fatal("❌ Failed to remove README.md file: ", err)
	}

	var b bytes.Buffer

	tmpl := template.Must(template.New("readme").Parse(readTMPL("template.markdown")))

	err = tmpl.Execute(&b, lc)
	if err != nil {
		log.Fatal(err)
	}

	// Save README.md
	libs.Write(file, string(b.Bytes()))
}

func makeMyFavoriteFile(lc *leetcode) {
	file := "Favorite.md"
	err := os.Remove(file)
	if err != nil {
		log.Fatal("❌ Couldn't remove Favorite.md file: ", err)
	}

	var b bytes.Buffer

	tmpl := template.Must(template.New("favorite").Parse(readTMPL("favorite.markdown")))

	err = tmpl.Execute(&b, lc)
	if err != nil {
		log.Fatal(err)
	}

	// Save Favorite.md
	libs.Write(file, string(b.Bytes()))
}

func readTMPL(path string) string {
	file, err := os.Open(path)
	if err != nil {
		log.Fatal(err)
	}
	defer file.Close()

	data, err := ioutil.ReadAll(file)
	if err != nil {
		log.Fatal(err)
	}

	return string(data)
}
