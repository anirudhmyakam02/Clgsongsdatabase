package com.data.clgsongs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    @RequestMapping(value = "/{path:[^\\.]*}") // Matches paths without dots
    public String forward() {
        return "forward:/index.html";
    }
}
