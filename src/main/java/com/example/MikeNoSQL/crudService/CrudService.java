package com.example.MikeNoSQL.crudService;

import com.example.MikeNoSQL.model.Department;
import com.example.MikeNoSQL.model.Employee;

import java.util.List;

public interface CrudService <E extends Employee, D extends Department>{
    String saveEmployee(E emp);
    String bulkSaveEmployee(List<E> emp);
    String deleteEmployee(Integer id);
    String updateEmployee();
    E getEmployee(Integer id);
    String saveDepartment(D department);
    String deleteDepartment(Integer id);
    String updateDepartment();
    List<E> findAllEmployees();
    List<D> findAllDepartments();
}
