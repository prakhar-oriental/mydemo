package com.example.Depart.service;

import java.util.List;
import java.util.Optional;

import com.example.Depart.model.Department;

public interface Departmentservice {
	 // Save operation
    Department saveDepartment(Department department);
 
    // Read operation
    List<Department> fetchDepartmentList();
 
    Optional<Department> fetchDepartmentListById(Long departmentId);
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
