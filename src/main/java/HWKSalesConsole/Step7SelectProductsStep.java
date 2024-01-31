package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class Step7SelectProductsStep extends ReusableUtility {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public Step7SelectProductsStep(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   

	public void selectproductsstep(String hodproduct) throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		By addtocartvisible = By.xpath("//*[text()='"+hodproduct+"']/../../../../..//*[contains(text(),'Cart')]");
		waitForElementToAppear(addtocartvisible);
		js.executeScript("var result = document.evaluate(\"//*[text()='"+hodproduct+"']/../../../../..//*[contains(text(),'Cart')]\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext(); input.scrollIntoView(); input.click();");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h1[text()='Select Products']/../..//button//span[text()='Next'])[1]")).click();
	}


}

