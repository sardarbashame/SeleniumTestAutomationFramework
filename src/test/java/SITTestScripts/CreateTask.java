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
import org.testng.annotations.Test;

import HWKSalesConsole.CreateNewTask;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.SelectApplication;

public class CreateTask extends BaseTest{

	@Test
	public void CreateNewTask() throws InterruptedException, IOException {
		intializeDriver();
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo(getParameters().getProperty("SIT1_URL"));
		loginPO.LoginApp(getParameters().getProperty("SIT1_ARYAUSERNAME"), getParameters().getProperty("SIT1_ARYAPASSWORD"));
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME"));
		closeAllTabs();
		closeBottomeBar();
		CreateNewTask createNewTask = new CreateNewTask(driver);
		createNewTask.createNewTask("Tax Filing - Audit","AML116867", "Policy Bind1");
		tearDownDriver();
	}

}
