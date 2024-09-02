package com.demoexample.springbootcrudoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoexample.springbootcrudoperation.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}