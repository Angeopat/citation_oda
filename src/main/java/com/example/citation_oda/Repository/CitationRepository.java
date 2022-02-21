package com.example.citation_oda.Repository;

import com.example.citation_oda.Model.Citation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitationRepository extends JpaRepository<Citation, Integer> {
}
