package com.testng;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 2000)
	private void element1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("username");
	}
	@Test(timeOut = 4000)
	private void element2() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("password");
	}
	
}
