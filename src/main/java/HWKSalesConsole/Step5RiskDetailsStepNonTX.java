package HWKSalesConsole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Step5RiskDetailsStepNonTX {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Step5RiskDetailsStepNonTX(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    

	public void riskdetailstep(String LOBTYPE, String CovALimit, String CovCLimit,String AOPDeductibledollaramount, String Winddeductibletype, String Windhailpercentage) throws InterruptedException
	{
		
		if("HOMEOWNERS".equals(LOBTYPE))
		{
		js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//*[@data-omni-key='CoverageADwelling']//input")).sendKeys(CovALimit);
		 driver.findElement(By.xpath("//*[@data-omni-key='CalculateCoveragesB/C/D']//button")).click();
		 js.executeScript("window.scrollTo(0,1400)");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageEPersonal']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageEPersonal']//span[text()='Personal']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageECurrency']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageECurrency']//span[text()='$300,000']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageFCurrency']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='CoverageFCurrency']//span[text()='$5,000']")).click();
		 js.executeScript("window.scrollTo(0,1800)");
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterDamageSubLimit']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WaterDamageSubLimit']//span[text()='$10,000']")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='AllOtherPerilsAOPDeductible']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='AllOtherPerilsAOPDeductible']//*[text()='"+AOPDeductibledollaramount+"']")).click();
		 js.executeScript("window.scrollTo(0,2000)");
		 driver.findElement(By.xpath("//*[@data-omni-key='WindDeductibleType']//input")).click();
		 driver.findElement(By.xpath("//*[@data-omni-key='WindDeductibleType']//span[text()='"+Winddeductibletype+"']")).click();

		 js.executeScript("window.scrollTo(0,2200)");	
		 if(!"Excluded".equals(Winddeductibletype))
		 {
			 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//input")).click();
			 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//span[text()='"+Windhailpercentage+"']")).click();
		 }

		 js.executeScript("window.scrollTo(0,2400)");
		 
		 driver.findElement(By.xpath("(//h1[text()='Risk Details']/../..//button//span[text()='Next'])[1]")).click();
		}
		else
		{
				js = (JavascriptExecutor) driver;
				driver.findElement(By.xpath("//*[@data-omni-key='CoverageADwelling']//input")).sendKeys(CovALimit);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@data-omni-key='CovASettlementDP3']//input")).click();
				driver.findElement(By.xpath("//*[@data-omni-key='CovASettlementDP3']//span[text()='Replacement Cost']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-omni-key='CoverageCCheckboxDwelling']//*[text()='Coverage C']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-omni-key='CalculateCoveragesB/D']//button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-omni-key='CoverageCPersonalProperty']//input")).sendKeys(CovCLimit);
				driver.findElement(By.xpath("//*[@data-omni-key='CovCSettlementDwelling']//input")).click();
				driver.findElement(By.xpath("//*[@data-omni-key='CovCSettlementDwelling']//span[text()='Replacement Cost']")).click();
				Thread.sleep(2000);
				 
				 js.executeScript("window.scrollTo(0,1400)");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageEPersonal']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageEPersonal']//span[text()='Personal']")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageECurrency']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageECurrency']//span[text()='$300,000']")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageFCurrency']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='CoverageFCurrency']//span[text()='$5,000']")).click();
				 js.executeScript("window.scrollTo(0,1800)");
				 driver.findElement(By.xpath("//*[@data-omni-key='WaterDamageSubLimit']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='WaterDamageSubLimit']//span[text()='$10,000']")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='AllOtherPerilsAOPDeductible']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='AllOtherPerilsAOPDeductible']//*[text()='"+AOPDeductibledollaramount+"']")).click();
				 js.executeScript("window.scrollTo(0,2000)");
				 driver.findElement(By.xpath("//*[@data-omni-key='WindDeductibleType']//input")).click();
				 driver.findElement(By.xpath("//*[@data-omni-key='WindDeductibleType']//span[text()='"+Winddeductibletype+"']")).click();

				 js.executeScript("window.scrollTo(0,2200)");	
				 if(!"Excluded".equals(Winddeductibletype))
				 {
					 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//input")).click();
					 driver.findElement(By.xpath("//*[@data-omni-key='WindHail']//span[text()='"+Windhailpercentage+"']")).click();
				 }

				 js.executeScript("window.scrollTo(0,2400)");
				 
				 driver.findElement(By.xpath("(//h1[text()='Risk Details']/../..//button//span[text()='Next'])[1]")).click();
				
			
		}
		
	}


}

