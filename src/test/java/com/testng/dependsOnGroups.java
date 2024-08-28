package com.testng;

import org.testng.annotations.Test;

import com.pom.LoginPage;

public class dependsOnGroups {
	
	@Test(groups = "sanity")
	private void paymentPage() {
		System.out.println("PAYMENT");
	}
	@Test(groups  = "sanity")
	private void homePage() {
		System.out.println("HOME");
	}
	@Test(groups = "smoke",priority = 0)
	private void signUpPage() {
		System.out.println("CREATE ACCOUNT");
	}
	@Test(groups = "smoke",priority = 1)
	private void loginPage() {
		System.out.println("LOGIN");
	}

}
