package com.LottomaniaWeb.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
}
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException {
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}
	
	
	


