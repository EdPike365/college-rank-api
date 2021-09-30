package com.edpike365.collegerankapi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Welcome to CollegeRankAPI!!!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello World!!!";
    }
}
