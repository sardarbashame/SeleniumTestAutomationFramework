package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class Step1StartQuoteStep extends ReusableUtility{
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step1StartQuoteStep(WebDriver driver)
	
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    

	public void startstep(String coveragetype) throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@title='Start']")).click();
	    Thread.sleep(2000);
	    By startquoteheading = By.xpath("//h1[text()='Start Quote']");
	    waitForElementToAppear(startquoteheading);
	    js.executeScript("window.scrollTo(0,200)");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@data-omni-key='CoverageType']//input")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@data-omni-key='CoverageType']//*[text()='"+coveragetype+"']")).click();
	    Thread.sleep(500);
	    js.executeScript("window.scrollTo(0,600)");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@data-omni-key='EffectiveDate']//input")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@data-id=\"current-date\"]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("(//button//span[text()='Next'])[1]")).click();
	    Thread.sleep(1000);
	}


}

