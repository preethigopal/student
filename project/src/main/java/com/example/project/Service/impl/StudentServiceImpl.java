package com.example.project.Service.impl;

import org.springframework.stereotype.Service;

import java.util.*;

import com.example.project.Entity.Student;
import com.example.project.Repository.StudentRepository;
import com.example.project.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    
    private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
        
       
    }

    @Override
    public Student updateStudent(Student student) {
     return studentRepository.save(student);
      
    }

    @Override
    public void deleteStudentById(Integer id) {
         studentRepository.deleteById(id);
    }
}
