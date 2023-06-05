package com.example.MikeNoSQL.model.neo4jModel;
import com.example.MikeNoSQL.model.Department;
import com.example.MikeNoSQL.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Node
public class Neo4jEmployee extends Employee {
    @Id
    private int key;

    private Integer id;
    private String firstName;
    private String lastName;



    @Relationship(type = "WORKING", direction = Relationship.Direction.INCOMING)
    private Working working;
}
