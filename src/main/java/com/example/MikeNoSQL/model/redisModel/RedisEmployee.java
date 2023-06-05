package com.example.MikeNoSQL.model.redisModel;


import com.example.MikeNoSQL.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("employee")
@AllArgsConstructor
@Getter
@Setter
public class RedisEmployee extends Employee {
    @Id
    @Indexed
    private int id;
    private String firstName;
    private String lastName;
    private String department;
}
