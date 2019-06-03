package com.yas.ghandour.restprofessor.mapper;

import com.yas.ghandour.restprofessor.dto.CoursDTO;
import com.yas.ghandour.restprofessor.entities.Cours;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

/**
 * Created by mac on 6/3/19.
 */
@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface CoursMapper {

    CoursDTO asCoursDto(Cours in);

    Cours asCours(CoursDTO in);

}
