package com.sproject.s_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        String viewName = getViewName();
        return viewName;
    }

    @RequestMapping("/test")
    public String test() {
        return "test.html";
    }

    private String getViewName() {
        return "index.html";
    }
}
