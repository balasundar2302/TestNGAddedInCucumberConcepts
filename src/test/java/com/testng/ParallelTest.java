package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
	@Test
	private void launchWithGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver127\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	private void launchwithWhatsapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver127\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
	}

	
	
}
