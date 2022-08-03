package com.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{


	int starts = 1; int Ends = 2;
	
	public boolean retry(ITestResult result) {
	
		if (starts <= Ends) {
			starts++;
			return true;
		}
		
		return false;
	}

}
