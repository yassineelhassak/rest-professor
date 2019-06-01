package com.yas.ghandour.restprofessor.dao;

import com.yas.ghandour.restprofessor.entities.Cour;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourRepository extends JpaRepository<Cour, Long> {

	/*public List<Cour> findByProfessorNumId (String numId);*/
	@Query("FROM Cour c WHERE c.professor.id =:id")
	List<Cour> findByProfessorId(Long id);
}
