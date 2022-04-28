package main

import (
	"log"

	"github.com/BurntSushi/toml"
)

const (
	configTOML = "config.toml"
)

type config struct {
	Username string
	Cookie   string
}

func getConfig() *config {
	cfg := new(config)

	if _, err := toml.DecodeFile(configTOML, &cfg); err != nil {
		log.Panicf(err.Error())
	}

	//log.Printf("Get config: %s", cfg)

	return cfg
}
