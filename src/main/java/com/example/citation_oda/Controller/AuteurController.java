package com.example.citation_oda.Controller;

import com.example.citation_oda.Model.Auteur;
import com.example.citation_oda.Repository.AuteurRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AuteurController {
    private AuteurRepository auteurRepository;

    @GetMapping(path = "/auteur")
    public String getAuteur(){
        return "createauteur";
    }

    @RequestMapping(value = "/addAuteur", method = RequestMethod.POST)
    public String addAuteur(@ModelAttribute("auteur") Auteur auteur, BindingResult bindingResult, Model model) {
        model.addAttribute("auteur",auteur);
        auteur.setIdAuteur(auteur.getIdAuteur());
        auteur.setNomAuteur(auteur.getNomAuteur());
        auteur.setPrenoms(auteur.getPrenoms());
        auteurRepository.save(auteur);
        return "createauteur";

    }
    public void delete(Integer id_auteur){
        auteurRepository.deleteById(id_auteur);
    }

}
