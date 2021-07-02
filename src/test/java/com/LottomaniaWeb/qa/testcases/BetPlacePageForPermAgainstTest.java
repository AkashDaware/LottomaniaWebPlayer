package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForPermAgainst;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForPermAgainstTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForPermAgainst pin;
	public BetPlacePageForPermAgainstTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		pin = gamePage.selectBetType8();


	}

	@Test(priority = 1)
	public void PermAgainstBetSelection() throws InterruptedException {
		pin.betTypeSelection();
		pin.selectPanel1forPermAgainst();
		pin.betTypeSelection();
		pin.selectPanel2forPermAgainst();
		pin.betTypeSelection();
		pin.selectPanel3forPermAgainstDouble();
		pin.betTypeSelection();
		pin.selectPanel4forPermAgainstDouble();
		pin.betTypeSelection();
		pin.selectPanel5forPermAgainstDouble();
		pin.betTypeSelection();
		pin.selectPanel6forPermAgainstDouble();
		pin.betTypeSelection();
		pin.selectPanel1forPermAgainst();
		pin.selectPanel7forPermAgainstMachine();
		pin.betTypeSelection();
		pin.selectPanel2forPermAgainst();
		pin.selectPanel8forPermAgainstMachine();
		pin.pay();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
