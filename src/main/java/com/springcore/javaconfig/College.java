package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.Principal;

//@Component("collegeBean")
public class College {

	@Autowired
	private Pricipal principal;
	
	private String collegeName="GTU";

	public College() {
	}

	public College(Pricipal principal, String collegeName) {
		this.principal = principal;
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		principal.principalInfo();
		return collegeName;
	}
}
