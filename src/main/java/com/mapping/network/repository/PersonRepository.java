package com.mapping.network.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.mapping.network.model.Person;

@Repository
public interface PersonRepository extends GraphRepository<Person> {

//    List<Person> findByKlout(@Param("name") String name);

}
