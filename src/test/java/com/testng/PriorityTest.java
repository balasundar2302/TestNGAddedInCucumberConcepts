package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 2)
	private void signUp() {
		System.out.println("Create Account");
	}
	@Test(priority = 1)
	private void browserLaunch() {
		System.out.println("Chrome");
	}
	@Test(priority = 3)
	private void login() {
		System.out.println("Login");
	}
}
