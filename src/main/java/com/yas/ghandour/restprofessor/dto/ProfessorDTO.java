package com.yas.ghandour.restprofessor.dto;

import com.yas.ghandour.restprofessor.entities.Cours;

import java.util.List;

/**
 * Created by mac on 6/3/19.
 */
public class ProfessorDTO {

    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    private Integer niveau;

    private List<CoursDTO> cours;

    public Long getId() {
        return id;
    }

    public ProfessorDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ProfessorDTO setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public ProfessorDTO setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public ProfessorDTO setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ProfessorDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public ProfessorDTO setNiveau(Integer niveau) {
        this.niveau = niveau;
        return this;
    }

    public List<CoursDTO> getCours() {
        return cours;
    }

    public ProfessorDTO setCours(List<CoursDTO> cours) {
        this.cours = cours;
        return this;
    }
}
