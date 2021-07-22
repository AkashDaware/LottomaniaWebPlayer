package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LottomaniaWeb.qa.base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory or Object Repository
		@FindBy(xpath = "//a[@title='Login']")
		WebElement login;
		
		@FindBy(name = "userName")
		WebElement userName;
		
		@FindBy(xpath = "//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath ="//input[@value='Login']")
		WebElement submit;
		
		// Initializing the Page Object
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public HomePage login(String un, String pwd) throws InterruptedException {
			login.click();
			Thread.sleep(1000L);
			userName.sendKeys(un);
			password.sendKeys(pwd);
			submit.click();
			return new HomePage();
		}
		
	}



