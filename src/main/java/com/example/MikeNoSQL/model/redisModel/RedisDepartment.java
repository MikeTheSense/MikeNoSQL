package com.example.MikeNoSQL.model.redisModel;

import com.example.MikeNoSQL.model.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("department")
@AllArgsConstructor
@Getter
@Setter
public class RedisDepartment extends Department {
    @Id
    @Indexed
    private int id;
    private String name;
    private String role;
}
