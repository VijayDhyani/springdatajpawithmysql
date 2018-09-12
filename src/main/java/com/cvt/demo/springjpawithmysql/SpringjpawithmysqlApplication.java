package com.cvt.demo.springjpawithmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cvt.demo.springjpawithmysql.repository")
@SpringBootApplication
public class SpringjpawithmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpawithmysqlApplication.class, args);
	}
}
