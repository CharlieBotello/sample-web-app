package com.fdmgroup;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("chuck") && password.equals("password"))
			return true;
		
		return false;
	}
}
