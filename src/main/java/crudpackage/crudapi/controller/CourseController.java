package crudpackage.crudapi.controller;


import crudpackage.crudapi.dto.CourseDTO;
import crudpackage.crudapi.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseapi")
@CrossOrigin  // => frontend connection
public class CourseController {

    @Autowired
    private Courseservice courseservice;


    @PostMapping("/addcourse")
    public String CourseApi(@RequestBody CourseDTO courseDTO){
       return courseservice.CourseAddlogic(courseDTO);

    }

    @GetMapping("/viewCourse")
    public List<CourseDTO> Displayall(){
       return courseservice.Coursedisplayall();
    }


    @PutMapping("/updatecourse")
    public ResponseEntity<String> updatecourseapi( @RequestBody CourseDTO courseDTO){
        String response=courseservice.Updatecouselogic(courseDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deletecourse/{studentid}")
    public  ResponseEntity<String> Deletecourseapi(@PathVariable(name = "studentid") int studentid){
        String response=courseservice.Deletestudentlogic(studentid);
        return  ResponseEntity.ok(response);
    }
}
