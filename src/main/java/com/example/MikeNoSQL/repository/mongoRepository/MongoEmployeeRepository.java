package com.example.MikeNoSQL.repository.mongoRepository;

import com.example.MikeNoSQL.model.mongoModel.MongoEmployee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MongoEmployeeRepository extends MongoRepository<MongoEmployee, Integer> {
    @Override
    List<MongoEmployee> findAll();

    @Override
    <S extends MongoEmployee> S insert(S entity);
}
