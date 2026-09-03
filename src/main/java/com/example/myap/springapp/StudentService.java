
package com.example.myap.springapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service

public class StudentService {
    @Autowired
    StudentRepo studentRepo;

public Student addStudent(Student student)
{
    return
            studentRepo.save(student);
}
 public Optional<Student> getStudent(int id)
 {

     return
             studentRepo.findById(id);
 }
 public HashMap<Integer,Student>getAllStudent()
 {
    return
            (HashMap<Integer, Student>) studentRepo.findAll();
 }
 public void deleteStudent(int id){
    studentRepo.deleteById(id);
 }
}


  //Service handles the logic and calls the Repository