package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class SyncQuotetoC1 extends ReusableUtility{
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public SyncQuotetoC1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public JavascriptExecutor syncquote() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		Thread.sleep(10000);
		
		 driver.findElement(By.xpath("//a[text()='Commission & Fees']")).click();
		 Thread.sleep(5000);
		 js.executeScript("window.scrollTo(0,2800)");
		 Thread.sleep(10000);
		 js.executeScript("var result = document.evaluate(\"//button//span[normalize-space()='Generate Tax/Sync Quote - Save Declining Carrier']\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext();input.scrollIntoView();input.click()");
		 By quotecallsuccessmessage = By.xpath("//div[text()='Quote was successfully synced to C1']");
		 waitForElementToAppear(quotecallsuccessmessage);
		 Thread.sleep(6000);
		 js.executeScript("window.close()");
		 Thread.sleep(5000);
		 return js;

	}


}

