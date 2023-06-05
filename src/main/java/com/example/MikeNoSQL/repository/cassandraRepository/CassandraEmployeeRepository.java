package com.example.MikeNoSQL.repository.cassandraRepository;

import com.example.MikeNoSQL.model.Employee;
import com.example.MikeNoSQL.model.cassandraModel.CassandraEmployee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraEmployeeRepository extends CassandraRepository<CassandraEmployee,Integer> {

}
