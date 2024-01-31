package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneratePolicyProofDocument {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public GeneratePolicyProofDocument(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public JavascriptExecutor generatePolicyProofDocument() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;

		js.executeScript("location.reload()");
		By quoteheading = By.xpath("//div[text()='Quote']");
		waitForElementToAppear(quoteheading);
		 Thread.sleep(4000);
		
		By policyproof = By.xpath("//*[text()='Generate Policy Proof']");
		waitForElementToAppear(policyproof);
		 
		 driver.findElement(By.xpath("//*[text()='Generate Policy Proof']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//button[normalize-space()='Next'])[1]")).click();
		 Thread.sleep(20000);
		 driver.navigate().back();
		 Thread.sleep(5000);
		 return js;

	}



	private void waitForElementToAppear(By quoteheading) {
		// TODO Auto-generated method stub
		
	}


}

