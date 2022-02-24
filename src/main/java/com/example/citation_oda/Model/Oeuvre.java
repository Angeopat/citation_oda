package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "oeuvre")
public class Oeuvre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oeuvre")
    private int idOeuvre;

    @Column(name = "nom_oeuvre",unique = true)
    private String nomOeuvre;

    @Column(name = "date_parution")
    private Date dateParution;

    @Column(name = "maison_edition")
    private String maisonEdition;



    @ManyToMany(mappedBy = "oeuvres", cascade = { CascadeType.ALL })
    List<Auteur> unauteur ;

    public List<Auteur> getUnauteur() {
        return unauteur;
    }

    public void setUnauteur(List<Auteur> unauteur) {
        this.unauteur = unauteur;
    }


    public int getIdOeuvre() {
        return idOeuvre;
    }

    public void setIdOeuvre(int idOeuvre) {
        this.idOeuvre = idOeuvre;
    }

    public String getNomOeuvre() {
        return nomOeuvre;
    }

    public void setNomOeuvre(String nomOeuvre) {
        this.nomOeuvre = nomOeuvre;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }


}
