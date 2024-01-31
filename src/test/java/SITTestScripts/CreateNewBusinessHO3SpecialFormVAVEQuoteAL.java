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

import HWKSalesConsole.AddRiskLocation;
import HWKSalesConsole.CreateNewOpportunity;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.SelectApplication;
import HWKSalesConsole.Step1StartQuoteStep;
import HWKSalesConsole.Step2InsuredNameRiskLocationStep;
import HWKSalesConsole.Step3RequestRiskReportStep;
import HWKSalesConsole.Step4ReviewRiskReportStep;
import HWKSalesConsole.Step5RiskDetailsStepNonTX;
import HWKSalesConsole.Step6LossHistoryStep;
import HWKSalesConsole.Step7SelectProductsStep;
import HWKSalesConsole.Step8CDBAdditionalInterestsStep;
import HWKSalesConsole.Step9SubmitQuoteStep;

public class CreateNewBusinessHO3SpecialFormVAVEQuoteAL extends BaseTest {

	@Test
	public void createQuote() throws InterruptedException,NullPointerException, IOException {
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
		addriskloc.addRiskLoc(getParameters().getProperty("RISKLOCAL"));
		markStageasComplete();
		Thread.sleep(1000);

		//Start Quote Step
		Step1StartQuoteStep sstartQuoteStep = new Step1StartQuoteStep(driver);
		sstartQuoteStep.startstep(getParameters().getProperty("HO3SPECIALFORM"));
		
		//Insured Name &  Risk Location step
		Step2InsuredNameRiskLocationStep insurednamerisklocstep = new Step2InsuredNameRiskLocationStep(driver);
		insurednamerisklocstep.insureNamerisklocation();				    
		
		//Request Risk Report Step
		Step3RequestRiskReportStep requestRiskReportStep = new Step3RequestRiskReportStep(driver);
		requestRiskReportStep.requestreportstep();

		//Review Risk Report Step
		Step4ReviewRiskReportStep reviewRiskReportStep = new Step4ReviewRiskReportStep(driver);
		reviewRiskReportStep.reviewRiskReport();
						   
		//Risk Details Step
		Step5RiskDetailsStepNonTX risDetailsStep = new Step5RiskDetailsStepNonTX(driver);
	
		risDetailsStep.riskdetailstep(
				"HOMEOWNERS",
				getParameters().getProperty("H092COVALIMIT"), 
				getParameters().getProperty("H092COVCLIMIT"), 
				getParameters().getProperty("AOPDEDUTIBLEDOLLARAMOUNT"), 
				getParameters().getProperty("WINDHAILDEDUTIBLETypeEXCLUDED"), 
				getParameters().getProperty("WINDHAILDEDUTIBLEPERCENTAGE")
				);	
		
		//Loss History & Scheduled Article(s)
		Step6LossHistoryStep lossHistoryStep = new Step6LossHistoryStep(driver);
		lossHistoryStep.losshistorystep();
							 
		//Select Products step
		Step7SelectProductsStep selectProductsStep = new Step7SelectProductsStep(driver);
		selectProductsStep.selectproductsstep("VAVE (Canopius)");			 
								 
		//CDB/Additional Interest
		Step8CDBAdditionalInterestsStep cDBAdditionalInterestsStep = new Step8CDBAdditionalInterestsStep(driver);
		cDBAdditionalInterestsStep.cdbadditioanlinterestsstep();
							 
		//SubmitQuote Step	
		Step9SubmitQuoteStep submitQuoteStep = new Step9SubmitQuoteStep(driver);
		submitQuoteStep.submitquotestep();
			
		tearDownDriver();
	}
	
}


