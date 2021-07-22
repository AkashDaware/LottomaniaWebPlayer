package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForExtra7;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForExtra7Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForExtra7 extra7;
	public BetPlacePageForExtra7Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		extra7 = gamePage.selectBetType18();

	}

	@Test(priority = 1)
	public void Extra7BetSelection() throws InterruptedException {
		extra7.betTypeSelection();
		extra7.selectPanel1forExtra7();
		extra7.betTypeSelection();
		extra7.selectPanel2forExtra7();
		extra7.betTypeSelection();
		extra7.selectPanel3forExtra7();
		extra7.betTypeSelection();
		extra7.selectPanel4forExtra7();
		extra7.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}