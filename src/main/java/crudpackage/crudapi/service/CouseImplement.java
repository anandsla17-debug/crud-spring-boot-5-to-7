package crudpackage.crudapi.service;

import crudpackage.crudapi.dao.CourseDAO;
import crudpackage.crudapi.model.Coursemodel;
import crudpackage.crudapi.repository.CourseRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouseImplement implements Courseservice {
    @Autowired
    private CourseRepostiory courseRepostiory;// query logic

    @Override
    public String CourseAddlogic(CourseDAO courseDAO){
        Coursemodel savetheinfo=new Coursemodel(courseDAO.getSname()
                ,courseDAO.getCourseduration(),courseDAO.getCoursename(),
                courseDAO.getCoursetime(), courseDAO.getDays(),courseDAO.getPhoneno());
        courseRepostiory.save(savetheinfo);
        return "data stored successfully";

    }
}
