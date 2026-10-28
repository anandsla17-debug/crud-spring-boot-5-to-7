package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.AdminDTO;

public interface AdminService {
    public String adminRegisterlogic(AdminDTO adminDTO);
    public String adminloginlogic(AdminDTO adminDTO);
    public AdminDTO admindisplaylogic(String adminid);
}
