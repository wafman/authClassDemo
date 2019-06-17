package com.fritts.java401d4.auth.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CodeFellowshipController {

    @GetMapping("/codefellowship")
    public String getCodeFellowship(){
        return "Code Fellowship";
    }
}
