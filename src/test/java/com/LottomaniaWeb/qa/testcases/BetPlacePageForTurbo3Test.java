package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForTurbo3;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForTurbo3Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForTurbo3 turbo3;
	public BetPlacePageForTurbo3Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		turbo3 = gamePage.selectBetType13();

	}

	@Test(priority = 1)
	public void Turbo2BetSelection() throws InterruptedException {
		turbo3.betTypeSelection();
		turbo3.selectPanel1forTurbo3();
		turbo3.betTypeSelection();
		turbo3.selectPanel2forTurbo3();
		turbo3.betTypeSelection();
		turbo3.selectPanel3forTurbo3();
		turbo3.betTypeSelection();
		turbo3.selectPanel4forTurbo3();
		turbo3.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}