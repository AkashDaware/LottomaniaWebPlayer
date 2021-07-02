package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LottomaniaWeb.qa.base.TestBase;

public class GamePage extends TestBase{
	//PageFactory or Object Repository
	//Select Bet Type Dropdown
	@FindBy(xpath = "//button[@id='Perm']")
	WebElement betTypeDropDown;
	
	//Select Bet Type
	String betName = prop.getProperty("betName");
	By betType = By.xpath("//a[contains(text()," + betName+")]");
	
	//Select Bet Type for Perm 2
		String betName5 = prop.getProperty("betName5");
		By betTypePerm2 = By.xpath("//a[contains(text()," + betName5+")]");
		
		//Select Bet Type for Perm 3
				String betName6 = prop.getProperty("betName6");
				By betTypePerm3 = By.xpath("//a[contains(text()," + betName6+")]");
				
				//Select Bet Type for Perm 4
				String betName7 = prop.getProperty("betName7");
				By betTypePerm4 = By.xpath("//a[contains(text()," + betName7+")]");
				
				//Select Bet Type for Perm 5
				String betName8 = prop.getProperty("betName8");
				By betTypePerm5 = By.xpath("//a[contains(text()," + betName8+")]");
				
				//Select Bet Type for Nap 4
				String betName3 = prop.getProperty("betName3");
				By betTypeNap4 = By.xpath("//a[contains(text()," + betName3+")]");
				
				//Select Bet Type for Nap 5
				String betName4 = prop.getProperty("betName4");
				By betTypeNap5 = By.xpath("//a[contains(text()," + betName4+")]");
				
				//Select Bet Type for BankerAgainst
				String betName9 = prop.getProperty("betName9");
				By betTypeBankerAll = By.xpath("//a[contains(text()," + betName9+")]");
				
				//Select Bet Type for PermAgainst
				String betName10 = prop.getProperty("betName10");
				By betTypePermAgainst = By.xpath("//a[contains(text()," + betName10+")]");

				//Select Bet Type for FirstNumber
				String betName11 = prop.getProperty("betName11");
				By betTypeFirstNumber = By.xpath("//a[contains(text()," + betName11+")]");

				
	//Initialize the object
	public GamePage() {
		PageFactory.initElements(driver, this);
	}
	
	public BetPlacePage selectBetType() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betType).click();
		return new BetPlacePage();
	}
	
	public BetPlacePageForPerm2 selectBetType1() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm2).click();
		return new BetPlacePageForPerm2();
	}
	
	public BetPlacePageForPerm3 selectBetType2() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm3).click();
		return new BetPlacePageForPerm3();
	}
	
	public BetPlacePageForPerm4 selectBetType3() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm4).click();
		return new BetPlacePageForPerm4();
	}
	
	public BetPlacePageForPerm5 selectBetType4() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm5).click();
		return new BetPlacePageForPerm5();
	}
	
	public BetPlacePageForNap4 selectBetType5() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap4).click();
		return new BetPlacePageForNap4();
	}
	
	public BetPlacePageForNap5 selectBetType6() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap5).click();
		return new BetPlacePageForNap5();
	}
	
	public BetPlacePageForFirstNumber selectBetType7() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeFirstNumber).click();
		return new BetPlacePageForFirstNumber();
	}

	public BetPlacePageForPermAgainst selectBetType8() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePermAgainst).click();
		return new BetPlacePageForPermAgainst();
	}
	
	public BetPlacePageForBankerAll selectBetType9() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeBankerAll).click();
		return new BetPlacePageForBankerAll();
	}
}
