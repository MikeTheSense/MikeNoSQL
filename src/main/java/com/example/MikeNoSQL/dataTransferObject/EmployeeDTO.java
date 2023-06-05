package com.example.MikeNoSQL.dataTransferObject;

import com.example.MikeNoSQL.model.Employee;
import com.example.MikeNoSQL.model.neo4jModel.Neo4jEmployee;
import lombok.Getter;


@Getter
public class EmployeeDTO {
    private  Integer id;
    private  String name;
    private  String surname;


    public EmployeeDTO(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public EmployeeDTO(Neo4jEmployee emp)
    {
        if(emp!=null) {
            this.id = emp.getId();
            this.name = emp.getFirstName();
            this.surname = emp.getLastName();
        }
    }

}
