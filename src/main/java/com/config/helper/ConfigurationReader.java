  package com.config.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		File f =new File("C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\src\\com\\config\\property\\config.properties");
		FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
		p.load(fis);
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getusername() {
		String email = p.getProperty("email");
	return email;
	}
	public String getpassword() {
		String password = p.getProperty("password");
	return password;
	
	}
}

