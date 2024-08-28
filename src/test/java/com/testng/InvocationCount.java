package com.testng;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test
	private void SearchBar() {
		System.out.println("Mobiles");
	}
	@Test(invocationCount = 2)
	private void products() {
		System.out.println("Count");
	}
	
}
