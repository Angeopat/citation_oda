package com.example.citation_oda.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "citation")
public class Citation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_citation", unique = true)
    private int idCitation;

    @Column(name = "lacitation")
    private String laCitation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oeuvre_id_oeuvre", unique = true)
    private Oeuvre oeuvre;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "citation_as_theme",
            joinColumns = @JoinColumn(name = "citation_id_citation"))
    private List<Theme> theme = new ArrayList<>();

    public List<Theme> getTheme() {
        return theme;
    }

    public void setTheme(List<Theme> theme) {
        this.theme = theme;
    }


    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public void setOeuvre(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
    }

    public int getIdCitation() {
        return idCitation;
    }

    public void setIdCitation(int idCitation) {
        this.idCitation = idCitation;
    }

    public String getLaCitation() {
        return laCitation;
    }

    public void setLaCitation(String laCitation) {
        this.laCitation = laCitation;
    }


}