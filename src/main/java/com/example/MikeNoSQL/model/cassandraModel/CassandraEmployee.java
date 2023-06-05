package com.example.MikeNoSQL.model.cassandraModel;

import com.example.MikeNoSQL.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table("employee")
@AllArgsConstructor
@Getter
@Setter
public class CassandraEmployee extends Employee {
    @PrimaryKey
    private int id;
    private String firstName;
    private String lastName;
    private String department;
}
