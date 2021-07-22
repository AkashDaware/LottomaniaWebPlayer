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
				
				//Select Bet Type for Nap 2
				String BetName = prop.getProperty("betName");
				By betTypeNap2 = By.xpath("//a[contains(text()," + BetName+")]");
				
				//Select Bet Type for Nap 3
				String BetName3 = prop.getProperty("betName2");
				By betTypeNap3 = By.xpath("//a[contains(text()," + BetName3+")]");
				
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
				
				//Select Bet Type for Turbo2
				String betName12 = prop.getProperty("betName12");
				By betTypeTurbo2 = By.xpath("//a[contains(text()," + betName12+")]");
				
				//Select Bet Type for Turbo3
				String betName13 = prop.getProperty("betName13");
				By betTypeTurbo3 = By.xpath("//a[contains(text()," + betName13+")]");
				
				//Select Bet Type for Turbo4
				String betName14 = prop.getProperty("betName14");
				By betTypeTurbo4 = By.xpath("//a[contains(text()," + betName14+")]");
				
				//Select Bet Type for Turbo5
				String betName15 = prop.getProperty("betName15");
				By betTypeTurbo5 = By.xpath("//a[contains(text()," + betName15+")]");
				
				//Select Bet Type for Extra6
				String betName16 = prop.getProperty("betName16");
				By betTypeExtra6 = By.xpath("//a[contains(text()," + betName16+")]");
				
				//Select Bet Type for Extra7
				String betName17 = prop.getProperty("betName17");
				By betTypeExtra7 = By.xpath("//a[contains(text()," + betName17+")]");
				
				//Select Bet Type for Turbo 2 Split
				String betName18 = prop.getProperty("betName18");
				By betTypeTurbo2Split = By.xpath("//a[contains(text()," + betName18+")]");

				
	//Initialize the object
	public GamePage() {
		PageFactory.initElements(driver, this);
	}
	
	public BetPlacePage selectBetType() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betType).click();
		return new BetPlacePage();
	}
	
	public BetPlacePageForPerm2 selectBetType1() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm2).click();
		return new BetPlacePageForPerm2();
	}
	
	public BetPlacePageForPerm3 selectBetType2() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm3).click();
		return new BetPlacePageForPerm3();
	}
	
	public BetPlacePageForPerm4 selectBetType3() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm4).click();
		return new BetPlacePageForPerm4();
	}
	
	public BetPlacePageForPerm5 selectBetType4() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm5).click();
		return new BetPlacePageForPerm5();
	}
	
	public BetPlacePageForNap4 selectBetType5() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap4).click();
		return new BetPlacePageForNap4();
	}
	
	public BetPlacePageForNap5 selectBetType6() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap5).click();
		return new BetPlacePageForNap5();
	}
	
	public BetPlacePageForFirstNumber selectBetType7() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeFirstNumber).click();
		return new BetPlacePageForFirstNumber();
	}

	public BetPlacePageForPermAgainst selectBetType8() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePermAgainst).click();
		return new BetPlacePageForPermAgainst();
	}
	
	public BetPlacePageForBankerAll selectBetType9() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeBankerAll).click();
		return new BetPlacePageForBankerAll();
	}
	
	public BetPlacePageForNap2 selectBetType10() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap2).click();
		return new BetPlacePageForNap2();
	}
	
	public BetPlacePageForNap3 selectBetType11() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeNap3).click();
		return new BetPlacePageForNap3();
	}
	
	public BetPlacePageForTurbo2 selectBetType12() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeTurbo2).click();
		return new BetPlacePageForTurbo2();
	}
	
	public BetPlacePageForTurbo3 selectBetType13() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeTurbo3).click();
		return new BetPlacePageForTurbo3();
	}
	
	public BetPlacePageForTurbo4 selectBetType14() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeTurbo4).click();
		return new BetPlacePageForTurbo4();
	}
	
	public BetPlacePageForTurbo5 selectBetType15() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeTurbo5).click();
		return new BetPlacePageForTurbo5();
	}
	
	public BetPlacePageForTurbo2Split selectBetType16() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeTurbo2Split).click();
		return new BetPlacePageForTurbo2Split();
	}
	
	public BetPlacePageForExtra6 selectBetType17() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeExtra6).click();
		return new BetPlacePageForExtra6();
	}
	
	public BetPlacePageForExtra7 selectBetType18() throws InterruptedException {
		Thread.sleep(5000L);
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypeExtra7).click();
		return new BetPlacePageForExtra7();
	}
}
