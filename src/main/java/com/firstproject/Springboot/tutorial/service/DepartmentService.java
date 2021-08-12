package com.firstproject.Springboot.tutorial.service;


import com.firstproject.Springboot.tutorial.entity.Department;
import com.firstproject.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public List<Department> fetchDepartmentByName(String departmentName);
}
