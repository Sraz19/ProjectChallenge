package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	
	@GetMapping ("/getdata")
	public String getTest() {
		
		return "student data";
	}
	
	@GetMapping ("/getlist")
    public List<String> gwtStudentData(){
		List<String>list = new ArrayList<String>();
		list.add("Sarfaraz");
		list.add("19");
		list.add("Kolhapur");
		list.add("Aishwarya");
		list.add("21");
		list.add("Amritsar");
		list.add("swapnil");
		list.add("phulewadi");
		return list;
	}
		
	@GetMapping("/getStudent")	
	public Student getStudentDetails() {
		Student s = new Student();
		return s;
		
	}
		
    	
    }

