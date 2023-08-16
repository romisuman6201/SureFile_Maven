package com.Sample;

import org.testng.annotations.Test;

public class CreateUser {
	
	@Test(groups = "Smoke")
	public void create() {
		System.out.println("===User is created===");
	}
	@Test(groups = "regression")
	public void createAnother() {
		System.out.println("===Another User is created===");
	}

}
