package com.ctshackathon.employeemanagement.controllers;

import com.ctshackathon.employeemanagement.dto.EmployeeDTO;
import com.ctshackathon.employeemanagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDTO employee) {
        System.out.println("Received employee add request");
        System.out.println(employee);
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @GetMapping
    public ResponseEntity<?> listAllEmployees() {
        System.out.println("Received employee list request");
        return ResponseEntity.ok(employeeService.listAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        System.out.println("Received employee get request");
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employee) {
        System.out.println("Received employee update request");
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(id, employee);
        if (updatedEmployee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        System.out.println("Received employee delete request");
        if (!employeeService.deleteEmployee(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

}
