package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveQuoteStatustoBindRequested {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public MoveQuoteStatustoBindRequested(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public void changequotestatus() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Rated Quoted']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Bind Requested']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(15000);

	}


}

