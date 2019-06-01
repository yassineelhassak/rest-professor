package com.yas.ghandour.restprofessor.dao;

import com.yas.ghandour.restprofessor.entities.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {

}
