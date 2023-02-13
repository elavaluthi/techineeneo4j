package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
@EnableNeo4jRepositories
@SpringBootApplication
public class Techineeneo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Techineeneo4jApplication.class, args);
	}

}
