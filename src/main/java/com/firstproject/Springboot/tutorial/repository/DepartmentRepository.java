package com.firstproject.Springboot.tutorial.repository;

import com.firstproject.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public List<Department> findByDepartmentName(String departmentName);
}
