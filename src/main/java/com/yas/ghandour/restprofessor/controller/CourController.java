package com.yas.ghandour.restprofessor.controller;


import com.yas.ghandour.restprofessor.entities.Cour;
import com.yas.ghandour.restprofessor.manager.CourService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yas.ghandour.restprofessor.entities.Professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class CourController {

	@Autowired
	private CourService courService;
	
	//Nok there is a problem with this one
	@RequestMapping("/professors/{profId}/cours")
	public List<Cour> getAllCoursByProf(@PathVariable String profId){
			return courService.getAllCoursByProf(profId);
	}
	
	@RequestMapping("/professors/{profId}/cours/{id}")
	public Cour getCourById(@PathVariable String id) {
		return courService.getCoursById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/professors/{profId}/cours")
	public void addCour(@RequestBody Cour cour, @PathVariable String profId) {
		
		courService.addCours(cour, profId);
		
		//cour.setProfessor(new Professor(profId));
		//courService.addCours(cour);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/professors/{profId}/cours/{id}")
	public void updateCour(@RequestBody Cour cour, @PathVariable String profId) {
		cour.setProfessor(new Professor(profId));
		courService.updateCours(cour);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/professors/{profId/cours/{id}")
	public void deleteCour(@PathVariable String id) {
		courService.deleteCours(id);
	}
	
	
}
