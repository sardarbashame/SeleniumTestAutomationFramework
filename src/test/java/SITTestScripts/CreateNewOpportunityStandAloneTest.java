package SITTestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import HWKSalesConsole.AddRiskLocation;
import HWKSalesConsole.CreateNewOpportunity;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.SelectApplication;

public class CreateNewOpportunityStandAloneTest {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo("SIT1_URL");
		loginPO.LoginApp("arya.stark@hwk.sit1", "hwkaufman@34");
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp("HWK Sales Console");
		    
       //Closing all the open tabs
		js.executeScript("var elements = document.evaluate(\"//div[contains(@class,'tabsetHeader')]//button[starts-with(@title,'Close')]//lightning-primitive-icon\", document.body, null, XPathResult.ANY_TYPE, null); while(element = elements.iterateNext()){  element.click(); }");
		Thread.sleep(10000);
			
		CreateNewOpportunity createNewOpportunity = new CreateNewOpportunity(driver);
		createNewOpportunity.createNewOpp("Personal", "Homeowners","Laura L Guthinger","Marsh & McLennan Agency LLC","Chris M Stefonan","R-ATD Account Insured Organization US");
		AddRiskLocation addriskloc = new AddRiskLocation(driver);
		addriskloc.addRiskLoc("14287 Misty Meadow Ln, Houston, TX, United States");

		//Move the opportunity status to Cleared			   
		// driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")).click();
		 js.executeScript("var result = document.evaluate(\"//span[text()='Mark Stage as Complete']\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext();input.scrollIntoView();input.click()");
		 Thread.sleep(4000);
		 js.executeScript("var node=document.evaluate(\"//div[contains(@class,'oneUtilityBar slds-utility-bar_container oneUtilityBarContent')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue; node.parentNode.removeChild(node);");
		 Thread.sleep(4000);
		 driver.quit();
	}

}
