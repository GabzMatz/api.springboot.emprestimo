package com.facens.emprestimo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class NotebookControllers {



    @GetMapping
    public String hello() {
        return "Hello World";
    }


}
