package com.example.chucknorrisjokes.controllers;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @GetMapping("/")
    public String addJoke(ModelMap modelMap){

    modelMap.addAttribute("joke", quotes.getRandomQuote());
        return "add";
    }
}

