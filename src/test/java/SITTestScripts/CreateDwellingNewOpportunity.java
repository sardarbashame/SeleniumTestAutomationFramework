package SITTestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import HWKSalesConsole.AddRiskLocation;
import HWKSalesConsole.CreateNewOpportunity;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.SelectApplication;

public class CreateDwellingNewOpportunity extends BaseTest{

	@Test
	public void CreateNewDwellingOpportunity() throws InterruptedException, IOException {
		
		intializeDriver();
		
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo(getParameters().getProperty("SIT1_URL"));
		loginPO.LoginApp(
				getParameters().getProperty("SIT1_ARYAUSERNAME"), 
				getParameters().getProperty("SIT1_ARYAPASSWORD")
				);
		
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME"));
		
		closeAllTabs();
		
		closeBottomeBar();
		
		CreateNewOpportunity createNewOpportunity = new CreateNewOpportunity(driver);
		createNewOpportunity.createNewOpp(
				getParameters().getProperty("DEPARTMENT"), 
				getParameters().getProperty("DwELLINGLOB"),
				getParameters().getProperty("PRODTEAM"),
				getParameters().getProperty("RETAILER"),
				getParameters().getProperty("RETAILCONTACT"),
				getParameters().getProperty("ORGACCOUNT")
				);
		AddRiskLocation addriskloc = new AddRiskLocation(driver);
		addriskloc.addRiskLoc(getParameters().getProperty("RISKLOCTX"));
		
		markStageasComplete();
		
		tearDownDriver();
	}

}
