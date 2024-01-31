package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRiskLocation {
	
	WebDriver driver;
	
	public AddRiskLocation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void addRiskLoc(String riskloc) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//ul//a//descendant-or-self::*[text()='Location Addresses']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//*[@data-omni-key=\"RiskLocationBlock\"]//span[contains(text(), 'Add Location') or contains(text(), 'Add HwkLocation')])")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("((//*[text()='Risk Location Address'])//following::button)[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@placeholder=\"Enter an address\"]/..//input)[1]")).sendKeys(riskloc);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//span[@vlocity_ins-typeahead_typeahead_slds and contains(text(),'"+riskloc+"')])[1]")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Thread.sleep(5000);
		
	}


}

