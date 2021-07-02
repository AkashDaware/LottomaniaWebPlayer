package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForNap5;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForNap5Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForNap5 nap5;
	public BetPlacePageForNap5Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		nap5 = gamePage.selectBetType6();

	}

	@Test(priority = 1)
	public void Nap5BetSelection() throws InterruptedException {
		nap5.betTypeSelection();
		nap5.selectPanel1forNap5();
		nap5.betTypeSelection();
		nap5.selectPanel2forNap5();
		nap5.betTypeSelection();
		nap5.selectPanel3forNap5();
		nap5.betTypeSelection();
		nap5.selectPanel4forNap5Double();
		nap5.betTypeSelection();
		nap5.selectPanel5forNap5Double();
		nap5.betTypeSelection();
		nap5.selectPanel6forNap5Double();
		nap5.betTypeSelection();
		nap5.selectPanel7forNap5Double();
		nap5.betTypeSelection();
		nap5.selectPanel8forNap5Machine();
		nap5.betTypeSelection();
		nap5.selectPanel9forNap5Machine();
		nap5.betTypeSelection();
		nap5.selectPanel10forNap5Machine();
		nap5.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
