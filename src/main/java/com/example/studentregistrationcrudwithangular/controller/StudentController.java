package com.example.studentregistrationcrudwithangular.controller;

import com.example.studentregistrationcrudwithangular.model.Student;
import com.example.studentregistrationcrudwithangular.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
@CrossOrigin(origins = "http://localhost:4200/")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "saved";
    }

    @GetMapping ("/getAllStudent")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/updateStudent/{studentId}")
    public String updateStudent(@RequestBody Student student, @PathVariable int studentId){
        student.setStudentId(studentId);
        studentService.saveStudent(student);
        return "updated";
    }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
        return "deleted";
    }

    @GetMapping("/getStudentById/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.getStudentById(studentId);
    }
}
