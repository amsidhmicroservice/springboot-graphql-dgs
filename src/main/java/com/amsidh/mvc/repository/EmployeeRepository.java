package com.amsidh.mvc.repository;

import com.amsidh.mvc.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    @Query("select e from EmployeeEntity e where e.id=?1")
    EmployeeEntity findByEmployeeId(Integer employeeId);
}
