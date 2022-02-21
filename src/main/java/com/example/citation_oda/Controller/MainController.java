package com.example.citation_oda.Controller;

import com.example.citation_oda.Controller.*;
import com.example.citation_oda.Model.*;
import com.example.citation_oda.Repository.*;
import com.example.citation_oda.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private AuteurRepository auteurRepository;
    private AuteurService auteurService;
    AuteurService suppauteurservice;
     AuteurService suppauteur;
@Autowired
    private CitationRepository citationRepository;
    private CitationService citationService;
    private CitationService suppcitationservice;
    private CitationService suppcitation;
@Autowired
    private OeuvreRepository oeuvreRepository;
    private OeuvreService oeuvreService;
    private OeuvreService suppoeuvreservice;
    private OeuvreService suppoeuvre;
@Autowired
    private ThemeRepository themeRepository;
    private ThemeService themeService;
    private ThemeService suppthemeservice;
    private ThemeService supptheme;
//Différentes routes pour les listes
    @GetMapping("/listeauteur")
    public String showListeAuteur(ModelMap modelMap){
        List<Auteur> listeauteur =  auteurService.findAll();
        modelMap.addAttribute("auteur","un_test");
        modelMap.addAttribute("auteur",listeauteur);
        return "listeauteur";
    }

    @GetMapping("/listecitation")
    public String showListeCitation(ModelMap modelMap){
        List<Citation> listecitation =  citationService.findAll();
        modelMap.addAttribute("citation","une_citation");
        modelMap.addAttribute("citation",listecitation);
        return "listecitation";
    }

    @GetMapping("/listeoeuvre")
    public String showListeOeuvre(ModelMap modelMap){
        List<Oeuvre> listeoeuvre =  oeuvreService.findAll();
        modelMap.addAttribute("oeuvre","une_oeuvre");
        modelMap.addAttribute("oeuvre",listeoeuvre);
        return "listeoeuvre";
    }

    @GetMapping("/listetheme")
    public String showListeTheme(ModelMap modelMap){
        List<Theme> listetheme =  themeService.findAll();
        modelMap.addAttribute("theme","un_theme");
        modelMap.addAttribute("theme",listetheme);
        return "listetheme";
    }

//Différentes routes pour les suppressions
    @GetMapping("/suppauteur")
    public String suppauteur(ModelMap modelMap, @RequestParam Integer id){
        suppauteurservice.delete(suppauteur.findOne(id).get().getIdAuteur());
        return "listeauteur";
    }
    @ResponseBody
    @GetMapping("/suppcitation")
    public String suppcitation(ModelMap modelMap, @RequestParam Integer id){
        suppcitationservice.delete(suppcitation.findOne(id).get().getIdCitation());
        return "listeauteur";
    }

    @GetMapping("/suppoeuvre")
    public String suppoeuvre(ModelMap modelMap, @RequestParam String id){
        suppoeuvreservice.delete(suppoeuvre.findOne(id).get().getNomOeuvre());
        return "listeoeuvre";
    }

    @GetMapping("/supptheme")
    public String supptheme(ModelMap modelMap, @RequestParam Integer id){
        suppthemeservice.delete(supptheme.findOne(id).get().getIdTheme());
        return "listetheme";
    }

    //Différentes routes pour les ajouts
    @PostMapping(value = "/addAuteur")
    @ResponseBody
    public String addAuteur(@ModelAttribute("auteur") Auteur auteur, BindingResult bindingResult, Model model) {
        model.addAttribute("auteur", auteur);
        auteurRepository.save(auteur);
        return ("L'auteur a été ajouté avec succès");

    }

    @PostMapping(value = "/addCitation")
    @ResponseBody
    public String addCitation(@ModelAttribute("citation") Citation citation, BindingResult bindingResult, Model model) {
        model.addAttribute("citation", citation);
        citationRepository.save(citation);
        return ("La citation a été ajoutée avec succès");

    }

    @PostMapping(value = "/addOeuvre")
    @ResponseBody
    public String addOeuvre(@ModelAttribute("oeuvre") Oeuvre oeuvre, BindingResult bindingResult, Model model) {
        model.addAttribute("oeuvre", oeuvre);
        oeuvreRepository.save(oeuvre);
        return ("L'oeuvre a été ajoutée avec succès");

    }

    @PostMapping(value = "/addTheme")
    @ResponseBody
    public String addTheme(@ModelAttribute("theme") Theme theme, BindingResult bindingResult, Model model) {
        model.addAttribute("theme", theme);
        themeRepository.save(theme);
        return ("Le thème a été ajouté avec succès");

    }

}
