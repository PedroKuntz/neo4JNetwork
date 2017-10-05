package com.mapping.network;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "org.example.person.services")
@EnableNeo4jRepositories(basePackages = "com.example.person.repository")
@EnableTransactionManagement
public class PersistenceContext {

//    @Bean
//    public SessionFactory sessionFactory() {
//        // with domain entity base package(s)
//        return new SessionFactory(configuration(), "com.example.person.domain");
//    }

//    @Bean
//    public org.neo4j.ogm.config.Configuration configuration() {
//        Configuration configuration = new Builder()
//                .uri("bolt://localhost")
//                .credentials("user", "secret")
//                .build();
//        return configuration;
//    }
//
//	@Bean
//	public Neo4jTransactionManager transactionManager() {
//		return new Neo4jTransactionManager(sessionFactory());
//	}
}