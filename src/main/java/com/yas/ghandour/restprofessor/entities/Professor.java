package com.yas.ghandour.restprofessor.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Professor {

	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private int niveau;

	@OneToMany(fetch= FetchType.LAZY, cascade=CascadeType.PERSIST)
	private List<Cours> cours;
	
	public Professor() {
		
	}
	
	public Professor(Long id) {
		this.id = id;

	}
	
	public Professor(Long id,String nom, String prenom, String tel, String email, int niveau) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.niveau = niveau;
	}

	public Professor setId(Long id) {
		this.id = id;
		return this;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public Professor setCours(List<Cours> cours) {
		this.cours = cours;
		return this;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	
}
