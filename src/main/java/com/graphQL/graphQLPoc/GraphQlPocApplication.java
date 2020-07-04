package com.graphQL.graphQLPoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.graphQL.graphQLPoc.dao.repository")
@EntityScan("com.graphQL.graphQLPoc.dao.entity")
public class GraphQlPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlPocApplication.class, args);
	}

	@Profile("dev")
	@Bean
	public String devBean() {
		return "dev";
	}
}
