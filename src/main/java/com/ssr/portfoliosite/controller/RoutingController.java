package com.ssr.portfoliosite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingController {

    @RequestMapping(value = "/**")///{path:[^\.]*}
    public String pageNotFoundHandler(){
        return "redirect:/api/home";
    }
}
