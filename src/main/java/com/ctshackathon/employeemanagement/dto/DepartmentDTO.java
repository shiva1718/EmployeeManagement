package com.ctshackathon.employeemanagement.dto;

import com.ctshackathon.employeemanagement.entities.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDTO {
    private Long id;
    private String name;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String name, String location) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department department) {
        this.id = department.getId();
        this.name = department.getName();
    }
}
