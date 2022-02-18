package com.vinh.h2database.service;

import com.vinh.h2database.entity.Department;
import com.vinh.h2database.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
