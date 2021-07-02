package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForFirstNumber;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForFirstNumberTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForFirstNumber first;
	public BetPlacePageForFirstNumberTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		first = gamePage.selectBetType7();


	}

	@Test(priority = 1)
	public void FirstNumberBetSelection() throws InterruptedException {
		first.betTypeSelection();
		first.selectPanel1forFirstNumber();
		first.betTypeSelection();
		first.selectPanel2forFirstNumber();
		first.betTypeSelection();
		first.selectPanel3forFirstNumber();
		first.betTypeSelection();
		first.selectPanel4forFirstNumberDouble();
		first.betTypeSelection();
		first.selectPanel5forFirstNumberDouble();
		first.betTypeSelection();
		first.selectPanel6forFirstNumberDouble();
		first.betTypeSelection();
		first.selectPanel7forFirstNumberMachine();
		first.betTypeSelection();
		first.selectPanel8forFirstNumberMachine();
		first.betTypeSelection();
		first.selectPanel9forFirstNumberMachine();
		first.pay();
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
