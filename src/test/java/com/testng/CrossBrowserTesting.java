package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Test
	private void testWithChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver125\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	@Test
	private void testWithFireFox() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
}
