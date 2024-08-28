package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	@BeforeClass
	private void bClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	private void bMethod() {
		System.out.println("Before Method");
	}
	@AfterClass
	private void aClass() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	private void aMethod() {
		System.out.println("After Method");
	}
	@BeforeSuite
	private void bSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	private void aSuite() {
		System.out.println("After Suite");
	}
	@Test
	private void test1() {
		System.out.println("test1");
	}
	@Test
	private void test2() {
		System.out.println("test2");
	}
	@BeforeTest
	private void bTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	private void aTest() {
		System.out.println("After Test");
	}
	
	
}
