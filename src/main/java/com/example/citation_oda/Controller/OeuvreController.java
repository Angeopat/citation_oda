package com.example.citation_oda.Controller;

import com.example.citation_oda.Model.Oeuvre;
import com.example.citation_oda.Repository.OeuvreRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class OeuvreController {
    private OeuvreRepository oeuvreRepository;

    @GetMapping(path = "/oeuvre")
    public String getOeuvre(){
        return "createoeuvre";
    }

    @RequestMapping(value = "/addOeuvre", method = RequestMethod.POST)
    public String addOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre, BindingResult bindingResult, Model model) {
        model.addAttribute("oeuvre",oeuvre);
        oeuvre.setIdOeuvre(oeuvre.getIdOeuvre());
        oeuvre.setNomOeuvre(oeuvre.getNomOeuvre());
        oeuvre.setDateParution(oeuvre.getDateParution());
        oeuvre.setMaisonEdition(oeuvre.getMaisonEdition());
        oeuvreRepository.save(oeuvre);
        return "createoeuvre";

    }
}
