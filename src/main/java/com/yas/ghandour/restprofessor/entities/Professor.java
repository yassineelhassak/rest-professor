package com.yas.ghandour.restprofessor.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Professor implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private Integer niveau;

	@OneToMany(fetch= FetchType.LAZY, cascade=CascadeType.PERSIST)
	private Set<Cours> cours;

	public Long getId() {
		return id;
	}

	public Professor setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNom() {
		return nom;
	}

	public Professor setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public String getPrenom() {
		return prenom;
	}

	public Professor setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public String getTel() {
		return tel;
	}

	public Professor setTel(String tel) {
		this.tel = tel;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Professor setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public Professor setNiveau(Integer niveau) {
		this.niveau = niveau;
		return this;
	}

	public Set<Cours> getCours() {
		return cours;
	}

	public Professor setCours(Set<Cours> cours) {
		this.cours = cours;
		return this;
	}
}
