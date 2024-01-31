package SITTestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;
import testcomponents.Listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import HWKSalesConsole.AddRiskLocation;
import HWKSalesConsole.CreateNewOpportunity;
import HWKSalesConsole.GeneratePolicyProofDocument;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.MoveQuoteStatustoBindRequested;
import HWKSalesConsole.QuoteBindAPI;
import HWKSalesConsole.SelectApplication;
import HWKSalesConsole.Step1StartQuoteStep;
import HWKSalesConsole.Step2InsuredNameRiskLocationStep;
import HWKSalesConsole.Step3RequestRiskReportStep;
import HWKSalesConsole.Step4ReviewRiskReportStep;
import HWKSalesConsole.Step5RiskDetailsStepNonTX;
import HWKSalesConsole.Step5RiskDetailsStepTX;
import HWKSalesConsole.Step6LossHistoryStep;
import HWKSalesConsole.Step7SelectProductsStep;
import HWKSalesConsole.Step8CDBAdditionalInterestsStep;
import HWKSalesConsole.Step9SubmitQuoteStep;
import HWKSalesConsole.SyncQuotetoC1;

public class TCCreateNewBusinessHO3SpecialFormVAVEPolicywithWindHailNJ extends Listeners{

	@Test
	public void CreateVAVENEWBUSINESSPOLICYWITHWINDHAILFORTXLOCATION() throws InterruptedException,NullPointerException, IOException {

		// TODO Auto-generated method stub
		intializeDriver();
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo(getParameters().getProperty("SIT1_URL"));
		loginPO.LoginApp(getParameters().getProperty("SIT1_ARYAUSERNAME"), getParameters().getProperty("SIT1_ARYAPASSWORD"));
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME"));
		closeAllTabs();
		closeBottomeBar();
		CreateNewOpportunity createNewOpportunity = new CreateNewOpportunity(driver);
		createNewOpportunity.createNewOpp(getParameters().getProperty("DEPARTMENT"), getParameters().getProperty("HOMELOB"),getParameters().getProperty("PRODTEAM"),getParameters().getProperty("RETAILER"),getParameters().getProperty("RETAILCONTACT"),getParameters().getProperty("ORGACCOUNT"));
		AddRiskLocation addriskloc = new AddRiskLocation(driver);
		addriskloc.addRiskLoc(getParameters().getProperty("RISKLOCNJ"));
		markStageasComplete();
		Thread.sleep(1000);
		
		
		//Start Quote Step
		Step1StartQuoteStep startQuoteStep = new Step1StartQuoteStep(driver);
		startQuoteStep.startstep(getParameters().getProperty("HO3SPECIALFORM"));
		
		String step2heading = driver.findElement(By.xpath("//h1[text()='Insured Name & Location(s)']")).getText();
		System.out.println(step2heading);
		Assert.assertEquals(step2heading,"Insured Name & Location(s)");
	//	reportLog(step2heading);

		
		//Insured Name &  Risk Location step
		Step2InsuredNameRiskLocationStep insurednamerisklocstep = new Step2InsuredNameRiskLocationStep(driver);
		insurednamerisklocstep.insureNamerisklocation();		
		
		String step3heading = driver.findElement(By.xpath("//h1[text()='Request Risk Report']")).getText();
		System.out.println(step3heading);
		Assert.assertEquals(step3heading,"Request Risk Report");
	//	reportLog(step3heading);

		
	//Request Risk Report Step
		Step3RequestRiskReportStep requestRiskReportStep = new Step3RequestRiskReportStep(driver);
		requestRiskReportStep.requestreportstep();
		
		String step4heading = driver.findElement(By.xpath("//h1[text()='Review Risk Report']")).getText();
		System.out.println(step4heading);
		Assert.assertEquals(step4heading,"Review Risk Report");
		//reportLog(step4heading);

		//Review Risk Report Step
		Step4ReviewRiskReportStep reviewRiskReportStep = new Step4ReviewRiskReportStep(driver);
		reviewRiskReportStep.reviewRiskReport();
		
		String step5heading = driver.findElement(By.xpath("//h1[text()='Risk Details']")).getText();
		System.out.println(step5heading);
		Assert.assertEquals(step5heading,"Risk Details");
		//reportLog(step5heading);
						   
		//Risk Details Step
		Step5RiskDetailsStepNonTX risDetailsStep = new Step5RiskDetailsStepNonTX(driver);
		 
		risDetailsStep.riskdetailstep(
				"HOMEOWNERS",
				getParameters().getProperty("H092COVALIMIT"), 
				getParameters().getProperty("H092COVCLIMIT"), 
				getParameters().getProperty("AOPDEDUTIBLEDOLLARAMOUNT"), 
				getParameters().getProperty("WINDHAILDEDUTIBLETypeWINDHAIL"), 
				getParameters().getProperty("WINDHAILDEDUTIBLEPERCENTAGE")
				);
		
		String step6heading = driver.findElement(By.xpath("//h1[text()='Loss History & Scheduled Articles']")).getText();
		System.out.println(step6heading);
		Assert.assertEquals(step6heading,"Loss History & Scheduled Articles");
	//	reportLog(step6heading);
		
		//Loss History & Scheduled Article(s)
		Step6LossHistoryStep lossHistoryStep = new Step6LossHistoryStep(driver);
		lossHistoryStep.losshistorystep();
		
		String step7heading = driver.findElement(By.xpath("//h1[text()='Select Products']")).getText();
		System.out.println(step7heading);
		Assert.assertEquals(step7heading,"Select Products");
	//	reportLog(step7heading);
							 
		//Select Products step
		Step7SelectProductsStep selectProductsStep = new Step7SelectProductsStep(driver);
		selectProductsStep.selectproductsstep("VAVE (Canopius)");
	
		String step8heading = driver.findElement(By.xpath("//h1[text()='CDB/Additional Interests']")).getText();
		System.out.println(step8heading);
		Assert.assertEquals(step8heading,"CDB/Additional Interests");
	//	reportLog(step8heading);
								 
		//CDB/Additional Interest
		Step8CDBAdditionalInterestsStep cDBAdditionalInterestsStep = new Step8CDBAdditionalInterestsStep(driver);
		cDBAdditionalInterestsStep.cdbadditioanlinterestsstep();

		String step9heading = driver.findElement(By.xpath("//h1[text()='Submit Quote']")).getText();
		System.out.println(step9heading);
		Assert.assertEquals(step9heading,"Submit Quote");
	//	reportLog(step9heading);				 
		
		//SubmitQuote Step	
		Step9SubmitQuoteStep submitQuoteStep = new Step9SubmitQuoteStep(driver);
		submitQuoteStep.submitquotestep();
		
		String quotecreated = driver.findElement(By.xpath("//div[text()='Quote']")).getText();
		System.out.println(quotecreated);
		Assert.assertEquals(quotecreated,"Quote");
	//	reportLog(quotecreated);		
	
		//Sync Quote to C1
		SyncQuotetoC1 syncQuotetoC1 = new SyncQuotetoC1(driver);
		syncQuotetoC1.syncquote();
	//	reportLog("Quote Successfully Synced to C1 System");		
		 
		//Quote status update to Bind Requested status
		MoveQuoteStatustoBindRequested changeQuoteStatus= new MoveQuoteStatustoBindRequested(driver);
		changeQuoteStatus.changequotestatus();
	//	reportLog("Quote Status moved from Rated to Bind Requested");		
		
		 //Generate Policy Proof Document
		GeneratePolicyProofDocument generatePolicyProofDoc = new GeneratePolicyProofDocument(driver);
		generatePolicyProofDoc.generatePolicyProofDocument();
	//	reportLog("Policy Proof Document Generated");		
		//Bind the Quote

		QuoteBindAPI quoteBind = new QuoteBindAPI(driver);
		quoteBind.bindQuote();
	//	reportLog("VAVE New Business Policy Issued");		
		
		//tearDownDriver();
	}
	
}


