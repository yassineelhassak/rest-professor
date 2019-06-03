package com.yas.ghandour.restprofessor.dao;

import com.yas.ghandour.restprofessor.entities.Cours;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourRepository extends JpaRepository<Cours, Long> {

	/*public List<Cour> findByProfessorNumId (String numId);*/
	//@Query("SELECT cours FROM Cour c WHERE c.professor.id =:id")
	//List<Cours> findByProfessorId(Long id);
}
