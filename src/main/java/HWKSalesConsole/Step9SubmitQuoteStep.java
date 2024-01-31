package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class Step9SubmitQuoteStep extends ReusableUtility{
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step9SubmitQuoteStep(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    

	public void submitquotestep() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		
		 js.executeScript("window.scrollTo(0,1000)");
		 driver.findElement(By.xpath("(//h1[text()='Submit Quote']/../..//button//span[text()='Submit Quote'])[1]")).click();
		 By quotegenerated = By.xpath("//h1//*[text()='Quote']");
		 waitForElementToAppear(quotegenerated);
		 Thread.sleep(4000);
	}


}

