package com.mapping.network.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends GraphRepository<Person> {

//    List<Person> findByKlout(@Param("name") String name);

}
