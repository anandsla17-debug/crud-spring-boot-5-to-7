package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.CourseDTO;
import crudpackage.crudapi.model.Coursemodel;
import crudpackage.crudapi.repository.CourseRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    @Override
    public String Updatecouselogic(CourseDTO courseDTO){
         Optional<Coursemodel> coursemodel=courseRepostiory.findById(courseDTO.getStudentid());

         if(coursemodel.isPresent()){
             System.out.println(coursemodel.get().getCoursename());
             Coursemodel savetheupdate=coursemodel.get();
             savetheupdate.setSname(courseDTO.getSname());
             savetheupdate.setCoursename(courseDTO.getCoursename());
             savetheupdate.setCourseduration(courseDTO.getCourseduration());
             savetheupdate.setDays(courseDTO.getDays());
             savetheupdate.setPhoneno(courseDTO.getPhoneno());
             savetheupdate.setCoursetime(courseDTO.getCoursetime());

             courseRepostiory.save(savetheupdate);
             return " student id:"+courseDTO.getStudentid()+" update successfully";
         }else {

             return "student id:"+courseDTO.getStudentid()+"it not present in the database";
         }
    }

    @Override
    public String Deletestudentlogic(int studentid){
        Optional<Coursemodel> getdata=courseRepostiory.findById(studentid);// select * from course where studentid=?
        if(getdata.isPresent()){
            courseRepostiory.deleteByStudentid(studentid);// delete * from course where studentid=?;
            return "student id:"+studentid+" is deleted";
        }else {
            return "student id:"+studentid+" is not present in database";
        }
    }


}
