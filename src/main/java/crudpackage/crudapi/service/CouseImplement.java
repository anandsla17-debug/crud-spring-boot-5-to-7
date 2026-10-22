package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.CourseDTO;
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
    public String CourseAddlogic(CourseDTO courseDTO){
        Coursemodel savetheinfo=new Coursemodel(courseDTO.getSname()
                , courseDTO.getCourseduration(), courseDTO.getCoursename(),
                courseDTO.getCoursetime(), courseDTO.getDays(), courseDTO.getPhoneno());
        courseRepostiory.save(savetheinfo);
        return "data stored successfully";

    }

    @Override
    public List<CourseDTO> Coursedisplayall(){
        List<Coursemodel> getdata=courseRepostiory.findAll();
        List<CourseDTO> transfer= new ArrayList<>();
        for(Coursemodel getdataall:getdata ){
            CourseDTO set=new CourseDTO();
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
