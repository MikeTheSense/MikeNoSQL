package com.example.MikeNoSQL.repository.neo4jRepository;

import com.example.MikeNoSQL.model.Employee;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jEmployee;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface Neo4jEmployeeRepository extends Neo4jRepository<Neo4jEmployee,Integer> {
}
