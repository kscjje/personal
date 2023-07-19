package com.custom.v1.cmm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteMenuController {
	@GetMapping("/test")
    public String test() {
        return "test";
    }
}
