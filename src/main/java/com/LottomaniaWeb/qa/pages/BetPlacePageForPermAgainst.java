package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LottomaniaWeb.qa.base.TestBase;

public class BetPlacePageForPermAgainst extends TestBase{
	GamePage gamePage;
	//PageFactory or Object Repository
	
	// Radio of Banker Number
	@FindBy(xpath = "//input[@type = 'radio' and @value='1']")
	WebElement bankerRadioButton;
	
	//Radio Button Against Number
	@FindBy(xpath= "//input[@type = 'radio' and @value='2']")
	WebElement againstRadioButton;
	
	@FindBy(xpath = "//button[. = 'pay now']")
	WebElement payNow;
	
	//Select Bet Type Dropdown
		@FindBy(xpath = "//button[@id='Perm']")
		WebElement betTypeDropDown;
	
	// Number Selection
	String betNumber = prop.getProperty("no1");
	String betNumber2 = prop.getProperty("no2");
	String betNumber3 = prop.getProperty("no3");
	String betNumber4 = prop.getProperty("no4");
	String betNumber5= prop.getProperty("no5");
	String betNumber6 = prop.getProperty("no6");
	String betNumber7= prop.getProperty("no7");
	String betNumber8 = prop.getProperty("no8");
	String betNumber9= prop.getProperty("no9");
	String betNumber10 = prop.getProperty("no10");
	String betNumber11= prop.getProperty("no11");
	String betNumber12 = prop.getProperty("no12");
	String betNumber13= prop.getProperty("no13");
	String betNumber14 = prop.getProperty("no14");
	String betNumber15 = prop.getProperty("no15");
	String betNumber16 = prop.getProperty("no16");

	//Select Bet Type
		String betName10 = prop.getProperty("betName10");
		By betTypePermAgainst = By.xpath("//a[contains(text()," + betName10+")]");
		
	//Add to bet slip
	@FindBy(xpath = "//div[3]/button[. = 'add to play slip']")
	WebElement addToSlip;

	//Initialize the page object
	public BetPlacePageForPermAgainst() {
		PageFactory.initElements(driver, this);
	}

	//Action
	public void betTypeSelection() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePermAgainst).click();
	}
	
	public void selectPanel1forPermAgainst() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel2forPermAgainst() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel3forPermAgainstDouble() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		addToSlip.click();
		driver.findElement(By.xpath(prop.getProperty("dr3"))).click();
	}
	
	public void selectPanel4forPermAgainstDouble() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		addToSlip.click();
		driver.findElement(By.xpath(prop.getProperty("dr4"))).click();
	}

	public void selectPanel5forPermAgainstDouble() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		addToSlip.click();
		driver.findElement(By.xpath(prop.getProperty("dr5"))).click();
	}
	
	public void selectPanel6forPermAgainstDouble() {
		bankerRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		againstRadioButton.click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		addToSlip.click();
		driver.findElement(By.xpath(prop.getProperty("dr6"))).click();
	}
	
	public void selectPanel7forPermAgainstMachine() {
		driver.findElement(By.xpath(prop.getProperty("Mr7"))).click();
	}
	
	public void selectPanel8forPermAgainstMachine() {
		driver.findElement(By.xpath(prop.getProperty("Mr8"))).click();
	}
	
	public void pay() throws InterruptedException {
		payNow.click();
		Thread.sleep(1000L);
	}	
	
}