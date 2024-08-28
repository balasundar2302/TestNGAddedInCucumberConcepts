package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	public WebDriver driver;
	@BeforeClass
	private void property() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\TrendsWorkspace\\Testng\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	private void url() {
		driver.get("https://www.facebook.com/");

	}
	
	@Test(dataProvider = "userCredentials")
	private void values(String user, String password) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}
	
	@Test
	@DataProvider
	private Object[][] userCredentials() {
		return new Object[][] {
			{"Bala112233","12345"},
			{"Adactin@123","111111"},
			{"Testng@111","77777"}
		};
				}
	
	
	
	

}
