package com.example.myap.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/addstudent")
    public Student
    addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @GetMapping("/getstudentbyid/{id}")
    public Optional<Student> getStudent(@PathVariable int id)
    {
        return studentService.getStudent(id);
    }
    @GetMapping("/getAllStudent")
    public HashMap<Integer,Student> getAllStudent(){
        return studentService.getAllStudent();
    }
  @DeleteMapping("/deletestudent/{id}")
    public String
    deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "student deleted";
    }

}
  //Controller receives the request and calls the service.