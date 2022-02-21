package com.example.citation_oda.Service;


import com.example.citation_oda.Model.Citation;
import com.example.citation_oda.Repository.CitationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CitationService {
    @Autowired
    CitationRepository citationRepository;
    public Optional<Citation> findOne(Integer id_citation){return  citationRepository.findById(id_citation);}
    public void save (Citation citation){
        citationRepository.save(citation);
    }
    public void update(Citation citation){
        citation = citationRepository.save(citation);
    }
    public void delete(Integer id_citation){citationRepository.deleteById(id_citation);}
    public List<Citation> findAll(){
        return  citationRepository.findAll();
}

}
