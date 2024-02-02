package com.sprinf.example.demo.spring;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoSpringApplicationTests {

	 @Autowired
	    private MyService myService;
	 @Autowired 
	 private service studentService;
	 @MockBean
	 private Repo repo;

	  

	    @Test
	    void testProcessString() {
	        // Assuming MyService has a method processString
	        String result = myService.processString("hello");

	        // Add assertions to validate the result
	        assertEquals("HELLO", result);
	    }
	    @Test
	    void findAllTest() {
	        // Mock data
	        StudentTable student1 = new StudentTable();
	        student1.setId(1);
	        student1.setDescription("Description 1");

	        StudentTable student2 = new StudentTable();
	        student2.setId(2);
	        student2.setDescription("Description 2");

	        // Mock repository behavior
	        when(repo.findAll()).thenReturn(Arrays.asList(student1, student2));

	        // Call the service method
	        List<StudentTable> students = studentService.FindAll();

	        // Verify the result
	        assertEquals(2, students.size());
	        assertEquals("Description 1", students.get(0).getDescription());
	        assertEquals("Description 2", students.get(1).getDescription());
	    }
	    @Test
	    void testFindById() {
	        // Mock data
	        int studentId = 1;
	        StudentTable student = new StudentTable();
	        student.setId(studentId);
	        student.setDescription("Description 1");

	        // Mock repository behavior
	        when(repo.findById(studentId)).thenReturn(Optional.of(student));

	        // Call the service method
	        Optional<StudentTable> foundStudent = studentService.findById(studentId);

	        // Verify the result
	        assertEquals(student.getDescription(), foundStudent.orElseThrow().getDescription());
	    }
	    @Test
	    void testSave() {
	        // Mock data
	        StudentTable studentToSave = new StudentTable();
	        studentToSave.setId(1);
	        studentToSave.setDescription("Description to save");

	        // Mock repository behavior
	        when(repo.save(studentToSave)).thenReturn(studentToSave);

	        // Call the service method
	        StudentTable savedStudent = studentService.save(studentToSave);

	        // Verify the result
	        assertEquals(studentToSave.getDescription(), savedStudent.getDescription());
	    }
	    
}
