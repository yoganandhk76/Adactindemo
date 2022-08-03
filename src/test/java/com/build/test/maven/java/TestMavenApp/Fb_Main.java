package com.build.test.maven.java.TestMavenApp;

public class Fb_Main extends Creating_Fb{

	public static void main(String[] args) throws InterruptedException {
		 web();
		 fburl("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805691%7Ce%7Ccreate%20fb%7C&placement=&creative=550525805691&keyword=create%20fb&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-319415840854%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI_ryfwOis-AIVe5NmAh0ETQe9EAAYASAAEgJ9BvD_BwE");
		Fb_values q = new Fb_values();
		first_name(q.getFirstname(), "yoga");
		surname(q.getLastname(), "k");
		Thread.sleep(2000);
		Mobile_num(q.getText(), "7845122356");
		Thread.sleep(2000);
		New_password(q.getPassword(), "virat18");
		Thread.sleep(2000);
		drop_down(q.getDay(), "25");
		Thread.sleep(2000);
		drop_down1(q.getMonth(), "8");
		Thread.sleep(2000);
		drop_down2(q.getYear(), "1997");
	
		
		Thread.sleep(2000);
		Gender(q.sex);
		Thread.sleep(2000);
		login(q.signin);
		
	}
	
}
