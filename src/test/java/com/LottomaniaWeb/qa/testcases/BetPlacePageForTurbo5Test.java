package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForTurbo5;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForTurbo5Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForTurbo5 turbo5;
	public BetPlacePageForTurbo5Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		turbo5 = gamePage.selectBetType15();

	}

	@Test(priority = 1)
	public void Turbo5BetSelection() throws InterruptedException {
		turbo5.betTypeSelection();
		turbo5.selectPanel1forTurbo5();
		turbo5.betTypeSelection();
		turbo5.selectPanel2forTurbo5();
		turbo5.betTypeSelection();
		turbo5.selectPanel3forTurbo5();
		turbo5.betTypeSelection();
		turbo5.selectPanel4forTurbo5();
		turbo5.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}