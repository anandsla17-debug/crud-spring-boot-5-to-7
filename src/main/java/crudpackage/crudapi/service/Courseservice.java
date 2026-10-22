package crudpackage.crudapi.service;

import crudpackage.crudapi.dao.CourseDAO;

import java.util.List;

public interface Courseservice {
    String CourseAddlogic(CourseDAO courseDAO);
    List<CourseDAO> Coursedisplayall();
}
