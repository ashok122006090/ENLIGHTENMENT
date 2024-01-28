package com.sprinf.example.demo.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "student_table") // Specify the name of the database table
public class StudentTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id") // Specify the name of the primary key column
    private Integer id;

    @Column(name = "student_description") // Specify the name of the description column
    private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "StudentTable [id=" + id + ", description=" + description + "]";
	}

	public StudentTable() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
