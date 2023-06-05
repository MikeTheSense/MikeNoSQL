package com.example.MikeNoSQL.model.neo4jModel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;


@AllArgsConstructor
@Getter
@Setter
@RelationshipProperties
public class Working {
    @Id
    @GeneratedValue
    private Long graphId;


    @TargetNode
    private Neo4jDepartment neo4jDepartment;



}
