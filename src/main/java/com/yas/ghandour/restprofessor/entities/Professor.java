package com.yas.ghandour.restprofessor.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id
	private String Id;
	private String Nom;
	private String Prenom;
	private String Tel;
	private String Email;
	private int Niveau;
	
	
	public Professor() {
		
	}
	
	public Professor(String id) {
		Id = id;

	}
	
	public Professor(String id,String nom, String prenom, String tel, String email, int niveau) {
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Tel = tel;
		Email = email;
		Niveau = niveau;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getId() {
		return Id;
	}
	public void setNumId(String id) {
		Id = id;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getNiveau() {
		return Niveau;
	}
	public void setNiveau(int niveau) {
		Niveau = niveau;
	}
	
	
}
