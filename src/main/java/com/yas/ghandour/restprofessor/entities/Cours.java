package com.yas.ghandour.restprofessor.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Cours implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	private String libelle;
	private int nombreHeure;
	
	@ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.PERSIST)
	private Professor professor;

	
	public Cours() {
		
	}

	public Long getId() {
		return id;
	}

	public Cours setId(Long id) {
		this.id = id;
		return this;
	}

	public String getLibelle() {
		return libelle;
	}

	public Cours setLibelle(String libelle) {
		this.libelle = libelle;
		return this;
	}

	public int getNombreHeure() {
		return nombreHeure;
	}

	public Cours setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
		return this;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Cours setProfessor(Professor professor) {
		this.professor = professor;
		return this;
	}
}
