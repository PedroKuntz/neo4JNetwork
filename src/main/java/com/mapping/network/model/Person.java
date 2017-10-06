package com.mapping.network.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.context.annotation.Bean;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
@Getter
@Setter
public class Person {

	@GraphId 
	private Long id;
	private String name;
	private String from;
	private Integer klout;
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public Integer getKlout() {
		return this.klout;
	}
}
