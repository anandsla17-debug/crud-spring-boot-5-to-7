package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.AdminDTO;
import crudpackage.crudapi.model.Adminmodel;
import crudpackage.crudapi.repository.AdminRespostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AdminServiceimpl implements AdminService{
    @Autowired
    private AdminRespostiory adminRespostiory;

    @Override
    public String adminRegisterlogic(AdminDTO adminDTO){
        Adminmodel savethedata=new Adminmodel(adminDTO.getAdminid(),adminDTO.getAdminname(),adminDTO.getAdminpassword());
        adminRespostiory.save(savethedata);
        return "registration successfully";
    }

    @Override
    public boolean adminloginlogic(AdminDTO adminDTO){
        Optional<Adminmodel>  check= adminRespostiory.findByAdminidAndAdminpassword(adminDTO.getAdminid(),adminDTO.getAdminpassword());
         return check.isPresent();
    }
}
