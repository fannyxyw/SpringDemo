package com.ssy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value="/hello", method = GET)
public class HelloController {
    @RequestMapping(value = "/hello", method = GET)
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello Reader!");
        mv.setViewName("hello");
        return mv;
    }
}
