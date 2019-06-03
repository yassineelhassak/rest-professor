package com.yas.ghandour.restprofessor.controller;


import com.yas.ghandour.restprofessor.dto.CoursDTO;
import com.yas.ghandour.restprofessor.entities.Cours;
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
	@GetMapping("{profId}")
	public List<Cours> getAllCoursByProf(@PathVariable Long profId){
			return courService.getAllCoursByProf(profId);
	}
	
	@GetMapping("/{id}")
	public Cours getCourById(@PathVariable Long id) {
		return courService.getCoursById(id);
	}
	
	@PostMapping
	public Long addCour(@RequestBody CoursDTO coursDTO) {
		
		return courService.addCours(coursDTO);
	}
	
	@PutMapping
	public void updateCour(@RequestBody Cours cour, @PathVariable Long profId) {
		cour.setProfessor(new Professor(profId));
		courService.updateCours(cour);
	}
	
	@DeleteMapping(value="{id}")
	public void deleteCour(@PathVariable Long id) {
		courService.deleteCours(id);
	}
	
	
}
