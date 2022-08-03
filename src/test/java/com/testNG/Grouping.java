package com.testNG;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = "biodata" , dependsOnGroups = "sport")
	private void name() {
		System.out.println("yoga");

	}
	@Test(groups = "biodata" , dependsOnGroups = "sport")
	private void DOB() {
		System.out.println("25/11");
	}
	@Test(groups = "subjects" , dependsOnGroups = "biodata")
	private void Maths() {
        System.out.println("Matrix");		

	}
	@Test(groups = "subjects" ,  dependsOnGroups = "biodata")
	private void English() {
		System.out.println("Grammer");

	}
	@Test(groups = "sport")
	private void Cricket() {
		System.out.println("batsman");

	}
	@Test(groups = "sport")
	private void Football() {
		System.out.println("farword");

	}


}
