package com.durgasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.durgasoft.dao.StudentDao;
import com.durgasoft.dto.Student;
import com.durgasoft.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
@Autowired
	StudentDao studentdao;
@Autowired
Student std;

//	@RequestMapping("form")
//	String Login()
//	{
//		return "loginform";
//	}
//	
//	@RequestMapping("all")
//	
//	public List getStudent()
//	{
////System.out.println(studentdao.findAll());
//	
//	//System.out.println(st.getClass());
//		
//return null;
//	}
//	
//	
	
	
	@RequestMapping("/welcome")
	String show()
	{
		return"welcome";
	}
	
	@RequestMapping("/add")
	String addform()
	{
		return"add";
	}
	
	  @RequestMapping("/search")
	 public String showSearchPage() {
	 return "search";
	 }
	
	 @RequestMapping("/update")
	 public String showUpdatePage() {
	 return "update";
	}
	 
	 @RequestMapping("/editform")
	 public String showEditPage() {
	 return "editform";
	  }
	 
	 @RequestMapping("/delete")
	  public String showDeletePage() {
	 return "delete";	
	 }
	 
	 @RequestMapping(value="/add", method = RequestMethod.POST)
	 ModelAndView add(@RequestParam("sid") String sid, @RequestParam("sname") String sname, @RequestParam
			 ("saddr") String saddr,@RequestParam("spwd") String spwd)
	  {

		 System.out.println("**************************************************************************");
		 System.out.println(sid+" "+sname+" "+saddr);
	   ModelAndView mav=null;
		 //Student std = new Student();
		 std.setSid(sid);
		 std.setSname(sname);
		 std.setSaddr(saddr);
		 std.setSpwd(spwd);
		 
		String status = studentService.addStudent(std);
		
		return new ModelAndView(status);
	 }
	 
	 @RequestMapping(value="editform", method = RequestMethod.POST)
	  public ModelAndView getEditForm( @RequestParam String sid) {
	 
		 ModelAndView mav=null;			
		 System.out.println("hello ################"+sid);
		 Student student=studentService.searchStudent(sid);

		 if(student == null) {
			 System.out.println("nothing here");
			 mav=new ModelAndView("notexisted");			
			  }else {		
				  mav =new ModelAndView("we","std",sid);			
			  }
		 return mav;
	 }
	 		
	 
	  @RequestMapping(value="update1", method = RequestMethod.POST)
	  public String update(ModelMap map,@RequestParam("sid") String sid, @RequestParam String
	 sname, @RequestParam String saddr) {
			 System.out.println("update update update update update update update update update ");

		  System.out.println("update= "+sname+" "+saddr);
	  String status = "";
	  map.addAttribute("operation", "Student Updation");
	 Student std = new Student();
	  std.setSid(sid);
	  std.setSname(sname);
	  std.setSaddr(saddr);
	  System.out.println(std.getSid()+" "+std.getSname()+" "+std.getSaddr());
	 
	 status = studentService.updateStudent(std);
	  return status;
	  } 
	  
	  
	  @RequestMapping(value="search" ,method=RequestMethod.POST)
	  
	   ModelAndView searchForm(@RequestParam("sid") String sid)
	   {
		  ModelAndView mav=null; 
		  
		 Student std =studentService.searchStudent(sid);
		 if(std==null)
		 {
			mav= new ModelAndView("notexisted"); 
		 }
		 
		 else
			 

		 {			 
			 System.out.println("student details:::");
		
		 System.out.println("reference="+std);
	    
         //  stu.setSid(std.Sid);
            
   
             System.out.println(std.getSid());
             System.out.println(std.getSname());
             System.out.println(std.getSaddr());
			 mav= new ModelAndView("details","std",std); 
		 
		 } 
		 return mav;
		  
	   }
	  
	  @RequestMapping(value="delete" ,method=RequestMethod.POST)
	  
	   ModelAndView deleteRecord(@RequestParam("sid") String sid)
	   {
		  ModelAndView mav=null; 
		  
		 Student student= studentService.searchStudent(sid);
		 if(student==null)
			 mav= new ModelAndView("notexisted"); 
		 else {
	   String status =studentService.deleteStudent(sid);
	   mav= new ModelAndView(status);
		 }
	   return mav;
	   }
		 }
	  
		 
