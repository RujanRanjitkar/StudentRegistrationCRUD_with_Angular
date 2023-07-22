package com.example.studentregistrationcrudwithangular.service;

import com.example.studentregistrationcrudwithangular.model.Student;

import java.util.List;

public interface StudentService {


    void saveStudent(Student student);

    List<Student> getAllStudents();

    void deleteStudent(int studentId);

    Student getStudentById(int studentId);
}
