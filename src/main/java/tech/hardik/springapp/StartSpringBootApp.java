package tech.hardik.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tech.hardik.springapp")
public class StartSpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootApp.class, args);
	}
}
