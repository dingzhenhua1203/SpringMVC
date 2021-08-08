package com.starry.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/first")
    public String firstDemo(Model model) {
        model.addAttribute("msg","my first mvc annotation");
        return "first";
    }
}
