package crudpackage.crudapi.controller;

import crudpackage.crudapi.dto.AdminDTO;
import crudpackage.crudapi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/reg")
    public String AdminRegister(@RequestBody AdminDTO adminDTO){
        return adminService.adminRegisterlogic(adminDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<String> AdminLogin(@RequestBody AdminDTO adminDTO){

        boolean result =adminService.adminloginlogic(adminDTO);
        if(result){
            return ResponseEntity.ok("login successfully");
        }else {
            return  ResponseEntity.ok("login failed");
        }
    }
}
