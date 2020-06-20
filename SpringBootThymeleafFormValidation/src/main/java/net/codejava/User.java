package net.codejava;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;

import javax.validation.constraints.Size;



@Entity
public class User {

	@Size(min = 10, max = 40)
	
	private String name;
	
	//@Column(name="center code")
	@Id
	//@Size(min = 5, max = 8)
	private String code;
	
	
	
	@Size(min = 20, max = 30)
	private String Detailed_Address;
	
	
	//@Size(min = 3, max = 8)
	private String city;
	
	

	private String state;
	
	private String pincode;
	
	//@NotBlank
	//@Size(min = 8, max = 20)
	private String capacity; 
	
	
	@Email(message = "Please enter a valid e-mail address")
	private String email;
    private String course;
 
 public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	


	public String getDetailed_Address() {
		return Detailed_Address;
	}

	public void setDetailed_Address(String detailed_Address) {
		Detailed_Address = detailed_Address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", code=" + code + ", Detailed_Address=" + Detailed_Address + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", email=" + email + ", phone=" + phone + "]";
	}
	
	}

	


	

