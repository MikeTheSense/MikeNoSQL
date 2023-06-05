package com.example.MikeNoSQL.model.mongoModel;


import com.example.MikeNoSQL.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("employee")
@AllArgsConstructor
@Getter
@Setter
public class MongoEmployee extends Employee implements Serializable {
    @Id
    @Indexed
    private int id;
    private String firstName;
    private String lastName;
    private String department;
}
