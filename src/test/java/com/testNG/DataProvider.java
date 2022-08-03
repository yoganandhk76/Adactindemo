package com.testNG;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "Data")
	private void Dataprovider(String text, String text1) {
	System.out.println("name =" + text);
	System.out.println("age =" + text1);
	
	}
	
	@org.testng.annotations.DataProvider
	private Object Data() {
	return new Object[][]

	
		
			{{"kohli","27"},{"dhoni","32"},{"pandya","28"}};		

		
	}
		}
	
	

