package crudpackage.crudapi.service;

import crudpackage.crudapi.dao.CourseDAO;
import crudpackage.crudapi.model.Coursemodel;
import crudpackage.crudapi.repository.CourseRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CourseDAO> Coursedisplayall(){
        List<Coursemodel> getdata=courseRepostiory.findAll();
        List<CourseDAO> transfer= new ArrayList<>();
        for(Coursemodel getdataall:getdata ){
            CourseDAO set=new CourseDAO();
            set.setStudentid(getdataall.getStudentid());
            set.setSname(getdataall.getSname());
            set.setCourseduration(getdataall.getCourseduration());
            set.setCoursename(getdataall.getCoursename());
            set.setDays(getdataall.getDays());
            set.setPhoneno(getdataall.getPhoneno());
            set.setCoursetime(getdataall.getCoursetime());
            transfer.add(set);
//            System.out.println(getdataall.getCoursename()+getdataall.getStudentid()+getdataall.getSname());

        }

        return transfer;
    }
}
