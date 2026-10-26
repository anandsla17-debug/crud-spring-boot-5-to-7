package crudpackage.crudapi.repository;

import crudpackage.crudapi.model.Adminmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRespostiory extends JpaRepository<Adminmodel,Integer> {
    Optional<Adminmodel>  findByAdminidAndAdminpassword(String adminid,String adminpassword);
}
