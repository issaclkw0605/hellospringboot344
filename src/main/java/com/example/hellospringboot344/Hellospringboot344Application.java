package com.example.hellospringboot344;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:9898/v3/api-docs
//http://localhost:9898/swagger-ui/index.html#/


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Spring Doc Open API Tutorial", version = "1.0", description = "Spring Doc Open API Tutorial"))
public class Hellospringboot344Application {

	public static void main(String[] args) {
		SpringApplication.run(Hellospringboot344Application.class, args);
	}

}
