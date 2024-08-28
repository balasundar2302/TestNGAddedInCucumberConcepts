package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	public WebDriver driver;
	@BeforeClass
	private void propertySet() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver125\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	private void urlLaunch() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test
	@Parameters({"username","password"})
	private void credentials(String username,String password) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='Submit']")).click();

	}
	
}
