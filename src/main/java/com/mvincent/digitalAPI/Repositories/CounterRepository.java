package com.mvincent.digitalAPI.Repositories;

import com.mvincent.digitalAPI.Models.CounterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CounterRepository extends MongoRepository<CounterModel, String> {

}
