package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LottomaniaWeb.qa.base.TestBase;

public class HomePage extends TestBase	{
	
	//PageFactory or Object Repository
	@FindBy(xpath = "//button[@id='banker']")
	WebElement eventButton;
	
	//SelectGame
	String gameName = prop.getProperty("gameName");
	By gameLink =By.xpath("//a[contains(text()," + gameName +")]");
	
	
	// Initializing the Page Object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public  GamePage selectGame() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(eventButton));
		eventButton.click();
		driver.findElement(gameLink).click();
		String text = eventButton.getText();
		if(!text.equalsIgnoreCase(gameName)) {
		eventButton.click();
		driver.findElement(gameLink).click();
		}
		
		return new GamePage();
	
	
}
}
