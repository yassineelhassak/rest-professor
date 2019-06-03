package com.yas.ghandour.restprofessor.manager;



import java.util.List;

import com.yas.ghandour.restprofessor.dto.CoursDTO;
import com.yas.ghandour.restprofessor.entities.Cours;
import com.yas.ghandour.restprofessor.dao.CourRepository;
import com.yas.ghandour.restprofessor.mapper.CoursMapper;
import com.yas.ghandour.restprofessor.mapper.ProfessorMapper;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yas.ghandour.restprofessor.dao.ProfessorRepository;

@Service
public class CourService {

	@Autowired
	private CourRepository courRepo;
	
	@Autowired
	private ProfessorRepository profRepo;

	private CoursMapper coursMapper;

	public CourService() {
		this.coursMapper = Selma.mapper(CoursMapper.class);
	}
	
	/*public List<Cour> getCoursByProf(String profId) {
		// TODO Auto-generated method stub
		List<Cour> cour= new ArrayList<>();
		courRepo.findByProfessorNumId(profId).forEach(cour::add);
		return cour;
	}*/
	
	public Cours getCoursById(Long id) {
		return courRepo.findById(id).get();
	}
	
	
	public Long addCours(CoursDTO coursDTO) {
		Cours mappedCours = coursMapper.asCours(coursDTO);
		return courRepo.save(mappedCours).getId();
	}

	public void updateCours(Cours cour) {
		// TODO Auto-generated method stub
		courRepo.save(cour);
	}

	public void deleteCours(Long id) {
		// TODO Auto-generated method stub
		//courRepo.deleteById(id);
	}


	public List<Cours> getAllCoursByProf(Long profId) {
		return null;
		// TODO Auto-generated method stub
		//return courRepo.findByProfessorId(profId);
	}
	
	
}
