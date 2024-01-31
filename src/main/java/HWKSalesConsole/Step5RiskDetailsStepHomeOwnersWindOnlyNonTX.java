package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step5RiskDetailsStepHomeOwnersWindOnlyNonTX {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step5RiskDetailsStepHomeOwnersWindOnlyNonTX(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    

	public void riskdetailstep(String CovALimit, String Windhailpercentage) throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,1800)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageADwelling']//input")).sendKeys(CovALimit);
		 driver.findElement(By.xpath("//*[@data-omni-key='CalculateCoveragesB/C/D']//button")).click();
		 js.executeScript("window.scrollTo(0,2000)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//span[text()='"+Windhailpercentage+"']")).click();
		 js.executeScript("window.scrollTo(0,2400)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//h1[text()='Risk Details']/../..//button//span[text()='Next'])[1]")).click();
		
	}


}

