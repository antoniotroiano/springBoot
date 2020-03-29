package com.valtech.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloResource {
    private final DataRepository repository;

    public HelloResource(DataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        String appName = "Erste Seite";
        model.addAttribute("appName", appName);
        return "home";
    }

    @GetMapping("/create")
    public void create() {
        Data data = new Data();
        data.setName("Toni");
        repository.save(data);
    }

    @GetMapping("/get")
    public List<Data> getAll() {
        List<Data> returns = new ArrayList<>();
        repository.findAll().forEach(returns::add);
        return returns;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
