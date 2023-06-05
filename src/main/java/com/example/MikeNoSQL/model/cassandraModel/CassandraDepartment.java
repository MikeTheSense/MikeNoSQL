package com.example.MikeNoSQL.model.cassandraModel;

import com.example.MikeNoSQL.model.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@AllArgsConstructor
@Getter
@Setter
@Table("department")
public class CassandraDepartment extends Department {
    @PrimaryKey
    private int id;
    private String name;
    private String role;
}
