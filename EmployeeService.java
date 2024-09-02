package com.demoexample.springbootcrudoperation.Service;

import com.demoexample.springbootcrudoperation.Dto.EmployeeTaxInfo;
import com.demoexample.springbootcrudoperation.Entities.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public EmployeeTaxInfo calculateTax(Employee employee) ;
	public Employee findById(Long id);

}