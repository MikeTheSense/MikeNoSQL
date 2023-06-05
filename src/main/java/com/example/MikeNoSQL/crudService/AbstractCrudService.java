package com.example.MikeNoSQL.crudService;

import com.example.MikeNoSQL.model.Department;
import com.example.MikeNoSQL.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static java.util.Arrays.stream;

public class AbstractCrudService  <E extends Employee, D extends Department> implements CrudService<E,D>{
    private final CrudRepository<E, Integer> employeeRepository;
    private final CrudRepository<D, Integer> departmentRepository;
    private static final String okMessage = "OK";
    public AbstractCrudService(CrudRepository<E, Integer> employeeRepository,CrudRepository<D, Integer> departmentRepository){
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }
    @Override
    public String saveEmployee(E emp) {
        employeeRepository.save(emp);
        return okMessage;
    }

    @Override
    public String bulkSaveEmployee(List<E> emp) {
        employeeRepository.saveAll(emp);
        return okMessage;
    }

    @Override
    public String deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return okMessage;
    }

    @Override
    public String updateEmployee() {
        return null;
    }

    @Override
    public E getEmployee(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public String saveDepartment(D department) {
        departmentRepository.save(department);
        return okMessage;
    }

    @Override
    public String deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
        return okMessage;
    }

    @Override
    public String updateDepartment() {
        return null;
    }

    @Override
    public List<E> findAllEmployees() {
        Iterable<E> iterableEmployee = employeeRepository.findAll();
        return StreamSupport.stream(iterableEmployee.spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public List<D> findAllDepartments() {
        Iterable<D> iterableDepartments = departmentRepository.findAll();
        return StreamSupport.stream(iterableDepartments.spliterator(),false).collect(Collectors.toList());
    }
}
