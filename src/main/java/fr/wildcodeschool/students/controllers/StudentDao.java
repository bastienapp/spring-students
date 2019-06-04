package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDao {

    List<Student> findAll();
}
