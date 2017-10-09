package com.mapping.network.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.network.model.Person;
import com.mapping.network.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	
	public Iterable<Person> getPerson(){
		return repo.findAll();
	}
	
	public List<Person> getRelationship() {
		return repo.findRelationship();
	}

}
