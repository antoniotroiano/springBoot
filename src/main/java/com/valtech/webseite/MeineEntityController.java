package com.valtech.webseite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/mvc-th")
public class MeineEntityController {

    private final MeineEntityRepository repo;

    @Autowired
    public MeineEntityController(MeineEntityRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public String addToListe(MeineEntity newEntity) {
        newEntity.setDatum(new Date());
        repo.save(newEntity);
        return "redirect:/mvc-th";
    }

    @GetMapping
    public String getListe(Model model) {
        model.addAttribute("entitiesListe", repo.findAll());
        return "MeineEntityWebseite";
    }
}
