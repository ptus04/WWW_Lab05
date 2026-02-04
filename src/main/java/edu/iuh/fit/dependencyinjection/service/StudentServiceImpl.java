package edu.iuh.fit.dependencyinjection.service;

import edu.iuh.fit.dependencyinjection.model.Student;
import edu.iuh.fit.dependencyinjection.repository.StudentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService1")
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findByNameContaining(String name) {
        return repository.findByNameContaining(name);
    }


}

