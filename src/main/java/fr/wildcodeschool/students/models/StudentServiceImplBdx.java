package fr.wildcodeschool.students.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentServiceImplBdx implements StudentService {

	@Override
	public List<Student> studentsList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Stan"));
		students.add(new Student("Kyle"));
		students.add(new Student("Kenny"));
		students.add(new Student("Cartman"));
		return students;
	}

}
