package com.example.project.Service;

import java.util.*;
import com.example.project.Entity.Student;

public interface StudentService {
    
    List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Integer id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Integer id);
}
