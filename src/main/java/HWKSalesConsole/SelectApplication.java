package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectApplication {
	
	WebDriver driver;
	
	public SelectApplication(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    

	public void selectApp(String appname) throws InterruptedException
	{
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//span[text()='App Launcher']/..")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//input[@placeholder='Search apps and items...' or @placeholder='Search apps or items...']")).sendKeys("HWK Sales Console");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//p[.//*[text()='"+appname+"']]")).click();
	    Thread.sleep(12000);
		
	}


}

