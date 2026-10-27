package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.AdminDTO;
import crudpackage.crudapi.model.Adminmodel;
import crudpackage.crudapi.repository.AdminRespostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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


    @Override
    public AdminDTO admindisplaylogic(String adminid){
        Adminmodel get=adminRespostiory.findByAdminid(adminid);
        if(get!=null) {
            AdminDTO transfer = new AdminDTO();
            transfer.setSerialno(get.getSerialno());
            transfer.setAdminid(get.getAdminid());
            transfer.setAdminname(get.getAdminname());
            transfer.setAdminpassword(get.getAdminpassword());
            return transfer;
        }else {
            AdminDTO transfer = new AdminDTO();
            transfer.setSerialno(0);
            transfer.setAdminid("not present");
            transfer.setAdminname("not present");
            transfer.setAdminpassword("not present");
            return transfer;

        }

    }
}
