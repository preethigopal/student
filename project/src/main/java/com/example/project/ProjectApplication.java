package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.project.Repository.StudentRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}
	
	
}
