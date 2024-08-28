package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.baseclass.BaseClass;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	public static WebDriver driver=Test_Runner.driver;
	@Given("^user Launch The Browser$")
	public void user_Launch_The_Browser() throws Throwable {
	    driver.get("https://adactinhotelapp.com/index.php");
	    driver.manage().window().maximize();
	}

	@When("^user Enter Their Username In Username Field$")
	public void user_Enter_Their_Username_In_Username_Field() throws Throwable {
	    WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
//	    username.sendKeys("Bala112233");
	    userInput(username, "Bala112233");
	}

	@When("^user Enter Their Password In Password Field$")
	public void user_Enter_Their_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("B953RN");
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}

	@When("^user Select A Hotel Location$")
	public void user_Select_A_Hotel_Location() throws Throwable {
	   WebElement location = driver.findElement(By.id("location"));
	Select s=new Select(location);
	s.selectByVisibleText("London");
	
	}
	
}
