package com.sprinf.example.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
   @Autowired
   Repo repo;
   
   public List<StudentTable> FindAll(){
	  return repo.findAll();
	
   }
}