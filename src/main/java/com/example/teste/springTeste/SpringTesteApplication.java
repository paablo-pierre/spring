package com.example.teste.springTeste;

import com.example.teste.springTeste.config.property.AlgaMoneyApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AlgaMoneyApiProperty.class)
public class SpringTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
	}
}
