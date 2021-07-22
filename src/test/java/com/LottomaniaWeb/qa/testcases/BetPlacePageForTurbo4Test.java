package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForTurbo4;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForTurbo4Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForTurbo4 turbo4;
	public BetPlacePageForTurbo4Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		turbo4 = gamePage.selectBetType14();

	}

	@Test(priority = 1)
	public void Turbo2BetSelection() throws InterruptedException {
		turbo4.betTypeSelection();
		turbo4.selectPanel1forTurbo4();
		turbo4.betTypeSelection();
		turbo4.selectPanel2forTurbo4();
		turbo4.betTypeSelection();
		turbo4.selectPanel3forTurbo4();
		turbo4.betTypeSelection();
		turbo4.selectPanel4forTurbo4();
		turbo4.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
