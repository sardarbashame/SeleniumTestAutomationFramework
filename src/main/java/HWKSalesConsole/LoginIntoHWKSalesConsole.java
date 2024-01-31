package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class LoginIntoHWKSalesConsole extends ReusableUtility{
	
	WebDriver driver;
	
	public LoginIntoHWKSalesConsole(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   
	@FindBy(id="username")
	WebElement usernameele;
	
	@FindBy(id="password")
	WebElement passwordele;
	
	@FindBy(id="Login")
	WebElement Loginele;
	
	public void goTo(String URL)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.navigate().to(URL); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
	}
	
	public void LoginApp(String username, String password)
	{	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		usernameele.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		passwordele.sendKeys(password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Loginele.click();
		By titleofhwk = By.xpath("//span[@title='HWK Sales Console']");	
		waitForElementToAppear(titleofhwk);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}


}

