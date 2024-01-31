package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class CreateNewOpportunity extends ReusableUtility{
	
	WebDriver driver;
	
	public CreateNewOpportunity(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;
	
	@FindBy(xpath="//ul[@class='slds-global-actions']//a[@title='New Opportunity']")
	WebElement newoppclick;
	
	
public void createNewOpp(String dept, String lob, String prodteam, String retailer, String retailcontact, String accname) throws InterruptedException
	{
		Thread.sleep(0,1000);
		globalactions.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    newoppclick.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Department']/../..//a")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//a[@title='"+dept+"']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='LOB']/../..//a")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//a[@title='"+lob+"']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Production Team']/../..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Production Team']/../..//input")).sendKeys(prodteam);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Production Team']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Production Team']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//span[text()='Production Team']/../..//div[@title='"+prodteam+"'])[1]")).click();
	    driver.findElement(By.xpath("//h2[text()='New Opportunity']/../../../../..//span[text()='Retailer']/../..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//h2[text()='New Opportunity']/../../../../..//span[text()='Retailer']/../..//input")).sendKeys(retailer);
	    driver.findElement(By.xpath("//h2[text()='New Opportunity']/../../../../..//span[text()='Retailer']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//h2[text()='New Opportunity']/../../../../..//span[text()='Retailer']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//h2[text()='New Opportunity']/../../../../..//span[text()='Retailer']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//span[text()='Retailer']/../..//div[contains(@title,'"+retailer+"')])[1]")).click();
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).sendKeys(retailcontact);
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    		    
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.findElement(By.xpath("//div[contains(@class,'dockableNew_Opportunity')]//span[text()='Retail Contact']/../..//input")).sendKeys(Keys.BACK_SPACE);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//span[text()='Retail Contact']/../..//div[@title='"+retailcontact+"'])[1]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("(//h2[text()='New Opportunity']/../../../../..//span[text()='Save'])[last()]")) .click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]//a//div")).click();
	    
	    By opportunitydetailstab = By.xpath("//a[text()='Details']");
	    	   // Thread.sleep(6000);
	    waitForElementToAppear(opportunitydetailstab);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@title=\"Edit Opportunity Name\"]/..//button")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()=\"Account Name\"]/../..//input")).sendKeys(accname);
	    
	    driver.findElement(By.xpath("(//label[text()=\"Account Name\"]/../..//*[@title='"+accname+"'])[1]")).click();
	    driver.findElement(By.xpath("//label[text()=\"Effective Date\"]/../..//input")).sendKeys("05/10/2023");
	    driver.findElement(By.xpath("//div[contains(@class,'appName')]")).click();
	    driver.findElement(By.xpath("//slot//button[text()=\"Save\"]")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,0)");  
		
	}


}

