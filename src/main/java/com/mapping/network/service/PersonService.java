package com.mapping.network.service;

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

}
