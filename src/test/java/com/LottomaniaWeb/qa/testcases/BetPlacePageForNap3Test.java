package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForNap3;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForNap3Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForNap3 nap3;
	public BetPlacePageForNap3Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		nap3 = gamePage.selectBetType11();

	}

	@Test(priority = 1)
	public void Nap3BetSelection() throws InterruptedException {
		nap3.betTypeSelection();
		nap3.selectPanel1forNap3();
		nap3.betTypeSelection();
		nap3.selectPanel2forNap3();
		nap3.betTypeSelection();
		nap3.selectPanel3forNap3();
		nap3.betTypeSelection();
		nap3.selectPanel4forNap3Double();
		nap3.betTypeSelection();
		nap3.selectPanel5forNap3Double();
		nap3.betTypeSelection();
		nap3.selectPanel6forNap3Double();
		nap3.betTypeSelection();
		nap3.selectPanel7forNap3Double();
		nap3.betTypeSelection();
		nap3.selectPanel8forNap3Machine();
		nap3.betTypeSelection();
		nap3.selectPanel9forNap3Machine();
		nap3.betTypeSelection();
		nap3.selectPanel10forNap3Machine();
		nap3.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
