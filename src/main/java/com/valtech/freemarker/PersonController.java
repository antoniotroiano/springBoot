package com.valtech.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/listPerson"})
    public String listPerson() {
        return "listPerson";
    }

    @GetMapping({"/addPerson"})
    public String getInput() {
        return "addPerson";
    }

    @PostMapping("/addPerson")
    public String setInput(Person person, Model model){
        model.addAttribute("person", model);
        return "addPerson";
    }
}
