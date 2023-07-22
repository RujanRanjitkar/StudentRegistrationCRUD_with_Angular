package com.example.studentregistrationcrudwithangular.repo;

import com.example.studentregistrationcrudwithangular.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
