package com.asser.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/Employees")
    public List<Employee> getEmployees() {
        return service.getEmployees();
    }
    @PostMapping("/Employees/addnew")
        public void addEmployees(@RequestBody Employee employee) {
        service.addEmployees(employee);

        }
        @PutMapping("Employees/{id}/edit")
    public void updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        service.updateEmployees(employee);
        }
        @DeleteMapping("Employees/{id}/delete")
    public void deleteEmployee(@PathVariable int id) {
        service.deleteEmployees(id);
        }

}
