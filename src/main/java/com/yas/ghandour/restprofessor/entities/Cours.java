package com.yas.ghandour.restprofessor.entities;

import javax.persistence.*;


@Entity
public class Cours {

	@Id
	@GeneratedValue
	private Long id;

	private String libelle;
	private int nombreHeure;
	
	@ManyToOne(fetch= FetchType.LAZY, cascade=CascadeType.PERSIST)
	private Professor professor;

	
	public Cours() {
		
	}

	

	public Cours(String libelle, int nombreHeure, Professor professor) {
		super();
		this.libelle = libelle;
		this.nombreHeure = nombreHeure;
		this.professor = professor;
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

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNombreHeure() {
		return nombreHeure;
	}

	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
}
