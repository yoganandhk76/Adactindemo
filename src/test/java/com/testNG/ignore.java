
package com.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore {

	@Ignore
	@Test()
	private void color() {
		System.out.println("red");

	}
	@Test(enabled =false)
	private void car() {
		System.out.println("honda");
	}
    @Test
	private void model() {
		System.out.println("Civic");
	}
}
	

