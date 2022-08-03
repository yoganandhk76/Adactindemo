package com.build.test.maven.java.TestMavenApp;

public class Main_class extends base_class{

	public static void main(String[] args) throws InterruptedException {
		
		browser();
		fblogin("https://www.facebook.com/login/");
		Pojo_class p = new Pojo_class();
		username(p.getEmail(), "khkgjgdhgfhgf");
		Thread.sleep(3000);
		passward(p.getPass(), "7845565");
		Thread.sleep(3000);
		click(p.submit);
		
	}
}
