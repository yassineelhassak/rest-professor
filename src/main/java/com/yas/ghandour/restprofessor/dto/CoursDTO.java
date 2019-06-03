package com.yas.ghandour.restprofessor.dto;

/**
 * Created by mac on 6/3/19.
 */
public class CoursDTO {

    private Long id;
    private String libelle;
    private int nombreHeure;
    private ProfessorDTO professor;

    public Long getId() {
        return id;
    }

    public CoursDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public CoursDTO setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public int getNombreHeure() {
        return nombreHeure;
    }

    public CoursDTO setNombreHeure(int nombreHeure) {
        this.nombreHeure = nombreHeure;
        return this;
    }

    public ProfessorDTO getProfessor() {
        return professor;
    }

    public CoursDTO setProfessor(ProfessorDTO professor) {
        this.professor = professor;
        return this;
    }
}
