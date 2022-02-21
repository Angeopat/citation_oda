package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_theme", unique = true)
    private int idTheme;

    @Column(name = "libelle")
    private String libelle;

    @ManyToMany(mappedBy = "theme", cascade = { CascadeType.ALL })
    List<Citation> uneCitation ;

    public int getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(int idTheme) {
        this.idTheme = idTheme;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Citation> getUneCitation() {
        return uneCitation;
    }

    public void setUneCitation(List<Citation> uneCitation) {
        this.uneCitation = uneCitation;
    }
}
