package com.ty.schooldemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ty.schooldemo.dto.Student;
import com.ty.schooldemo.repo.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo repo;
	public Student saveStudent( Student student) {
		return repo.save(student);
	}
	public Student getbyid( int id) {
		return repo.findById(id).get();
	}
	public String deleteStudentbyId(int id) {
		repo.deleteById(id);
		return "deleted";
	}
}
