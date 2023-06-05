package com.example.MikeNoSQL.crudServiceImpl;

import com.example.MikeNoSQL.crudService.AbstractCrudService;
import com.example.MikeNoSQL.model.redisModel.RedisDepartment;
import com.example.MikeNoSQL.model.redisModel.RedisEmployee;
import com.example.MikeNoSQL.repository.redis.RedisDepartmentRepository;
import com.example.MikeNoSQL.repository.redis.RedisEmployeeRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class CrudRedisServiceImpl extends AbstractCrudService<RedisEmployee, RedisDepartment> {
    public CrudRedisServiceImpl(RedisEmployeeRepository redisEmployeeRepository,
                                RedisDepartmentRepository redisDepartmentRepository) {
        super(redisEmployeeRepository,redisDepartmentRepository);
    }
}
