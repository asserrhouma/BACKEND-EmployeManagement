package com.asser.employee;

import java.util.List;

public interface IEmployeeService {



    public List<Employee> getEmployees();
    public void addEmployees(Employee employee);

    public void updateEmployees(Employee employee);
    public void deleteEmployees(Integer id);

}



