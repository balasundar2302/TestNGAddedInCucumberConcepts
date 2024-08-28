package com.testng;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions = Exception.class)
	private void method1() {
		int i=20;
		System.out.println(i/0);
	}

	@Test(expectedExceptions = NullPointerException.class)
	private void method2() {
		Map<String, Integer>m=new TreeMap<String, Integer>();
		m.put(null, 100);
		System.out.println(m);
		
		
	}
}
