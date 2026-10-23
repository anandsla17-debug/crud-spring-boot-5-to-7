package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.CourseDTO;

import java.util.List;

public interface Courseservice {
   public String CourseAddlogic(CourseDTO courseDTO);
  public  List<CourseDTO> Coursedisplayall();
    public String Updatecouselogic(CourseDTO courseDTO);
    public String Deletestudentlogic(int studentid);
}
