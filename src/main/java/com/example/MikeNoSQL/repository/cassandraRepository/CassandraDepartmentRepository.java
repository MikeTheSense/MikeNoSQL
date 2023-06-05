package com.example.MikeNoSQL.repository.cassandraRepository;

import com.example.MikeNoSQL.model.cassandraModel.CassandraDepartment;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraDepartmentRepository extends CassandraRepository<CassandraDepartment,Integer> {

}
