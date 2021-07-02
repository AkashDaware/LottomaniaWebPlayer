package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LottomaniaWeb.qa.base.TestBase;

public class BetPlacePageForPerm2 extends TestBase{
	GamePage gamePage;
	//PageFactory or Object Repository
	
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
		String betName5 = prop.getProperty("betName5");
		By betType = By.xpath("//a[contains(text()," + betName5+")]");
		
	//Add to bet slip
	@FindBy(xpath = "//div[3]/button[. = 'add to play slip']")
	WebElement addToSlip;

	//Initialize the page object
	public BetPlacePageForPerm2() {
		PageFactory.initElements(driver, this);
	}

	//Action
	public void betTypeSelection() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betType).click();
	}
	
	public void selectPanel1forPerm2() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel2forPerm2() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel3forPerm2() {
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber10 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel4forPerm2() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber11 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber12 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel5forPerm2() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber11 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber12 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber13 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber14 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber15 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel6forPerm2Double() {
		//Steps are same as in method selectPanel1forPerm2
		driver.findElement(By.xpath(prop.getProperty("dr6"))).click();
	}
	
	public void selectPanel7forPerm2Double() {
		driver.findElement(By.xpath(prop.getProperty("dr7"))).click();
	}
	
	public void selectPanel8forPerm2Double() {;
		driver.findElement(By.xpath(prop.getProperty("dr8"))).click();
	}
	
	public void selectPanel9forPerm2Double() {
		driver.findElement(By.xpath(prop.getProperty("dr9"))).click();
	}
	
	public void selectPanel10forPerm2Double() {
		driver.findElement(By.xpath(prop.getProperty("dr10"))).click();
	}
	
	public void selectPanel1forPerm2Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr1"))).click();
		}
	
	public void selectPanel2forPerm2Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr2"))).click();
		}
	
	public void selectPanel3forPerm2Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr3"))).click();
		}
	
	public void selectPanel4forPerm2Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr4"))).click();
		}
	
	public void selectPanel5forPerm2Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr5"))).click();
		}
	
	public void pay() throws InterruptedException {
		payNow.click();
		Thread.sleep(1000L);
	}	
}
	