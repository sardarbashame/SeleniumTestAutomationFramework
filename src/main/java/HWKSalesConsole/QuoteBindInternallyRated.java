package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteBindInternallyRated {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public QuoteBindInternallyRated(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public void bindQuote() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		
		 driver.findElement(By.xpath("(//*[text()='Bind'])[2]")).click();
		 Thread.sleep(8000);
		 js.executeScript("window.scrollTo(0,2000)");
		 Thread.sleep(4000);
		 // driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).click();
		 js.executeScript("var result = document.evaluate(\"(//span[text()='Submit'])[1]\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext(); input.scrollIntoView(); input.click();");
		 Thread.sleep(10000);

	}


}

