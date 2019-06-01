package com.yas.ghandour.restprofessor.controller;

import java.util.List;

import com.yas.ghandour.restprofessor.manager.ProfessorService;
import com.yas.ghandour.restprofessor.entities.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professor;
	
	@GetMapping("/all")
	public List<Professor> getAllProfessors(){
		return professor.getAllProfessors();
	}
	
	@GetMapping("/{id}")
	public Professor getProfessor(@PathVariable Long id) {
		return professor.getById(id);
	}
	
	@PostMapping
	public void addProfesor(@RequestBody Professor prof) {
		professor.addProfessor(prof);
	}
	
	@PutMapping(value="{id}")
	public void putProfesor(@RequestBody Professor prof, @PathVariable String id) {
		professor.modifyProfessor(prof, id);
	}
	
	@DeleteMapping(value="{id}")
	public void deleteProfessor(@PathVariable Long	 id) {
		professor.deleteById(id);
	}
	
	
}
