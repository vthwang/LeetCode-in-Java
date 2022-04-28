package libs

import (
	"io/ioutil"
	"log"
	"os"
)

func Exist(filename string) bool {
	if _, err := os.Stat(filename); err != nil {
		return false
	}
	return true
}

func Write(path, content string) {
	err := ioutil.WriteFile(path, []byte(content), 0755)
	if err != nil {
		log.Fatal(err)
	}
}

func Read(path string) []byte {
	file, err := os.Open(path)
	if err != nil {
		panic(err)
	}
	defer file.Close()

	data, err := ioutil.ReadAll(file)
	return data
}
