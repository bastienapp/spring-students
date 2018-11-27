package fr.wildcodeschool.students.controllers;

import org.springframework.context.ApplicationContext;

import fr.wildcodeschool.students.models.Student;

public class App {
	
	public void start(ApplicationContext context) {
		School schoolController = (School) context.getBean("school");

		System.out.println("");
		System.out.println("******************");
		for (Student student : schoolController.getStudents()) {
			System.out.println(student.getName());
		}
		System.out.println("******************");
	}
}
