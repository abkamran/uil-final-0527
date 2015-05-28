package com.uil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uil.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
