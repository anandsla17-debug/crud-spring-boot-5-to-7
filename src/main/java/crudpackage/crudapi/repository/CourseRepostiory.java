package crudpackage.crudapi.repository;

import crudpackage.crudapi.model.Coursemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepostiory extends JpaRepository<Coursemodel,Integer> {

}
