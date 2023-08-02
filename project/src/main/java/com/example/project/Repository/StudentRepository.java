package com.example.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
