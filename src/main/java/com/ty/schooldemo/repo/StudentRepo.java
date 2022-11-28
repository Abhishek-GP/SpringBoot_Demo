package com.ty.schooldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.schooldemo.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
