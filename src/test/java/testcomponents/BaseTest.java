package testcomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	public WebDriver driver;
	public JavascriptExecutor js = (JavascriptExecutor) driver;
	public FileReader reader, reader1;
			
	public WebDriver intializeDriver() throws IOException
	{	

		Properties prop1 = new Properties();
	//	reader1 = new FileReader("C:\\Users\\sarda\\eclipse-workspace\\SeleniumTestingFramework\\src\\main\\java\\resources\\GlobalData.properties");
		reader1 =new FileReader(System.getProperty("user.dir")+"//src//main//java//resources//GlobalData.properties");
		prop1.load(reader1);
		String browserName = prop1.getProperty("BROWSER");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
			/*FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", "C:\\GekoDriver\\geckodriver.exe");
			driver = new FirefoxDriver(options);*/
			
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
			
	return driver;
		
	}
	
	public JavascriptExecutor closeAllTabs() throws InterruptedException
	{
		   //Closing all the open tabs
				Thread.sleep(2000);
				js = (JavascriptExecutor) driver;
				js.executeScript("var elements = document.evaluate(\"//div[contains(@class,'tabsetHeader')]//button[starts-with(@title,'Close')]//lightning-primitive-icon\", document.body, null, XPathResult.ANY_TYPE, null); while(element = elements.iterateNext()){  element.click(); }");
				Thread.sleep(2000);
				return js;
	}
	
	
	public JavascriptExecutor closeBottomeBar() throws InterruptedException
	{
		   //Closing all the open tabs
				Thread.sleep(2000);
				js = (JavascriptExecutor) driver;
				js.executeScript("var node=document.evaluate(\"//div[contains(@class,'oneUtilityBar slds-utility-bar_container oneUtilityBarContent')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue; node.parentNode.removeChild(node);");
				 Thread.sleep(2000);
				return js;
	}

	public JavascriptExecutor markStageasComplete() throws InterruptedException
	{
		   //Closing all the open tabs
				Thread.sleep(4000);
				js = (JavascriptExecutor) driver;
				// driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")).click();
				 js.executeScript("var result = document.evaluate(\"//span[text()='Mark Stage as Complete']\", document.body, null, XPathResult.ANY_TYPE, null); var input = result.iterateNext();input.scrollIntoView();input.click()");
				 Thread.sleep(4000);
				return js;
	}
	
	public Properties getParameters() throws IOException
	{
		//reader=new FileReader("C:\\Users\\sarda\\eclipse-workspace\\SeleniumTestingFramework\\src\\main\\java\\resources\\GlobalData.properties");
		reader=new FileReader(System.getProperty("user.dir")+"//src//main//java//resources//GlobalData.properties");
        Properties props=new Properties();
        props.load(reader);
		return props;
	}
	
	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png";
	}
	
	public WebDriver tearDownDriver()
	{
		driver.quit();
		return driver;
		
	}
}
