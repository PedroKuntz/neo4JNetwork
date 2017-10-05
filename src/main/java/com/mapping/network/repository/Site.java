package com.mapping.network.repository;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
public class Site {

	@Id 
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String name;
	
	
	
}
