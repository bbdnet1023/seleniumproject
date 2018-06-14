package com.mycomapny.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.base.TestBase;

public class LoginPage extends TestBase{

	//page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="")
	WebElement loginBtn;

	@FindBy(xpath="")
	WebElement signUpBtn;
	
	@FindBy(xpath="")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}
