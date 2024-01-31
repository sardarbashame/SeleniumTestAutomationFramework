package SITTestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;

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

import HWKSalesConsole.AddRiskLocation;
import HWKSalesConsole.CreateNewOpportunity;
import HWKSalesConsole.GeneratePolicyProofDocument;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.MoveQuoteStatustoBindRequested;
import HWKSalesConsole.QuoteBindAPI;
import HWKSalesConsole.QuoteBindInternallyRated;
import HWKSalesConsole.SelectApplication;
import HWKSalesConsole.Step1StartQuoteStep;
import HWKSalesConsole.Step2InsuredNameRiskLocationStep;
import HWKSalesConsole.Step3RequestRiskReportStep;
import HWKSalesConsole.Step4ReviewRiskReportStep;
import HWKSalesConsole.Step5RiskDetailsStepDwellingNonTX;
import HWKSalesConsole.Step5RiskDetailsStepNonTX;
import HWKSalesConsole.Step6LossHistoryStep;
import HWKSalesConsole.Step7SelectProductsStep;
import HWKSalesConsole.Step8CDBAdditionalInterestsStep;
import HWKSalesConsole.Step9SubmitQuoteStep;
import HWKSalesConsole.SyncQuotetoC1;

public class TCCreateNewBusinessDP3SpecialFormH092PolicywithWindHailAL extends BaseTest {

	@Test
	public void createQuote() throws InterruptedException,NullPointerException, IOException {
		// TODO Auto-generated method stub
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
				getParameters().getProperty("SIT1INSUREDIND")
				);
		AddRiskLocation addriskloc = new AddRiskLocation(driver);
		addriskloc.addRiskLoc(getParameters().getProperty("RISKLOCAL"));
		markStageasComplete();
		Thread.sleep(1000);
		
		
		//Start Quote Step
		Step1StartQuoteStep startQuoteStep = new Step1StartQuoteStep(driver);
		startQuoteStep.startstep(getParameters().getProperty("DP3SPECIALFORM"));
		
		String step2heading = driver.findElement(By.xpath("//h1[text()='Insured Name & Location(s)']")).getText();
		System.out.println(step2heading);
		Assert.assertEquals(step2heading,"Insured Name & Location(s)");
		
		//Insured Name &  Risk Location step
		Step2InsuredNameRiskLocationStep insurednamerisklocstep = new Step2InsuredNameRiskLocationStep(driver);
		insurednamerisklocstep.insureNamerisklocation();		
		
		String step3heading = driver.findElement(By.xpath("//h1[text()='Request Risk Report']")).getText();
		System.out.println(step3heading);
		Assert.assertEquals(step3heading,"Request Risk Report");
		
		//Request Risk Report Step
		Step3RequestRiskReportStep requestRiskReportStep = new Step3RequestRiskReportStep(driver);
		requestRiskReportStep.requestreportstep();
		
		String step4heading = driver.findElement(By.xpath("//h1[text()='Review Risk Report']")).getText();
		System.out.println(step4heading);
		Assert.assertEquals(step4heading,"Review Risk Report");

		//Review Risk Report Step
		Step4ReviewRiskReportStep reviewRiskReportStep = new Step4ReviewRiskReportStep(driver);
		reviewRiskReportStep.reviewRiskReport();
		
		String step5heading = driver.findElement(By.xpath("//h1[text()='Risk Details']")).getText();
		System.out.println(step5heading);
		Assert.assertEquals(step5heading,"Risk Details");
						   
		//Risk Details Step
		
		Step5RiskDetailsStepNonTX risDetailsStep = new Step5RiskDetailsStepNonTX(driver);
		risDetailsStep.riskdetailstep( 
				"DWELLING",
				getParameters().getProperty("H092COVALIMIT"), 
				getParameters().getProperty("H092COVCLIMIT"), 
				getParameters().getProperty("AOPDEDUTIBLEDOLLARAMOUNT"), 
				getParameters().getProperty("WINDHAILDEDUTIBLETypeWINDHAIL"), 
				getParameters().getProperty("WINDHAILDEDUTIBLEPERCENTAGE")
				); 
		
							 
		//Loss History & Scheduled Article(s)
		Step6LossHistoryStep lossHistoryStep = new Step6LossHistoryStep(driver);
		lossHistoryStep.losshistorystep();
							 
		//Select Products step
		Step7SelectProductsStep selectProductsStep = new Step7SelectProductsStep(driver);
		selectProductsStep.selectproductsstep("Hiscox Bind Plus");			 
								 
		//CDB/Additional Interest
		Step8CDBAdditionalInterestsStep cDBAdditionalInterestsStep = new Step8CDBAdditionalInterestsStep(driver);
		cDBAdditionalInterestsStep.cdbadditioanlinterestsstep();
							 
		//SubmitQuote Step	
		Step9SubmitQuoteStep submitQuoteStep = new Step9SubmitQuoteStep(driver);
		submitQuoteStep.submitquotestep();
		
	
		//Sync Quote to C1
		SyncQuotetoC1 syncQuotetoC1 = new SyncQuotetoC1(driver);
		syncQuotetoC1.syncquote();
		 
		//Quote status update to Bind Requested status
		MoveQuoteStatustoBindRequested changeQuoteStatus= new MoveQuoteStatustoBindRequested(driver);
		changeQuoteStatus.changequotestatus();
		
		 //Generate Policy Proof Document
		GeneratePolicyProofDocument generatePolicyProofDoc = new GeneratePolicyProofDocument(driver);
		generatePolicyProofDoc.generatePolicyProofDocument();
		//Bind the Quote

		QuoteBindAPI quoteBind = new QuoteBindAPI(driver);
		quoteBind.bindQuote();
		
		//tearDownDriver();
	}
	
}


