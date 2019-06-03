package com.yas.ghandour.restprofessor.dao;

import com.yas.ghandour.restprofessor.entities.Cours;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CourRepository extends JpaRepository<Cours, Long> {

	/*public List<Cour> findByProfessorNumId (String numId);*/
	@Query("SELECT c FROM Cours c WHERE c.professor.id =:id")
    Set<Cours> findByProfessorId(@Param("id") Long id);
}
