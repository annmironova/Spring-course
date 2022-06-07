package com.mironova.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println("hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model) {
        double res = 0;
        switch (action) {
            case "addition":
                res = a + b;
                break;
            case "subtraction":
                res = a - b;
                break;
            case "multiplication":
                res = a * b;
                break;
            case "division":
                res =  a / (double)b;
                break;
        }
        model.addAttribute("result", res);
        return "/first/calculator";
    }
}











