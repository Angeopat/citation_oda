package com.example.citation_oda.Controller;

import com.example.citation_oda.Model.Theme;
import com.example.citation_oda.Repository.ThemeRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ThemeController {
    private ThemeRepository themeRepository;

    @GetMapping(path = "/theme")
    public String getTheme(){
        return "createtheme";
    }

    @RequestMapping(value = "/addTheme", method = RequestMethod.POST)
    public String addTheme(@ModelAttribute("theme") Theme theme, BindingResult bindingResult, Model model) {
        model.addAttribute("theme",theme);
        theme.setIdTheme(theme.getIdTheme());
        theme.setLibelle(theme.getLibelle());
        themeRepository.save(theme);
        return "createtheme";

    }
}