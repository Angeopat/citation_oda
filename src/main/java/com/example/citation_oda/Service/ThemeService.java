package com.example.citation_oda.Service;

import com.example.citation_oda.Model.Theme;
import com.example.citation_oda.Repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ThemeService {
    @Autowired
    ThemeRepository themeRepository;
    public Optional<Theme> findOne(Integer id_theme){return  themeRepository.findById(id_theme);}
    public void save (Theme theme){themeRepository.save(theme);}
    public List<Theme> findAll(){
        return  themeRepository.findAll();
}}
