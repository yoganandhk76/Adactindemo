package com.testNG;

import org.testng.annotations.Test;

public class MethodGrouping {

	@Test(groups = "Biodata", dependsOnGroups = "Sports")
	private void name() {
		System.out.println("yoga");

	}
	@Test(groups = "Biodata", dependsOnGroups = "Sports")
	private void DOB() {
		System.out.println("25/11");
	}
	@Test(groups = "Subjects", dependsOnGroups  = "Biodata")
	private void Maths() {
        System.out.println("Matrix");		

	}
	@Test(groups = "Subjects", dependsOnGroups = "Biodata")
	private void English() {
		System.out.println("Grammer");

	}
	@Test(groups = "Sports")
	private void Cricket() {
		System.out.println("batsman");

	}
	@Test(groups = "Sports")
	private void Football() {
		System.out.println("farword");

	}
}
