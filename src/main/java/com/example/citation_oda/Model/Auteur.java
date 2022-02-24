package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "oeuvre_as_many_auteur",
            joinColumns = @JoinColumn(name = "auteur_id_auteur"))
    private List<Oeuvre> oeuvres = new ArrayList<>();

    public List<Oeuvre> getOeuvres() {
        return oeuvres;
    }

    public void setOeuvres(List<Oeuvre> oeuvres) {
        this.oeuvres = oeuvres;
    }

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

}