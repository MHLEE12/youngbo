package com.youngbo.yb_project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class PageController {

    @GetMapping("/")
    public String main() {
        return "/index";
    }

    @GetMapping("/introduce")
    public String introduce() {
        return "/introduce";
    }
}
