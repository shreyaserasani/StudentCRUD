package com.student.StudentCRUD;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    // RESTful API methods for Retrieval operations
    
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }
    
    @GetMapping("/student")
    public List<Student> fetchAllStudents() {
        return studentService.fetchAllStudents();
    }
    
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        return studentService.deleteStudentById(id);
    }
    
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
    	System.out.println(student.getFirstname());
    	return studentService.saveStudent(student);
    }
    
    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
        return studentService.updateStudentById(id, student);
    }    
}
