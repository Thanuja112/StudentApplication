package com.example.myap.springapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface StudentRepo extends JpaRepository<Student,Integer> {

  }


//interface it has some declarations no implementations
