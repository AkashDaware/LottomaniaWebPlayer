package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForNap2;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForNap2Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForNap2 nap2;
	public BetPlacePageForNap2Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		nap2 = gamePage.selectBetType10();

	}

	@Test(priority = 1)
	public void Nap2BetSelection() throws InterruptedException {
		nap2.betTypeSelection();
		nap2.selectPanel1forNap2();
		nap2.betTypeSelection();
		nap2.selectPanel2forNap2();
		nap2.betTypeSelection();
		nap2.selectPanel3forNap2();
		nap2.betTypeSelection();
		nap2.selectPanel4forNap2Double();
		nap2.betTypeSelection();
		nap2.selectPanel5forNap2Double();
		nap2.betTypeSelection();
		nap2.selectPanel6forNap2Double();
		nap2.betTypeSelection();
		nap2.selectPanel7forNap2Machine();
		nap2.betTypeSelection();
		nap2.selectPanel8forNap2Machine();
		nap2.betTypeSelection();
		nap2.selectPanel9forNap2Machine();
		nap2.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
