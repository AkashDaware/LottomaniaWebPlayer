package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForPerm3;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForPerm3Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForPerm3 perm3;
	public BetPlacePageForPerm3Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		perm3 = gamePage.selectBetType2();
	}

	@Test(priority = 1)
	public void Perm3BetSelection() throws InterruptedException {
		perm3.betTypeSelection();
		perm3.selectPanel1forPerm3();
		perm3.betTypeSelection();
		perm3.selectPanel2forPerm3();
		perm3.betTypeSelection();
		perm3.selectPanel3forPerm3();
		perm3.betTypeSelection();
		perm3.selectPanel4forPerm3();
		perm3.betTypeSelection();
		perm3.selectPanel5forPerm3();
		perm3.betTypeSelection();
		perm3.selectPanel1forPerm3();
		perm3.selectPanel6forPerm3Double();
		perm3.betTypeSelection();
		perm3.selectPanel2forPerm3();
		perm3.selectPanel7forPerm3Double();
		perm3.betTypeSelection();
		perm3.selectPanel3forPerm3();
		perm3.selectPanel8forPerm3Double();
		perm3.betTypeSelection();
		perm3.selectPanel4forPerm3();
		perm3.selectPanel9forPerm3Double();
		perm3.betTypeSelection();
		perm3.selectPanel5forPerm3();
		perm3.selectPanel10forPerm3Double();
		perm3.betTypeSelection();
		perm3.pay();
	}

	@Test(priority = 2)
	public void Perm2BetSelection1() throws InterruptedException {
		perm3.betTypeSelection();
		perm3.selectPanel1forPerm3();
		perm3.selectPanel1forPerm3Machine();
		perm3.betTypeSelection();
		perm3.selectPanel2forPerm3();
		perm3.selectPanel2forPerm3Machine();
		perm3.betTypeSelection();
		perm3.selectPanel3forPerm3();
		perm3.selectPanel3forPerm3Machine();
		perm3.betTypeSelection();
		perm3.selectPanel4forPerm3();
		perm3.selectPanel4forPerm3Machine();
		perm3.betTypeSelection();
		perm3.selectPanel5forPerm3();
		perm3.selectPanel5forPerm3Machine();
		perm3.pay();
	}	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
