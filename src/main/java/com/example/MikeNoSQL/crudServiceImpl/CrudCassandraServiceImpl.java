package com.example.MikeNoSQL.crudServiceImpl;

import com.example.MikeNoSQL.crudService.AbstractCrudService;
import com.example.MikeNoSQL.dataTransferObject.EmployeeDTO;
import com.example.MikeNoSQL.model.Employee;
import com.example.MikeNoSQL.model.cassandraModel.CassandraDepartment;
import com.example.MikeNoSQL.model.cassandraModel.CassandraEmployee;
import com.example.MikeNoSQL.model.mongoModel.MongoDepartment;
import com.example.MikeNoSQL.model.mongoModel.MongoEmployee;
import com.example.MikeNoSQL.repository.cassandraRepository.CassandraDepartmentRepository;
import com.example.MikeNoSQL.repository.cassandraRepository.CassandraEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class CrudCassandraServiceImpl extends AbstractCrudService<CassandraEmployee, CassandraDepartment> {
    @Autowired
    public CrudCassandraServiceImpl(CassandraEmployeeRepository cassandraEmployeeRepository,
                                    CassandraDepartmentRepository cassandraDepartmentRepository) {
        super(cassandraEmployeeRepository, cassandraDepartmentRepository);
    }
}
