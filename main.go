package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
)

type MyStruct struct {
	Type  string `json:"type"`
	Value string `json:"values"`
}

func main() {
	//Simple Employee JSON object which we will parse
	empJSON, _ := ioutil.ReadFile("2.json")

	// Declared an empty interface
	var result []MyStruct

	// Unmarshal or Decode the JSON to the interface.
	json.Unmarshal(empJSON, &result)

	fmt.Println(result)

	for i := 0; i < len(result); i++ {
		if result[i].Value == "ccc" {
			fmt.Println(result[i].Type)
			break
		}
	}
}
