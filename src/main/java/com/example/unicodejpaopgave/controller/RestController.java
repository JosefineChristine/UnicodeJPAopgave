package com.example.unicodejpaopgave.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("")
public class RestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }
    //Step2: der står unicode=97 char=a i browseren

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }


}



