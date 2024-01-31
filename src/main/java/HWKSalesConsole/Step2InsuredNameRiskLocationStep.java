package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step2InsuredNameRiskLocationStep {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step2InsuredNameRiskLocationStep(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
  

	public void insureNamerisklocation() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
	    js.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*//vlocity_ins-omniscript-edit-block/div/div[1]/div")).click();
	    Thread.sleep(500);
	    js.executeScript("window.scrollTo(0,1300)");
	    Thread.sleep(2000);
	  
	    //driver.findElement(By.xpath("//*[text()='Occupancy Type (Usage)']")).click();
	    driver.findElement(By.xpath("(//*[@data-omni-key='OccupancyType']//input)[1]")).click();
	    driver.findElement(By.xpath("//*[@data-omni-key='OccupancyType']//span[text()='Primary']")).click();
	    
	    driver.findElement(By.xpath("(//*[@data-omni-key='RentalExposure']//input)[1]")).click();
	    driver.findElement(By.xpath("(//*[@data-omni-key='RentalExposure']/..//span[text()='No'])[1]")).click();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollTo(0,2500)");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[text()='Save'])")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("(//div[text()='Insured Name & Location(s)']/../../../../../../../../../..//span[text()='Next'])[1]")).click();
	    Thread.sleep(2000);
		
	}


}

