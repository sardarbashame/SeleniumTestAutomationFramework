package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step3RequestRiskReportStep {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step3RequestRiskReportStep(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void requestreportstep() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(1000);			    
		driver.findElement(By.xpath("(//h1[text()='Request Risk Report']/../..//button//span[text()='Next'])[1]")).click();
		Thread.sleep(3000);

	}


}

