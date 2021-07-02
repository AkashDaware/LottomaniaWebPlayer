package com.LottomaniaWeb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LottomaniaWeb.qa.base.TestBase;
import com.LottomaniaWeb.qa.pages.BetPlacePage;
import com.LottomaniaWeb.qa.pages.BetPlacePageForPerm4;
import com.LottomaniaWeb.qa.pages.GamePage;
import com.LottomaniaWeb.qa.pages.HomePage;
import com.LottomaniaWeb.qa.pages.LoginPage;

public class BetPlacePageForPerm4Test extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	GamePage gamePage;
	BetPlacePage betPlacePage;
	BetPlacePageForPerm4 perm4;
	public BetPlacePageForPerm4Test() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		gamePage = homePage.selectGame();
		perm4 = gamePage.selectBetType3();
}

	@Test(priority = 1)
	public void Perm4BetSelectionNormal() throws InterruptedException {
		perm4.betTypeSelection();
		perm4.selectPanel1forPerm4();
		perm4.betTypeSelection();
		perm4.selectPanel2forPerm4();
		perm4.betTypeSelection();
		perm4.selectPanel3forPerm4();
		perm4.betTypeSelection();
		perm4.selectPanel4forPerm4();
		perm4.betTypeSelection();
		perm4.selectPanel5forPerm4();
		perm4.betTypeSelection();
		perm4.selectPanel6forPerm4();
		perm4.pay();
	}

	@Test(priority = 2)
	public void Perm4BetSelectionDouble() throws InterruptedException {
		perm4.betTypeSelection();
		perm4.selectPanel1forPerm4();
		perm4.selectPanel1forPerm4Double();
		perm4.betTypeSelection();
		perm4.selectPanel2forPerm4();
		perm4.selectPanel2forPerm4Double();
		perm4.betTypeSelection();
		perm4.selectPanel3forPerm4();
		perm4.selectPanel3forPerm4Double();
		perm4.betTypeSelection();
		perm4.selectPanel4forPerm4();
		perm4.selectPanel4forPerm4Double();
		perm4.betTypeSelection();
		perm4.selectPanel5forPerm4();
		perm4.selectPanel5forPerm4Double();
		perm4.betTypeSelection();
		perm4.selectPanel6forPerm4();
		perm4.selectPanel6forPerm4Double();
		perm4.pay();
	}	
	
	@Test(priority = 3)
	public void Perm4BetSelectionMachine() throws InterruptedException {
		perm4.betTypeSelection();
		perm4.selectPanel1forPerm4();
		perm4.selectPanel1forPerm4Machine();
		perm4.betTypeSelection();
		perm4.selectPanel2forPerm4();
		perm4.selectPanel2forPerm4Machine();
		perm4.betTypeSelection();
		perm4.selectPanel3forPerm4();
		perm4.selectPanel3forPerm4Machine();
		perm4.betTypeSelection();
		perm4.selectPanel4forPerm4();
		perm4.selectPanel4forPerm4Machine();
		perm4.betTypeSelection();
		perm4.selectPanel5forPerm4();
		perm4.selectPanel5forPerm4Machine();
		perm4.betTypeSelection();
		perm4.selectPanel6forPerm4();
		perm4.selectPanel6forPerm4Machine();
		perm4.pay();
	}	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

