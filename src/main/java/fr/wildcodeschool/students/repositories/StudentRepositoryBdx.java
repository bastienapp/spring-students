package fr.wildcodeschool.students.repositories;

import fr.wildcodeschool.students.controllers.StudentDao;
import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryBdx implements StudentDao {
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Josie"));
        students.add(new Student("Marc-aurèle"));
        students.add(new Student("Staline"));
        return students;
    }
}
