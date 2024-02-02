package com.sprinf.example.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {

    @Autowired
    private Repo studentRepository;

    public List<StudentTable> FindAll() {
        return studentRepository.findAll();
    }

    public Optional<StudentTable> findById(int id) {
        return studentRepository.findById(id);
    }

    public StudentTable save(StudentTable student) {
        return studentRepository.save(student);
    }

   
}
