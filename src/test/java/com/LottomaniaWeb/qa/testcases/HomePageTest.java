package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;


public class HomePageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	GamePage gamePage;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}
	
	@Test(priority=1)
	public void selectGameTest() throws InterruptedException {
		gamePage = homePage.selectGame();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}