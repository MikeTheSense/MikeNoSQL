package com.example.MikeNoSQL.repository.mongoRepository;

import com.example.MikeNoSQL.model.mongoModel.MongoDepartment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDepartmentRepository extends MongoRepository<MongoDepartment,Integer> {
}
