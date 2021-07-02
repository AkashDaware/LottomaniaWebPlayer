package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForNap4;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForNap4Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForNap4 nap4;
	public BetPlacePageForNap4Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		nap4 = gamePage.selectBetType5();

	}

	@Test(priority = 1)
	public void Nap4BetSelection() throws InterruptedException {
		nap4.betTypeSelection();
		nap4.selectPanel1forNap4();
		nap4.betTypeSelection();
		nap4.selectPanel2forNap4();
		nap4.betTypeSelection();
		nap4.selectPanel3forNap4();
		nap4.betTypeSelection();
		nap4.selectPanel4forNap4Double();
		nap4.betTypeSelection();
		nap4.selectPanel5forNap4Double();
		nap4.betTypeSelection();
		nap4.selectPanel6forNap4Double();
		nap4.betTypeSelection();
		nap4.selectPanel7forNap4Machine();
		nap4.betTypeSelection();
		nap4.selectPanel8forNap4Machine();
		nap4.betTypeSelection();
		nap4.selectPanel9forNap4Machine();
		nap4.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}