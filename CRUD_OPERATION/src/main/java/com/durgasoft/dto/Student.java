package com.durgasoft.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.domain.Persistable;
import org.springframework.stereotype.Controller;

//public class Student implements Persistable<String>{
@Controller
@Entity	
public class Student {
	@Id
	private String sid;
	private String sname;
	private String saddr;
	private String spwd;
	
	
	//public static boolean isNew=false;
	

	
	
	public String getSid() {
		return sid;
	}
	public String getSpwd() {
		return spwd;
	}
	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
//	@Override
//        public  boolean isNew() {
//			return isNew;
//		}
//	
//		public String getId() {
//			// TODO Auto-generated method stub
//			return null;
//		}

}
