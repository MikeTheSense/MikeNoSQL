package com.example.MikeNoSQL.controller;

import com.example.MikeNoSQL.model.Department;
import com.example.MikeNoSQL.model.Employee;

import java.util.List;

public interface Controller <E extends Employee, D extends Department>{
    String saveEmployee(E emp);
    String bulkSaveEmployee(List<E> emp);
    String deleteEmployee(String id);
    String updateEmployee();
    E getEmployee(String id);
    String saveDepartment(D department);
    String deleteDepartment(String id);
    String updateDepartment();
    List<E> findAllEmployees();
    List<D> findAllDepartments();
}
