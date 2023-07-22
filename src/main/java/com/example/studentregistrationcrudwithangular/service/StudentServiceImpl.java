package com.example.studentregistrationcrudwithangular.service;

import com.example.studentregistrationcrudwithangular.model.Student;
import com.example.studentregistrationcrudwithangular.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    @Override
    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepo.deleteById(studentId);
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentRepo.findById(studentId).get();
    }

}
