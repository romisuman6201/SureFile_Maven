package com.Sample;

import org.testng.annotations.Test;

public class ModifyUser {
	@Test(groups="regression")
	public void modify() {
		System.out.println("===User is modified===");
	}
	@Test(groups = "Smoke")
	public void createUserModified() {
		System.out.println("===Created User is Modified===");
	}

}
