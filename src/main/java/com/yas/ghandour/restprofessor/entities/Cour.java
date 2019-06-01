package com.yas.ghandour.restprofessor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cour {

	@Id
	private String Libelle;
	private int NombreHeure;
	
	@ManyToOne
	private Professor professor;

	
	public Cour() {
		
	}

	

	public Cour(String libelle, int nombreHeure, Professor professor) {
		super();
		Libelle = libelle;
		NombreHeure = nombreHeure;
		this.professor = professor;
	}



	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public int getNombreHeure() {
		return NombreHeure;
	}

	public void setNombreHeure(int nombreHeure) {
		NombreHeure = nombreHeure;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
}
