package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForBankerAll;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForBankerAllTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForBankerAll all;
	public BetPlacePageForBankerAllTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		all = gamePage.selectBetType9();


	}

	@Test(priority = 1)
	public void BankerAllBetSelection() throws InterruptedException {
		all.betTypeSelection();
		all.selectPanel1forBankerAll();
		all.betTypeSelection();
		all.selectPanel2forBankerAll();
		all.betTypeSelection();
		all.selectPanel3forBankerAll();
		all.betTypeSelection();
		all.selectPanel4forBankerAll();
		all.betTypeSelection();
		all.selectPanel5forFirstNumberMachine();
		all.betTypeSelection();
		all.selectPanel6forFirstNumberMachine();
		all.betTypeSelection();
		all.selectPanel7forFirstNumberMachine();
		all.pay();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
