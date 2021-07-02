package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForPerm2;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForPerm2Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForPerm2 perm2;
	public BetPlacePageForPerm2Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		perm2 = gamePage.selectBetType1();


	}

	@Test(priority = 1)
	public void Perm2BetSelection() throws InterruptedException {
		perm2.betTypeSelection();
		perm2.selectPanel1forPerm2();
		perm2.betTypeSelection();
		perm2.selectPanel2forPerm2();
		perm2.betTypeSelection();
		perm2.selectPanel3forPerm2();
		perm2.betTypeSelection();
		perm2.selectPanel4forPerm2();
		perm2.betTypeSelection();
		perm2.selectPanel5forPerm2();
		perm2.betTypeSelection();
		perm2.selectPanel1forPerm2();
		perm2.selectPanel6forPerm2Double();
		perm2.betTypeSelection();
		perm2.selectPanel2forPerm2();
		perm2.selectPanel7forPerm2Double();
		perm2.betTypeSelection();
		perm2.selectPanel3forPerm2();
		perm2.selectPanel8forPerm2Double();
		perm2.betTypeSelection();
		perm2.selectPanel4forPerm2();
		perm2.selectPanel9forPerm2Double();
		perm2.betTypeSelection();
		perm2.selectPanel5forPerm2();
		perm2.selectPanel10forPerm2Double();
		perm2.betTypeSelection();
		perm2.pay();
	}

	@Test(priority = 2)
	public void Perm2BetSelection1() throws InterruptedException {
		perm2.betTypeSelection();
		perm2.selectPanel1forPerm2();
		perm2.selectPanel1forPerm2Machine();
		perm2.betTypeSelection();
		perm2.selectPanel2forPerm2();
		perm2.selectPanel2forPerm2Machine();
		perm2.betTypeSelection();
		perm2.selectPanel3forPerm2();
		perm2.selectPanel3forPerm2Machine();
		perm2.betTypeSelection();
		perm2.selectPanel4forPerm2();
		perm2.selectPanel4forPerm2Machine();
		perm2.betTypeSelection();
		perm2.selectPanel5forPerm2();
		perm2.selectPanel5forPerm2Machine();
		perm2.pay();
	}	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

