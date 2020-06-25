package com.durgasoft.service;
	import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
	 import org.springframework.stereotype.Service;
	
	 import com.durgasoft.dao.StudentDao;
	 import com.durgasoft.dto.Student;

import antlr.collections.List;
	
	 @Service
	public class StudentServiceImpl implements StudentService {
		@Autowired  
	StudentDao studentDao;
		
	 @Override
	 @Transactional
	 public String addStudent(Student std)
	 {
		 System.out.println(std);
		 
		// System.out.println(std.getId()+" "+std.getSname()+" "+std.getSaddr());
	 String status ="";
	// try 
	 //{
//		 boolean b= studentDao.existsById(std.getSid());		 
//		 if(b==true) {
//		 status="existed"; 
//		 }
//	  
//		 else  {
//			// Student.isNew=true;
//			 Student std1=studentDao.save(std);
//		 
//			 //if(std.getSid().equals(std.getSid()));{		 
//			 status="success";
	 if (std==null)
		 status="failure";
	 else {
		studentDao.save(std);
	 
	// Iterable<Student> stu= studentDao.findAll();
		//System.out.println(stu);
	 status="success";
	 }
	
	// }else {
		//		 status="failure";
	 
//	 catch (Exception e) {
//	e.printStackTrace();
//	}
	
	 return status;
	 }
//	
	 @Override
	 public  Student searchStudent(String sid) {
		 Student student=null;
		 try {
	 Optional<Student> std = studentDao.findById(sid);
	  student =std.get();
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
	// System.out.println(student);
	 //System.out.println("!!!!!!search method!!!!"+student.getSid());
	// System.out.println(std);
	// return student;
	 return student;
 }
	
	 @Override
	 public String updateStudent(Student sid1) {
		 
		 String status="";
	 Student st= studentDao.save(sid1);
	// System.out.println(st.);
	 
//	 if(std!=null)
		 status="success";
	//	 else status="failure";
	 return status;
	 }
//	
//	 @Override
//	 public String deleteStudent(String sid) {
//	 String status = studentDao.delete(sid);
//	 return status;
//	 }
//	@Override
//	public Student searchStudent(String sid) {
//		
//	 Student =studentDao.findById(sid);
//		
//	}
	//@Override
//	public Student searchStudent(String sid) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public String deleteStudent(String sid)
 {
		String status="";
		try
		{
         
         studentDao.deleteById(sid);
         status="success";
		}
		catch (Exception e) {
			status="failure";
		e.printStackTrace();
		}
		return status;
	}
//	@Override
//	public String checkLogin(String sname, String password) {
//	return null;
//	}
//		
//	@Transactional
//	@Override
//	public String checkLogin(String sname, String spwd) {
//		String status="";
//		
//					List<Student> studentResponse = <Student>studentDao.findAll();
//			return studentResponse;
//		}
//
//		
//		
//	
//		
	
	//@Override
	//public String deleteStudent(String sid) {
		// TODO Auto-generated method stub
		//return null;
//	}
//	@Override
//	public String updateStudent(Student std) {
//	
//		
//		
//		return null;
//	}
	
	}
	
	 	 

