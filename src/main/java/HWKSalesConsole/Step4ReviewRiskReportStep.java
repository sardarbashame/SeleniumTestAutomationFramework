package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step4ReviewRiskReportStep {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step4ReviewRiskReportStep(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void reviewRiskReport() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,100)");
		 driver.findElement(By.xpath("//div[@class='slds-box slds-grid slds-size_1-of-1 slds-m-bottom_medium']")).click();
		 Thread.sleep(4000);
		 js.executeScript("window.scrollTo(0,700)");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofFamilies']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofFamilies']//span[text()='1']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BuildingCladding']//input")).click();
		 js.executeScript("window.scrollTo(0,800)");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@data-omni-key='BuildingCladding']//span[text()='Brick Veneer']")).click();	
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofGeometry']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofGeometry']//span[text()='Built-up']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofMaterial']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofMaterial']//span[text()='Built-up roof or single-ply membrane roof with presence of gutters']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='YearBuiltRCR']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='YearBuiltRCR']//input")).sendKeys("2010");
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofStories']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofStories']//input")).sendKeys("2");
		 driver.findElement(By.xpath("//*[@data-omni-key='SquareFootage']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='SquareFootage']//input")).sendKeys("2500");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@data-omni-key='ISOProtectionclass']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='ISOProtectionclass']//span[text()='2']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindMitigation']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindMitigation']//span[text()='No']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='DwellingProtections']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='DwellingProtections']//span[text()='Yes']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-omni-key='FireAlarm']//input")).click();
		driver.findElement(By.xpath("//*[@data-omni-key='FireAlarm']//span[text()='Central']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BurglarAlarm']//input")).click();
		driver.findElement(By.xpath("//*[@data-omni-key='BurglarAlarm']//span[text()='Central']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='GatedCommunity']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='GatedCommunity']//span[text()='No']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AutomaticWaterShutoffSystem']//input")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='AutomaticWaterShutoffSystem']//span[text()='No']")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='SprinklerSystem']//input")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='SprinklerSystem']//span[text()='Full']")).click();	
		 //driver.findElement(By.xpath("//*[@data-omni-key='HeatSource']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='HeatSource']//span[text()='Unknown']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='ElectricType']//input")).click();
		 js.executeScript("window.scrollTo(0,1100)");
		// driver.findElement(By.xpath("//*[@data-omni-key='ElectricType']//span[text()='Unknown']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='PlumbingType']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='PlumbingType']//span[text()='Unknown']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='HaveUpdatesbeenmade']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='HaveUpdatesbeenmade']//span[text()='No']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AlternatePowerSystem']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AlternatePowerSystem']//span[text()='No']")).click();	
		 driver.findElement(By.xpath("//*[@data-omni-key='StructureType']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='StructureType']//span[text()='Dwelling']")).click();	
		 driver.findElement(By.xpath("//*[@data-omni-key='AboveWater']//input")).click();
		 js.executeScript("window.scrollTo(0,1400)");
		 driver.findElement(By.xpath("//*[@data-omni-key='AboveWater']//span[text()='Unknown']")).click();
	//	 driver.findElement(By.xpath("//*[@data-omni-key='Basement']//input")).click();
	//	 driver.findElement(By.xpath("//*[@data-omni-key='Basement']//span[text()='Full Basement']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='SwimmingPool']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='SwimmingPool']//span[text()='No']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoastDistance']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoastDistance']//input")).sendKeys("10");
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitCD']//input)[1]")).click();
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitCD']//span[text()='Miles'])[1]")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BeachDistance']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='BeachDistance']//input")).sendKeys("10");
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitBD']//input)[1]")).click();
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitBD']//span[text()='Miles'])[1]")).click();
		 js.executeScript("window.scrollTo(0,1800)");
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterTypeRCR']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterTypeRCR']//span[text()='Hydrant']")).click();	
		 js.executeScript("window.scrollTo(0,8000)");
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//h1[text()='Review Risk Report']/../..//button//span[text()='Next'])[1]")).click();
		 Thread.sleep(5000);
		
	}
	public void reviewRiskReportAmlin() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,100)");
		 driver.findElement(By.xpath("//div[@class='slds-box slds-grid slds-size_1-of-1 slds-m-bottom_medium']")).click();
		 Thread.sleep(4000);
		 js.executeScript("window.scrollTo(0,700)");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofFamilies']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofFamilies']//span[text()='1']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BuildingCladding']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BuildingCladding']//span[text()='Brick Veneer']")).click();
		 js.executeScript("window.scrollTo(0,800)");
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofValuation']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofValuation']//span[text()='ACV']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofGeometry']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofGeometry']//span[text()='Built-up']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofMaterial']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='RoofMaterial']//span[text()='Built-up roof or single-ply membrane roof with presence of gutters']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='YearBuiltRCR']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='YearBuiltRCR']//input")).sendKeys("2010");
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofStories']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='NumberofStories']//input")).sendKeys("2");
		 driver.findElement(By.xpath("//*[@data-omni-key='SquareFootage']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='SquareFootage']//input")).sendKeys("2500");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@data-omni-key='ISOProtectionclass']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='ISOProtectionclass']//span[text()='2']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindMitigation']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindMitigation']//span[text()='No']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='DwellingProtections']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='DwellingProtections']//span[text()='Yes']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-omni-key='FireAlarm']//input")).click();
		driver.findElement(By.xpath("//*[@data-omni-key='FireAlarm']//span[text()='Central']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BurglarAlarm']//input")).click();
		driver.findElement(By.xpath("//*[@data-omni-key='BurglarAlarm']//span[text()='Central']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='GatedCommunity']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='GatedCommunity']//span[text()='No']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AutomaticWaterShutoffSystem']//input")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='AutomaticWaterShutoffSystem']//span[text()='No']")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='SprinklerSystem']//input")).click();
		 //driver.findElement(By.xpath("//*[@data-omni-key='SprinklerSystem']//span[text()='Full']")).click();	
		 //driver.findElement(By.xpath("//*[@data-omni-key='HeatSource']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='HeatSource']//span[text()='Unknown']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='ElectricType']//input")).click();
		 js.executeScript("window.scrollTo(0,1100)");
		// driver.findElement(By.xpath("//*[@data-omni-key='ElectricType']//span[text()='Unknown']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='PlumbingType']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='PlumbingType']//span[text()='Unknown']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='HaveUpdatesbeenmade']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='HaveUpdatesbeenmade']//span[text()='No']")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AlternatePowerSystem']//input")).click();
		// driver.findElement(By.xpath("//*[@data-omni-key='AlternatePowerSystem']//span[text()='No']")).click();	
		 driver.findElement(By.xpath("//*[@data-omni-key='StructureType']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='StructureType']//span[text()='Dwelling']")).click();	
		 driver.findElement(By.xpath("//*[@data-omni-key='AboveWater']//input")).click();
		 js.executeScript("window.scrollTo(0,1400)");
		 driver.findElement(By.xpath("//*[@data-omni-key='AboveWater']//span[text()='Unknown']")).click();
	//	 driver.findElement(By.xpath("//*[@data-omni-key='Basement']//input")).click();
	//	 driver.findElement(By.xpath("//*[@data-omni-key='Basement']//span[text()='Full Basement']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='SwimmingPool']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='SwimmingPool']//span[text()='No']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoastDistance']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoastDistance']//input")).sendKeys("10");
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitCD']//input)[1]")).click();
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitCD']//span[text()='Miles'])[1]")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='BeachDistance']//input")).clear();
		 driver.findElement(By.xpath("//*[@data-omni-key='BeachDistance']//input")).sendKeys("10");
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitBD']//input)[1]")).click();
		 driver.findElement(By.xpath("(//*[@data-omni-key='UnitBD']//span[text()='Miles'])[1]")).click();
		 js.executeScript("window.scrollTo(0,1800)");
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterTypeRCR']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterTypeRCR']//span[text()='Hydrant']")).click();	
		 js.executeScript("window.scrollTo(0,8000)");
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//h1[text()='Review Risk Report']/../..//button//span[text()='Next'])[1]")).click();
		 Thread.sleep(5000);
		
	}

}

