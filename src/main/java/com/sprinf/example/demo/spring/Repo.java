package com.sprinf.example.demo.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Repo extends JpaRepository<StudentTable,Integer> {
// crud
	
}