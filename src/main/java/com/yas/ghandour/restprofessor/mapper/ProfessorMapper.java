package com.yas.ghandour.restprofessor.mapper;

import com.yas.ghandour.restprofessor.dto.ProfessorDTO;
import com.yas.ghandour.restprofessor.entities.Professor;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

/**
 * Created by mac on 6/3/19.
 */
@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface ProfessorMapper {

    ProfessorDTO asProfessorDto(Professor in);

    Professor asCours(ProfessorDTO in);
}
