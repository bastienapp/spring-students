package fr.wildcodeschool.students.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("fr.wildcodeschool.students")
public class StudentsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentsApplication.class, args);
		App app = new App();
		app.start(context);
	}
}
