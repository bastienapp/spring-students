package fr.wildcodeschool.students.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentServiceImplTls implements StudentService {

	@Override
	public List<Student> studentsList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Bernard"));
		students.add(new Student("Hoagie"));
		students.add(new Student("Laverne"));
		return students;
	}

}
