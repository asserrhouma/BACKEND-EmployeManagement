package com.asser.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return EmployeeRepository.findAll();
    }

    @Override
    public void addEmployees(Employee employee){
        EmployeeRepository.save(employee);
    }

    @Override
    public void updateEmployees(Employee employee){
        EmployeeRepository.save(employee);
    }

    @Override
    public void deleteEmployees(Integer id){
        EmployeeRepository.deleteById(id);
    }




}
