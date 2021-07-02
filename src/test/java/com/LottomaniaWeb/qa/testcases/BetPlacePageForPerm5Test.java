package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForPerm5;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForPerm5Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForPerm5 perm5;
	public BetPlacePageForPerm5Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		perm5 = gamePage.selectBetType4();
}

	@Test(priority = 1)
	public void Perm5BetSelectionNormal() throws InterruptedException {
		perm5.betTypeSelection();
		perm5.selectPanel1forPerm5();
		perm5.betTypeSelection();
		perm5.selectPanel2forPerm5();
		perm5.betTypeSelection();
		perm5.selectPanel3forPerm5();
		perm5.betTypeSelection();
		perm5.selectPanel4forPerm5();
		perm5.betTypeSelection();
		perm5.selectPanel5forPerm5();
		perm5.betTypeSelection();
		perm5.selectPanel6forPerm5();
		perm5.pay();
	}

	@Test(priority = 2)
	public void Perm5BetSelectionDouble() throws InterruptedException {
		perm5.betTypeSelection();
		perm5.selectPanel1forPerm5();
		perm5.selectPanel1forPerm5Double();
		perm5.betTypeSelection();
		perm5.selectPanel2forPerm5();
		perm5.selectPanel2forPerm5Double();
		perm5.betTypeSelection();
		perm5.selectPanel3forPerm5();
		perm5.selectPanel3forPerm5Double();
		perm5.betTypeSelection();
		perm5.selectPanel4forPerm5();
		perm5.selectPanel4forPerm5Double();
		perm5.betTypeSelection();
		perm5.selectPanel5forPerm5();
		perm5.selectPanel5forPerm5Double();
		perm5.betTypeSelection();
		perm5.selectPanel6forPerm5();
		perm5.selectPanel6forPerm5Double();
		perm5.pay();
	}	
	
	@Test(priority = 3)
	public void Perm5BetSelectionMachine() throws InterruptedException {
		perm5.betTypeSelection();
		perm5.selectPanel1forPerm5();
		perm5.selectPanel1forPerm5Machine();
		perm5.betTypeSelection();
		perm5.selectPanel2forPerm5();
		perm5.selectPanel2forPerm5Machine();
		perm5.betTypeSelection();
		perm5.selectPanel3forPerm5();
		perm5.selectPanel3forPerm5Machine();
		perm5.betTypeSelection();
		perm5.selectPanel4forPerm5();
		perm5.selectPanel4forPerm5Machine();
		perm5.betTypeSelection();
		perm5.selectPanel5forPerm5();
		perm5.selectPanel5forPerm5Machine();
		perm5.betTypeSelection();
		perm5.selectPanel6forPerm5();
		perm5.selectPanel6forPerm5Machine();
		perm5.pay();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
