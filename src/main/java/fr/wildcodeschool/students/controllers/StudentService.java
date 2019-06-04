package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentDao {

    @Autowired
    @Qualifier("studentRepositoryTls")
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
