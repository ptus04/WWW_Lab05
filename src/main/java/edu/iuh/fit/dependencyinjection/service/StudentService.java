package edu.iuh.fit.dependencyinjection.service;

import edu.iuh.fit.dependencyinjection.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> findAll();
    Student findById(Integer id);

    List<Student> findByNameContaining(String name);
}
