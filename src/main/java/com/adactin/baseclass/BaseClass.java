package com.adactin.baseclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static WebDriver propertySet(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver125\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(" webdriver.gecko.driver", "C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\Driver125\\chromedriver.exe");
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void alerts(String methods,String value) {
		Alert a=driver.switchTo().alert();
		if (methods.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (methods.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
		else if (methods.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value);
		}
		else if (methods.equalsIgnoreCase("text")) {
			String text = a.getText();
			System.out.println(text);
		}	
	}
	
	public static void dropDowns(WebElement element,String methods,String value) {
		Select s=new Select(element);
		if (methods.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (methods.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (methods.equalsIgnoreCase("Index")) {
			int int1 = Integer.parseInt(value);
			s.selectByIndex(int1);
			
			
		}
	}
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
