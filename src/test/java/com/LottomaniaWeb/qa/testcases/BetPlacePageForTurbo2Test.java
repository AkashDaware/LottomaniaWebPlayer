package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForTurbo2;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForTurbo2Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForTurbo2 turbo2;
	public BetPlacePageForTurbo2Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		turbo2 = gamePage.selectBetType12();

	}

	@Test(priority = 1)
	public void Turbo2BetSelection() throws InterruptedException {
		turbo2.betTypeSelection();
		turbo2.selectPanel1forTurbo2();
		turbo2.betTypeSelection();
		turbo2.selectPanel2forTurbo2();
		turbo2.betTypeSelection();
		turbo2.selectPanel3forTurbo2();
		turbo2.betTypeSelection();
		turbo2.selectPanel4forTurbo2();
		turbo2.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
