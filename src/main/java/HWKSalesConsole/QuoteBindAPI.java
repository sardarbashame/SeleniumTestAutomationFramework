package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteBindAPI {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public QuoteBindAPI(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public void bindQuote() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		
		 driver.findElement(By.xpath("(//*[text()='Bind'])[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//button//span[text()='Bind'])[1]")).click();
		 Thread.sleep(120000);

	}


}

