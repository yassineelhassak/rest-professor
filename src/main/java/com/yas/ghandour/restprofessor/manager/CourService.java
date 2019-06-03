package com.yas.ghandour.restprofessor.manager;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.yas.ghandour.restprofessor.dto.CoursDTO;
import com.yas.ghandour.restprofessor.entities.Cours;
import com.yas.ghandour.restprofessor.dao.CourRepository;
import com.yas.ghandour.restprofessor.entities.Professor;
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

	public Cours getCoursById(Long id) {
		return courRepo.findById(id).get();
	}
	
	
	public Long addCours(CoursDTO coursDTO) {
		Cours mappedCours = coursMapper.asCours(coursDTO);
		return courRepo.save(mappedCours).getId();
	}

	public void updateCours(CoursDTO coursDTO) {
		Cours mappedCours = coursMapper.asCours(coursDTO);
		Optional<Professor> professorOptional = profRepo.findById(coursDTO.getProfessor().getId());
		if(professorOptional.isPresent()){
			courRepo.save(mappedCours.setProfessor(professorOptional.get()));
		}

	}

	public void deleteCours(Long id) {
		// TODO Auto-generated method stub
		courRepo.deleteById(id);
	}


	public List<CoursDTO> getAllCoursByProf(Long profId) {
		List coursDtoList = new ArrayList<CoursDTO>();
		courRepo.findByProfessorId(profId).forEach(coursDtoList::add);
		return coursDtoList;
	}
	
	
}
