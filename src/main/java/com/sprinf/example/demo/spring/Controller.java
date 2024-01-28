package com.sprinf.example.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
// http://localhost:8080/main/get
public class Controller {
	@Autowired
	service s;
	
	@GetMapping("/getAllStudenets") 
	public List<StudentTable> getStudent(){ 
		return s.FindAll();
		 }
	
	@GetMapping("/greet")
	public String greet(@RequestParam(name="name") String name) {
		return "hello, "+ name +"!";
	}
	 
}
