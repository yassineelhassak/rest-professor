package com.yas.ghandour.restprofessor.manager;

import java.util.List;
import java.util.ArrayList;

import com.yas.ghandour.restprofessor.dao.ProfessorRepository;
import com.yas.ghandour.restprofessor.entities.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepo;
	
	public List<Professor> getAllProfessors() {
		List<Professor> professors= new ArrayList<>();
		professorRepo.findAll().forEach(professors::add);
		return professors;
	}
	
	public Professor getById(String id) {
		return professorRepo.findById(id).get();
	}
	
	public void addProfessor(Professor professor) {
		professorRepo.save(professor);
	}

	public void modifyProfessor(Professor prof, String id) {
		professorRepo.save(prof);
	}

	public void deleteById(String id) {
		professorRepo.deleteById(id);
	}
}
