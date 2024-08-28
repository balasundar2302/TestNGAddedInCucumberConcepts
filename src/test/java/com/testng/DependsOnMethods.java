package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.LoginPage;

public class DependsOnMethods {
public WebDriver driver;
	
	@Test(dependsOnMethods = "browserLaunch")
	private void userName() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	    username.sendKeys("Bala112233");

	}
	@Test
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver125\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/index.php");
		    driver.manage().window().maximize();
	}
	@Test(dependsOnMethods = "userName")
	private void password() {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("B953RN");
	}

}
