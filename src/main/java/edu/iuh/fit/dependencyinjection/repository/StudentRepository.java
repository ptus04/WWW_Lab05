package edu.iuh.fit.dependencyinjection.repository;

import edu.iuh.fit.dependencyinjection.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}