package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForTurbo2Split;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForTurbo2SplitTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForTurbo2Split turbo2split;
	public BetPlacePageForTurbo2SplitTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		turbo2split = gamePage.selectBetType16();

	}

	@Test(priority = 1)
	public void Turbo2BetSelection() throws InterruptedException {
		turbo2split.betTypeSelection();
		turbo2split.selectPanel1forTurbo2Split();
		turbo2split.betTypeSelection();
		turbo2split.selectPanel2forTurbo2Split();
		turbo2split.betTypeSelection();
		turbo2split.selectPanel3forTurbo2Split();
		turbo2split.betTypeSelection();
		turbo2split.selectPanel4forTurbo2Split();
		turbo2split.betTypeSelection();
		turbo2split.selectPanel5forTurbo2Split();
		turbo2split.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
