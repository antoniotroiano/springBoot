package com.valtech.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {

    private static List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("Antonio", "Troiano"));
        persons.add(new Person("Christof", "Seltmann"));
    }

    @GetMapping({"/listPerson"})
    public String listPerson(Model model) {
        model.addAttribute("persons", persons);
        return "listPerson";
    }

    @GetMapping({"/addPerson"})
    public String addPerson(Model model) {
        model.addAttribute("persons", persons);
        return "addPerson";
    }

    @PostMapping("/addPerson")
    public String addSave(@RequestParam(value="vorname", required = false) String vorname,
                          @RequestParam(value="nachname", required = false) String nachname) {

        Person newPerson = new Person(vorname, nachname);
        persons.add(newPerson);
        return "redirect:/listPerson";
    }
}
