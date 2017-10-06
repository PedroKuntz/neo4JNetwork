package com.mapping.network.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.mapping.network"})
@EntityScan("com.mapping.network.model")
@EnableNeo4jRepositories("com.mapping.network.repository")
@EnableTransactionManagement
@SpringBootApplication
public class NetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkApplication.class, args);
	}
}
