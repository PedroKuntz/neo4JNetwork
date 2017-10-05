package com.mapping.network;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.network.repository.Person;
import com.mapping.network.repository.PersonRepository;

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
@RestController
public class NetworkApplication {

//	Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "padtec"));
//	Session session = driver.session();
//	
//	@RequestMapping("/person")
//	public String getPerson() {
//		StatementResult obj = session.run("MATCH (ee:Person) RETURN ee");
//		List<Record> records = obj.list();
//		StringBuilder result = new StringBuilder();
//		int i = 0;
//		int j = 0;
//		JSONObject json = new JSONObject();
//		while(i<records.size()) {
//			Record record = records.get(i);
//			while(j<record.size()) {
//				Value value = record.get(j);
//				Node node = value.asNode();
//				result.append(node.values());
//				try {
//					json.put(node.keys().toString(), node.values().toString());
//				} catch (JSONException e) {
//					e.printStackTrace();
//				}
//				
//				j++;
//			}
//			i++;
//		}
//		
//		session.close();
//		driver.close();
//		return "Person: " + json;
//	}

	@Autowired
	PersonRepository repo;
	
	@RequestMapping("/person")
	@ResponseBody
	public Iterable<Person> getPerson(){
		return repo.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(NetworkApplication.class, args);
	}
}
