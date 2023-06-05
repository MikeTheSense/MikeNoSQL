package com.example.MikeNoSQL.crudServiceImpl;

import com.example.MikeNoSQL.crudService.AbstractCrudService;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jDepartment;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jEmployee;
import com.example.MikeNoSQL.repository.neo4jRepository.Neo4jDepartmentRepository;
import com.example.MikeNoSQL.repository.neo4jRepository.Neo4jEmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class CrudNeo4jServiceImpl extends AbstractCrudService<Neo4jEmployee, Neo4jDepartment> {
    public CrudNeo4jServiceImpl(Neo4jEmployeeRepository employeeRepository,
                                Neo4jDepartmentRepository departmentRepository) {
        super(employeeRepository, departmentRepository);
    }
}
