package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.CourseDTO;

import java.util.List;

public interface Courseservice {
    String CourseAddlogic(CourseDTO courseDTO);
    List<CourseDTO> Coursedisplayall();
}
