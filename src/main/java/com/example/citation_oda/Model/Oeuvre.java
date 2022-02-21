package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "oeuvre")
public class Oeuvre {
    @Column(name = "id_oeuvre")
    private int idOeuvre;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nom_oeuvre",unique = true)
    private String nomOeuvre;

    @Column(name = "date_parution")
    private Date dateParution;

    @Column(name = "maison_edition")
    private String maisonEdition;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "auteur_id_auteur", unique = true)
    private Auteur auteur;

    @OneToMany(mappedBy="oeuvre")
    private Set<Citation> citations;

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
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
