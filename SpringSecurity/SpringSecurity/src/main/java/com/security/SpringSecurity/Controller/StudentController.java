package com.security.SpringSecurity.Controller;

import com.security.SpringSecurity.Entity.Student;
import com.security.SpringSecurity.StudentService.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<List<Student>> addStudent(@RequestBody List<Student> student){
        studentService.saveStudents(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

}
