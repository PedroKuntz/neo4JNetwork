package com.mapping.network.application;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Value;
import org.neo4j.driver.v1.types.Node;
import org.springframework.web.bind.annotation.RequestMapping;

public class ConnectionWithDriverNeo4J {

	Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "padtec"));
	Session session = driver.session();
	
	@RequestMapping("/person")
	public String getPerson() {
		StatementResult obj = session.run("MATCH (ee:Person) RETURN ee");
		List<Record> records = obj.list();
		StringBuilder result = new StringBuilder();
		int i = 0;
		int j = 0;
		JSONObject json = new JSONObject();
		while(i<records.size()) {
			Record record = records.get(i);
			while(j<record.size()) {
				Value value = record.get(j);
				Node node = value.asNode();
				result.append(node.values());
				try {
					json.put(node.keys().toString(), node.values().toString());
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
				j++;
			}
			i++;
		}
		
		session.close();
		driver.close();
		return "Person: " + json;
	}	
	
}
