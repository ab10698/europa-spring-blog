package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int addNumber(@PathVariable int number, @PathVariable int number2) {
        System.out.println("Inside addNumber()");
        return number + number2;
    }

    @RequestMapping(path = "/subtract/{number}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int subtractNumber(@PathVariable int number, @PathVariable int number2) {
        System.out.println("Inside subtractNumber()");
        return number2 - number;
    }

    @RequestMapping(path = "/multiply/{number}/with/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiplyNumber(@PathVariable int number, @PathVariable int number2) {
        System.out.println("Inside multiplyNumber()");
        return number * number2;
    }

    @RequestMapping(path = "/divide/{number}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int divideNumber(@PathVariable int number, @PathVariable int number2) {
        System.out.println("Inside divideNumber()");
        return number / number2;
    }
}
