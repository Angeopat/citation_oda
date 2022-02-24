package com.example.citation_oda.Service;

import com.example.citation_oda.Model.Auteur;
import com.example.citation_oda.Repository.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AuteurService {
    @Autowired
    AuteurRepository auteurRepository;
    public Optional<Auteur> findOne(Integer id_auteur){
        return  auteurRepository.findById(id_auteur);
    }

    public void save (Auteur auteur){auteurRepository.save(auteur);}
    public List<Auteur> findAll(){
        return  auteurRepository.findAll();
}}
