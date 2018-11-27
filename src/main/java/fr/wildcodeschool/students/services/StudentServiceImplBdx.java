package fr.wildcodeschool.students.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.wildcodeschool.students.models.Student;

@Service
public class StudentServiceImplBdx implements StudentService {

	@Override
	public List<Student> students() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Stan"));
		students.add(new Student("Kyle"));
		students.add(new Student("Kenny"));
		students.add(new Student("Cartman"));
		return students;
	}

}
