package com.LottomaniaWeb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LottomaniaWeb.qa.base.TestBase;

public class BetPlacePageForPerm4 extends TestBase{
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
		String betName7 = prop.getProperty("betName7");
		By betTypePerm4 = By.xpath("//a[contains(text()," + betName7+")]");
		
	//Add to bet slip
	@FindBy(xpath = "//div[3]/button[. = 'add to play slip']")
	WebElement addToSlip;

	//Initialize the page object
	public BetPlacePageForPerm4() {
		PageFactory.initElements(driver, this);
	}

	//Action
	public void betTypeSelection() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(betTypeDropDown));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(250, 0)");	
		betTypeDropDown.click();
		driver.findElement(betTypePerm4).click();
	}
	
	public void selectPanel1forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel2forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel3forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber10 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel4forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber5 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber6 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel5forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber4 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber7 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber8 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber9 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber10 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber11 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber12 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel6forPerm4() {
		driver.findElement(By.xpath("//li[" + betNumber +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber2 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber3 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber11 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber12 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber13 +"]/input")).click();
		driver.findElement(By.xpath("//li[" + betNumber14 +"]/input")).click();
		addToSlip.click();
	}
	
	public void selectPanel1forPerm4Double() {
		//Steps are same as in method selectPanel1forPerm2
		driver.findElement(By.xpath(prop.getProperty("dr1"))).click();
	}
	
	public void selectPanel2forPerm4Double() {
		driver.findElement(By.xpath(prop.getProperty("dr2"))).click();
	}

	public void selectPanel3forPerm4Double() {;
		driver.findElement(By.xpath(prop.getProperty("dr3"))).click();
	}
	
	public void selectPanel4forPerm4Double() {
		driver.findElement(By.xpath(prop.getProperty("dr4"))).click();
	}
	
	public void selectPanel5forPerm4Double() {
		driver.findElement(By.xpath(prop.getProperty("dr5"))).click();
	}
	
	public void selectPanel6forPerm4Double() {
		driver.findElement(By.xpath(prop.getProperty("dr6"))).click();
	}
	
	public void selectPanel1forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr1"))).click();
		}
	
	public void selectPanel2forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr2"))).click();
		}
	
	public void selectPanel3forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr3"))).click();
		}
	
	public void selectPanel4forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr4"))).click();
		}
	
	public void selectPanel5forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr5"))).click();
		}
	
	public void selectPanel6forPerm4Machine() {
		//Steps are same as in Panel1 of Normal and Double
		driver.findElement(By.xpath(prop.getProperty("Mr6"))).click();
		}
	
	public void pay() throws InterruptedException {
		payNow.click();
		Thread.sleep(1000L);
	}	
}
