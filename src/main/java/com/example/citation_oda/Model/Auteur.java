package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auteur")
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auteur", unique = true )
    private int idAuteur;

    @Column(name = "nom_auteur")
    private String nomAuteur;

    @Column(name = "prenoms")
    private String prenoms;

    @OneToMany(mappedBy="auteur")
    private Set<Oeuvre> oeuvre;

    public Auteur() {
    }

    public int getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(int idAuteur) {
        this.idAuteur = idAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public Set<Oeuvre> getOeuvre() {
        return oeuvre;
    }

    public void setOeuvre(Set<Oeuvre> oeuvre) {
        this.oeuvre = oeuvre;
    }
}