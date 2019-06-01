package com.yas.ghandour.restprofessor.controller;


import com.yas.ghandour.restprofessor.entities.Cour;
import com.yas.ghandour.restprofessor.manager.CourService;
import org.springframework.web.bind.annotation.*;

import com.yas.ghandour.restprofessor.entities.Professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("cours")
public class CourController {

	@Autowired
	private CourService courService;
	
	//Nok there is a problem with this one
	//@GetMapping("{profId}")
	//public List<Cour> getAllCoursByProf(@PathVariable Long profId){
	//		return courService.getAllCoursByProf(profId);
	//}
	
	@GetMapping("/{id}")
	public Cour getCourById(@PathVariable Long id) {
		return courService.getCoursById(id);
	}
	
	@PostMapping(value="/ajouter")
	public void addCour(@RequestBody Cour cour, @PathVariable Long profId) {
		
		courService.addCours(cour, profId);
		
		//cour.setProfessor(new Professor(profId));
		//courService.addCours(cour);
	}
	
	@PutMapping(value="/modifier")
	public void updateCour(@RequestBody Cour cour, @PathVariable Long profId) {
		cour.setProfessor(new Professor(profId));
		courService.updateCours(cour);
	}
	
	@DeleteMapping(value="/supprimer/{id}")
	public void deleteCour(@PathVariable Long id) {
		courService.deleteCours(id);
	}
	
	
}
