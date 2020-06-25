package com.durgasoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.durgasoft.dto.Student;

public interface StudentDao extends JpaRepository<Student,String> {
	
	//String Check(String sname ,String spwd);



}
