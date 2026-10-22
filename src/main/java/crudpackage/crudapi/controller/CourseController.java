package crudpackage.crudapi.controller;


import crudpackage.crudapi.dao.CourseDAO;
import crudpackage.crudapi.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseapi")
@CrossOrigin  // => frontend connection
public class CourseController {

    @Autowired
    private Courseservice courseservice;


    @PostMapping("/addcourse")
    public String CourseApi(@RequestBody CourseDAO courseDAO){
       return courseservice.CourseAddlogic(courseDAO);

    }

    @GetMapping("/viewCourse")
    public List<CourseDAO> Displayall(){
       return courseservice.Coursedisplayall();
    }
}
