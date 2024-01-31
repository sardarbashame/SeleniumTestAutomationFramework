package DevAllTestScripts;

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
import HWKSalesConsole.GeneratePolicyProofDocument;
import HWKSalesConsole.LoginIntoHWKSalesConsole;
import HWKSalesConsole.MoveQuoteStatustoBindRequested;
import HWKSalesConsole.QuoteBindInternallyRated;
import HWKSalesConsole.SelectApplication;
import HWKSalesConsole.Step1StartQuoteStep;
import HWKSalesConsole.Step2InsuredNameRiskLocationStep;
import HWKSalesConsole.Step3RequestRiskReportStep;
import HWKSalesConsole.Step4ReviewRiskReportStep;
import HWKSalesConsole.Step5RiskDetailsStepTX;
import HWKSalesConsole.Step6LossHistoryStep;
import HWKSalesConsole.Step7SelectProductsStep;
import HWKSalesConsole.Step8CDBAdditionalInterestsStep;
import HWKSalesConsole.Step9SubmitQuoteStep;
import HWKSalesConsole.SyncQuotetoC1;

public class DevCreateDP3WindOnlyNewBusinessH092PolicyTX extends BaseTest {

	@Test
	public void createQuote() throws InterruptedException,NullPointerException, IOException {
		// TODO Auto-generated method stub
		intializeDriver();
		LoginIntoHWKSalesConsole loginPO = new LoginIntoHWKSalesConsole(driver);
		loginPO.goTo(getParameters().getProperty("SIT1_URL"));
		loginPO.LoginApp(
				getParameters().getProperty("DEV_SARDARUSERNAME"), 
				getParameters().getProperty("DEV_SARDARPASSWORD")
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
				getParameters().getProperty("DEV_RETAILER"),
				getParameters().getProperty("DEV_RETAILCONTACT"),
				getParameters().getProperty("DEV_INDACCOUNT")
				);
		AddRiskLocation addriskloc = new AddRiskLocation(driver);
		addriskloc.addRiskLoc(getParameters().getProperty("RISKLOCTX"));
		markStageasComplete();
		 Thread.sleep(1000);

		//Start Quote Step
		Step1StartQuoteStep sstartQuoteStep = new Step1StartQuoteStep(driver);
		sstartQuoteStep.startstep(getParameters().getProperty("DP3WINDONLY"));
		
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
		Step5RiskDetailsStepTX risDetailsStep = new Step5RiskDetailsStepTX(driver);
		risDetailsStep.riskdetailstep(
				getParameters().getProperty("H092COVALIMIT"), 
				getParameters().getProperty("AOPDEDUTIBLEPERCENTAGE"), 
				getParameters().getProperty("WINDHAILDEDUTIBLETypeEXCLUDED")
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

		QuoteBindInternallyRated quoteBind = new QuoteBindInternallyRated(driver);
		quoteBind.bindQuote();
		
		//tearDownDriver();
	}
	
}


