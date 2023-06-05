package com.example.MikeNoSQL.repository.redis;

import com.example.MikeNoSQL.model.mongoModel.MongoEmployee;
import com.example.MikeNoSQL.model.redisModel.RedisEmployee;
import org.springframework.data.repository.CrudRepository;

public interface RedisEmployeeRepository extends CrudRepository<RedisEmployee,Integer> {
}
