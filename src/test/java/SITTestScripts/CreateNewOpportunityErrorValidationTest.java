package SITTestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import HWKSalesConsole.LoginIntoHWKSalesConsole;

public class CreateNewOpportunityErrorValidationTest extends BaseTest{

	@Test
	public void LoginErrorValidation() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		intializeDriver();
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo(getParameters().getProperty("SIT1_URL"));
		loginPO.LoginApp("invaliduser", "invalid@34");
		Assert.assertEquals("Please check your username and password. If you still can't log in, contact your Salesforce administrator.", "Test");
		tearDownDriver();

	}

}
