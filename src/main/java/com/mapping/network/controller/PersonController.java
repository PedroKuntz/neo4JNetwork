package com.mapping.network.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.network.model.Person;
import com.mapping.network.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	PersonService service;
	
	@GetMapping("/person")
	@ResponseBody
	public Iterable<Person> getPerson(){
		return service.getPerson();
	}	
	
	@GetMapping("/relationship")
	@ResponseBody
	public List<Person> getRelationship() {
		return service.getRelationship();
	}
	
}
