package com.dcb_micro_dept.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcb_micro_dept.app.entity.Department;

@Repository
public interface DeptRepo extends CrudRepository<Department, Integer>{

}
