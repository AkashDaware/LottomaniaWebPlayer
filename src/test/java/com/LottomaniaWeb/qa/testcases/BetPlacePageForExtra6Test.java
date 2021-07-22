package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForExtra6;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForExtra6Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForExtra6 extra6;
	public BetPlacePageForExtra6Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		extra6 = gamePage.selectBetType17();

	}

	@Test(priority = 1)
	public void Extra6BetSelection() throws InterruptedException {
		extra6.betTypeSelection();
		extra6.selectPanel1forExtra6();
		extra6.betTypeSelection();
		extra6.selectPanel2forExtra6();
		extra6.betTypeSelection();
		extra6.selectPanel3forExtra6();
		extra6.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}