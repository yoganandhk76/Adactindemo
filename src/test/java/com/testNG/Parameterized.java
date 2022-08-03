package com.testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test()
	@Parameters({"username" , "password" ,  "mob"})
	private void credentials(@Optional("ravi")String username, @Optional("123@asd")String password , @Optional("12523652")String mob) {
   System.out.println("username ="+ username);
   System.out.println("password =" + password);
   System.out.println("mobile num =" + mob);
 
   
   
   
	}
	
}
