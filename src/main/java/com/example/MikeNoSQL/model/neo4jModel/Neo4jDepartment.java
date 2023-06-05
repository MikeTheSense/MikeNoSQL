package com.example.MikeNoSQL.model.neo4jModel;

import com.example.MikeNoSQL.model.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.neo4j.core.schema.*;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;



@AllArgsConstructor
@Getter
@Setter
@Node
public class Neo4jDepartment extends Department {
    @Id
    private int key;

    //private Integer id;
    private String name;
    private String role;

//    @Relationship(type = "WORKING", direction = Relationship.Direction.OUTGOING)
//    private Neo4jEmployee employee;

  /* @Relationship(type = "WORKING", direction = Relationship.Direction.OUTGOING)
    private List<Neo4jEmployee> employeeList;*/




}
