package crudpackage.crudapi.controller;

import crudpackage.crudapi.dto.AdminDTO;
import crudpackage.crudapi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/reg")
    public String AdminRegister(@RequestBody AdminDTO adminDTO){
        return adminService.adminRegisterlogic(adminDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<String> AdminLogin(@RequestBody AdminDTO adminDTO){

       String result =adminService.adminloginlogic(adminDTO);
       return ResponseEntity.ok(result);
//        if(result){
//            return ResponseEntity.ok("login successfully");
//        }else {
//            return  ResponseEntity.ok("login failed");
//        }

    }

    @GetMapping("/adminview/{adminid}")
    public  AdminDTO Displayadmindata(@PathVariable(name = "adminid") String adminid){
        return adminService.admindisplaylogic(adminid);
    }
}
