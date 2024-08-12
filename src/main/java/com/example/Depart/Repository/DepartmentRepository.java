package com.example.Depart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Depart.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
