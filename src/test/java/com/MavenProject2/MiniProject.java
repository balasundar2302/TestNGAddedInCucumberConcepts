package com.MavenProject2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.pom.LoginPage;
import com.pom.SingleTonDesignPattern;
import com.property.ConfigurationHelper;

public class MiniProject extends BaseClass {
	public static void main(String[] args) throws IOException {
		
//		propertySet("chrome");
//		ConfigurationHelper ch=new ConfigurationHelper();
		propertySet(ConfigurationHelper.getInstance().getBrowser());
			
//		launchUrl("https://adactinhotelapp.com/index.php");
		launchUrl(ConfigurationHelper.getInstance().getUrl());
		
//		LoginPage lp=new LoginPage(driver);
		SingleTonDesignPattern sdp=new SingleTonDesignPattern(driver);
		
//	    WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//	    userInput(lp.getUser(), "Bala112233");
//	    userInput(sdp.getLoginPage().getUser(), "Bala112233");
		userInput(sdp.getLoginPage().getUser(), ConfigurationHelper.getInstance().getUserName());
		
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		userInput(lp.getPassword(), "B953RN");
//		userInput(sdp.getLoginPage().getPassword(), "B953RN");
	    userInput(sdp.getLoginPage().getPassword(), ConfigurationHelper.getInstance().getPassword());
	    
//		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
//		clickOnElement(login);
		clickOnElement(sdp.getLoginPage().getLoginButton());
		
	}

}
