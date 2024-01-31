package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTask {
	
	WebDriver driver;
	
	public CreateNewTask(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;
	
	@FindBy(xpath="//ul[@class='slds-global-actions']//a[@title='New Task']")
	WebElement newtaskclick;
	
	
public void createNewTask(String subject, String policy, String policytransaction) throws InterruptedException
	{
		Thread.sleep(0,1000);
		globalactions.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    newtaskclick.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//label[text()='Subject']/..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//label[text()='Subject']/..//input")).sendKeys(subject);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//input[@data-value=\"Tax Filing - Audit\"]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//span[text()='Policy']/../..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//span[text()='Policy']/../..//input")).sendKeys(policy);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[@title=\"AML116867\"]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//span[text()='Policy Transaction']/../..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//span[text()='Policy Transaction']/../..//input")).sendKeys(policytransaction);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[@title='Policy Bind']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//span[text()='Save'])[last()]")) .click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]//a//div")).click();
	    
	   
		
	}


}

