package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Producer;

@Repository
public interface ProducerRepository extends CrudRepository<Producer, Long>{

}
