package edu.iuh.fit.dependencyinjection.repository;

import edu.iuh.fit.dependencyinjection.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByNameContaining(String name);
}