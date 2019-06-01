package com.yas.ghandour.restprofessor.controller;

import java.util.List;

import com.yas.ghandour.restprofessor.manager.ProfessorService;
import com.yas.ghandour.restprofessor.entities.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professor;
	
	@RequestMapping("/professors")
	public List<Professor> getAllProfessors(){
		return professor.getAllProfessors();
	}
	
	@RequestMapping("/professors/{id}")
	public Professor getProfessor(@PathVariable String id) {
		return professor.getById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/professors")
	public void addProfesor(@RequestBody Professor prof) {
		professor.addProfessor(prof);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/professors/{id}")
	public void putProfesor(@RequestBody Professor prof, @PathVariable String id) {
		professor.modifyProfessor(prof, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/professors/{id}")
	public void deleteProfessor(@PathVariable String id) {
		professor.deleteById(id);
	}
	
	
}
