package com.example.citation_oda.Controller;

import com.example.citation_oda.Model.Citation;
import com.example.citation_oda.Repository.CitationRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CitationController {
    private CitationRepository citationRepository;

    @GetMapping(path = "/citation")
    public String getCitation(){
        return "createcitation";
    }

    @RequestMapping(value = "/addCitation", method = RequestMethod.POST)
    public String addCitation(@ModelAttribute("citation")Citation citation, BindingResult bindingResult, Model model) {
        model.addAttribute("citation",citation);
        citation.setIdCitation(citation.getIdCitation());
        citation.setLaCitation(citation.getLaCitation());
        citationRepository.save(citation);
        return "createcitation";

    }
}
