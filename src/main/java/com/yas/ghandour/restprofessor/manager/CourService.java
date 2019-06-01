package com.yas.ghandour.restprofessor.manager;



import java.util.List;

import com.yas.ghandour.restprofessor.entities.Cour;
import com.yas.ghandour.restprofessor.dao.CourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.ghandour.restprofessor.dao.ProfessorRepository;

@Service
public class CourService {

	@Autowired
	private CourRepository courRepo;
	
	@Autowired
	private ProfessorRepository profRepo;

	
	/*public List<Cour> getCoursByProf(String profId) {
		// TODO Auto-generated method stub
		List<Cour> cour= new ArrayList<>();
		courRepo.findByProfessorNumId(profId).forEach(cour::add);
		return cour;
	}*/
	
	public Cour getCoursById(Long id) {
		return courRepo.findById(id).get();
	}
	
	
	public Cour addCours(Cour cour, Long profId) {
		// TODO Auto-generated method stub
		//courRepo.save(cour);
		return profRepo.findById(profId).map(prof -> {cour.setProfessor(prof);
		return courRepo.save(cour);
		}).get();
	}

	public void updateCours(Cour cour) {
		// TODO Auto-generated method stub
		courRepo.save(cour);
	}

	public void deleteCours(Long id) {
		// TODO Auto-generated method stub
		//courRepo.deleteById(id);
	}


	public List<Cour> getAllCoursByProf(Long profId) {
		// TODO Auto-generated method stub
		return courRepo.findByProfessorId(profId);
	}
	
	
}
