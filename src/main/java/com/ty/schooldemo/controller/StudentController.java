package com.ty.schooldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.schooldemo.dao.StudentDao;
import com.ty.schooldemo.dto.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDao dao;

	@PostMapping("save")
	public void saveStudent(@RequestBody Student stu) {
		dao.saveStudent(stu);
	}
	@GetMapping("get")
	public Student getStudent(@RequestParam int id) {
		return dao.getbyid(id);
	}
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return dao.deleteStudentbyId(id);
	}
}
