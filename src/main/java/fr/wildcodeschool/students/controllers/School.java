package fr.wildcodeschool.students.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import fr.wildcodeschool.students.models.Student;
import fr.wildcodeschool.students.services.StudentService;

@Controller
public class School {
	
	@Autowired
    @Qualifier("studentServiceImplBdx")
	private StudentService studentService;
 
    public List<Student> getStudents(){
        return studentService.students();
    }
}
