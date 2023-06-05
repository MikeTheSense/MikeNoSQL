package com.example.MikeNoSQL.model.mongoModel;

import com.example.MikeNoSQL.model.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document("document")
@AllArgsConstructor
@Getter
@Setter
public class MongoDepartment extends Department {
    @Id
    @Indexed
    private int id;
    private String name;
    private String role;
}
