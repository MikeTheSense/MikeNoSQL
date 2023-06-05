package com.example.MikeNoSQL.repository.redis;

import com.example.MikeNoSQL.model.mongoModel.MongoDepartment;
import com.example.MikeNoSQL.model.redisModel.RedisDepartment;
import org.springframework.data.repository.CrudRepository;

public interface RedisDepartmentRepository extends CrudRepository<RedisDepartment, Integer> {

}
