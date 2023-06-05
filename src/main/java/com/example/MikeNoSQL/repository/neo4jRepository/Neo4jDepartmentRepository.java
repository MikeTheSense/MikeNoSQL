package com.example.MikeNoSQL.repository.neo4jRepository;

import com.example.MikeNoSQL.model.neo4jModel.Neo4jDepartment;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface Neo4jDepartmentRepository extends Neo4jRepository<Neo4jDepartment,Integer> {
}
