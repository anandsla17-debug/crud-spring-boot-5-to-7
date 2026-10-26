package crudpackage.crudapi.service;

import crudpackage.crudapi.dto.AdminDTO;

public interface AdminService {
    public String adminRegisterlogic(AdminDTO adminDTO);
    public boolean adminloginlogic(AdminDTO adminDTO);
}
