package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step8CDBAdditionalInterestsStep {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step8CDBAdditionalInterestsStep(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*
 * //selecting the HWK Sales Console Application
			    
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    driver.findElement(By.xpath("//span[text()='App Launcher']/..")).click();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			    driver.findElement(By.xpath("//input[@placeholder='Search apps and items...' or @placeholder='Search apps or items...']")).sendKeys("HWK Sales Console");
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    driver.findElement(By.xpath("//p[.//*[text()='HWK Sales Console']]")).click();
			    Thread.sleep(12000);
 */
    

	public void cdbadditioanlinterestsstep() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,2000)");
		 driver.findElement(By.xpath("(//h1[text()='CDB/Additional Interests']/../..//button//span[text()='Next'])[1]")).click();
		 Thread.sleep(8000);
	}


}

