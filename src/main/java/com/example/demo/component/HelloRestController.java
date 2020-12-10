package com.example.demo.component;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloRestController {

    @RequestMapping(value="/demo",method=RequestMethod.GET)
    @ResponseBody
    public String helloworld(){
        return "hello world i am jitendra";
    }

}