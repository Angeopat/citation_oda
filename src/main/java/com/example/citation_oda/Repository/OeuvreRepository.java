package com.example.citation_oda.Repository;

import com.example.citation_oda.Model.Oeuvre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OeuvreRepository extends JpaRepository<Oeuvre, Integer> {
}
