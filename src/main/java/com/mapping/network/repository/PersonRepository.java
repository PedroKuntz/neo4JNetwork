package com.mapping.network.repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mapping.network.model.Person;

@Repository
public interface PersonRepository extends GraphRepository<Person> {

	@Query("MATCH p=()-->() RETURN p LIMIT 25")
    List<Person> findRelationship();

}
