package net.codejava;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@Autowired
	private UserRepo repo;
	User u;
		
		//@GetMapping("regi")
		 @RequestMapping(value="/reg",method = RequestMethod.GET)
		 public String showPage(Model model) {
		 model.addAttribute("user", new User());
		 return "register_form";
		 }
		
		 @RequestMapping(value="register",method = RequestMethod.POST)
		 public ModelAndView registration(@Valid User user, BindingResult errors, Model model,
				 @RequestParam("name") String name,@RequestParam("code") String code,@RequestParam("city") 
			String city,@RequestParam("pincode") String pincode,@RequestParam("state") String state,
			@RequestParam("email") String email,@RequestParam("phone") String phone,@RequestParam("capacity")String capacity,@RequestParam("Detailed_Address") String Detailed_Address
			,@RequestParam("course") String  course)
		 {
				
			
			  u=new User();
			  u.setName(name);
			  u.setCode(code);
			  u.setCity(city);
			  u.setPincode(pincode);
			  u.setState(state);
			  u.setEmail(email);
			  u.setPhone(phone);
			  u.setCapacity(capacity);
			 u.setCourse(course);
			 u.setDetailed_Address(Detailed_Address);
			 
			 
			 
			 
			 System.out.println(user);
				
			
		 model.addAttribute("user", user);
		 if(errors.hasErrors()) {
		 return new ModelAndView("register_form", "user", user);
		
		 }else {
		 return new ModelAndView("register_success", "user", user);
		 }
		 }
	
		 
		 
		 
	
		 @GetMapping("save")
			String saveuser()
			{
		   System.out.println(repo.save(u));
		   User uv=(User)repo.getOne("0852");
		   System.out.println(uv+" ,"+uv.getCourse());
		   
				return"your record is successfully saved in h2 database";
				
				
			}
		
		    @PostMapping("show")
		    List <User> showdetail()
		    {
		    	
		    	List<String> status;
		    	if(repo.findAll()==null)
		    	{
		    		System.out.println("no training institute existed");
		    		
		    	}
		    	
		  	    	return (List<User>)repo.findAll();
		
		    }		    
}
		    
		    	

	
	

