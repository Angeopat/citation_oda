package com.example.citation_oda.Service;

import com.example.citation_oda.Model.Oeuvre;
import com.example.citation_oda.Repository.OeuvreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OeuvreService {
    @Autowired
    OeuvreRepository oeuvreRepository;
    public Optional<Oeuvre> findOne(String nom_oeuvre){return  oeuvreRepository.findById(String.valueOf(nom_oeuvre));}
    public void save (Oeuvre oeuvre){oeuvreRepository.save(oeuvre);}
    public void update(Oeuvre oeuvre){oeuvre = oeuvreRepository.save(oeuvre);}
    public void delete(String nom_oeuvre){oeuvreRepository.deleteById(nom_oeuvre);}
    public List<Oeuvre> findAll(){return  oeuvreRepository.findAll();}}
