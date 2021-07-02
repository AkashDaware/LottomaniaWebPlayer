package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;


public class BetPlacePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	public BetPlacePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		betPlacePage = gamePage.selectBetType();
}
	
	
	@Test(priority = 1)
	public void Nap2BetSelection() throws InterruptedException {
		betPlacePage.selectPanel1ForNap2();
		gamePage.selectBetType();
		betPlacePage.selectPanel2forNap2();
		gamePage.selectBetType();
		betPlacePage.selectPanel3forNap2Double();
		gamePage.selectBetType();
		betPlacePage.selectPanel4forNap2Double();
		gamePage.selectBetType();
		betPlacePage.selectPanel5forNap2Machine();
		gamePage.selectBetType();
		betPlacePage.selectPanel6forNap2Machine();
		betPlacePage.pay();
		}
	
	@Test(priority = 2)
	public void Nap3BetSelection() throws InterruptedException {
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel1forNap3();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel2forNap3();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel3forNap3();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel4forNap3Double();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel5forNap3Double();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel6forNap3Double();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel7forNap3Machine();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel8forNap3Machine();
		betPlacePage.betTypeSelection();
		betPlacePage.selectPanel9forNap3Machine();
		betPlacePage.pay();
		}

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
