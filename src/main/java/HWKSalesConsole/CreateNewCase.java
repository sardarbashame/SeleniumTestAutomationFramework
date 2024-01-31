package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCase {
	
	WebDriver driver;
	
	public CreateNewCase(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;
	
	@FindBy(xpath="//ul[@class='slds-global-actions']//a[@title='New Case']")
	WebElement newcaseclick;
	
	
public void createCase(String requesttype) throws InterruptedException
	{
		Thread.sleep(0,4000);
		globalactions.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    newcaseclick.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//span[text()='Request Type']/../..//a")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//a[@title='"+requesttype+"']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//h2[text()='New Case']/../../../../..//span[text()='Save'])[last()]")) .click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]//a//div")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,0)");  
		
	}


}

