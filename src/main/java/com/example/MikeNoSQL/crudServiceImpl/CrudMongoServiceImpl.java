package com.example.MikeNoSQL.crudServiceImpl;

import com.example.MikeNoSQL.crudService.AbstractCrudService;
import com.example.MikeNoSQL.model.mongoModel.MongoDepartment;
import com.example.MikeNoSQL.model.mongoModel.MongoEmployee;
import com.example.MikeNoSQL.repository.mongoRepository.MongoDepartmentRepository;
import com.example.MikeNoSQL.repository.mongoRepository.MongoEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class CrudMongoServiceImpl extends AbstractCrudService<MongoEmployee, MongoDepartment> {
    @Autowired
    public CrudMongoServiceImpl(MongoEmployeeRepository employeeRepository, MongoDepartmentRepository departmentRepository) {
        super(employeeRepository, departmentRepository);
    }
}
