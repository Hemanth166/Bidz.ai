package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Generic.global.Createlog;
import com.Generic.global.WebDriverUtilfunctions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	public static WebDriver driver;
	public static WebDriver driver1;
	public static WebDriver driver2;
	
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports Extent;
	public static ExtentTest Test;
	public  Createlog logger = new Createlog();
	public  WebDriverUtilfunctions wUtil = new WebDriverUtilfunctions(driver);

	@BeforeSuite
	public void setUp() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications--");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.info("----Browser launched Successfully---------");
		
	}

	
//=====================================================================================================================================		

	public static void safeClick(WebElement element, int maxRetries) {
		int attempts = 1;
		while (attempts < maxRetries) {
			try {
				element.click();
				break;
			} catch (StaleElementReferenceException e) {
				// Element is stale, retry the action
				attempts++;
			}
		}
	}

	public static void launchbrowser2() {
	
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhesgi6u-WDosNTdnlwdnSeqBah5cRwr1Phr7MJ5mG1lvvUhx17iK0NV3yYS3YcT40M9RSXKnA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S956565027%3A1697006068448564&theme=glif");
	}

	public void qabidz() {
		driver.get("https://qa.bidz.ai/#/login");
	}
	public static void launchbrowser3() {
		
		WebDriverManager.chromedriver().setup();
		driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://qa.bidz.ai/#/login");
	}

	public void page() {
		driver.get("https://qa.bidz.ai/");
	}

	@SuppressWarnings("deprecation")
	public static void waitMethod() {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public static void jsClick(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ref);

	}

	public static void NewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}

	public static void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}

	public static void GoogleAccount() {
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7U4P2GlaW-e2in4NvdNgRRxUFa1eDfLJniYcwPTaS4n4FqgbGSJsv-ejUNtdBuoN0Yo6Tz13w&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S268484491%3A1692960590839657");

	}


	public static void jsClick1(WebElement ref) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ref);

	}

//========================================================================================================================================		

	public void scrollBy() {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("window.scrollBy(0,300)", "");
	}

	public void waitmethod() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void gmailaccount() {
		driver.get(
				"https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&ifkv=AYZoVhdOaLG5VwjaVpb4i0yp7KgkM5wWz9ELtcCwXa93MuHictRnN_3SMSbzSqUz-iKqW1XueDu1&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-485948339%3A1695226678070229&theme=glif");
	}

	@BeforeTest
	public static void Extendreport() {
		htmlreport = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/htmlreports.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlreport);

		htmlreport.config().setDocumentTitle("Report");
		htmlreport.config().setReportName("TestReport");

	}

	@AfterSuite
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		Extent.flush();
		// driver.quit();
		logger.info("-------browser closed successfully-------");
	}
}
