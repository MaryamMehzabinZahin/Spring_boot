package com.example.springbootfirstwebapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String userid, String password)
	
	{
		return userid.equalsIgnoreCase("maryam") && password.equalsIgnoreCase("dummy");
	}
}
