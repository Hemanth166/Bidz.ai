package Bidz.ai.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseTest.Basetest;

public class AddVendor_page extends Basetest {

	
	WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(30));

	public AddVendor_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Click vendor btn
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/a[2]")
	WebElement Clickvendorbtn;

	// Add Vendor
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[2]/div[2]/button")
	WebElement AddVendorclick;

	// get text
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/span")
	WebElement AddvendorGettext;

	// Company name in Add vendor
	@FindBy(xpath = "//*[@id=\":ra:\"]")
	WebElement Companynamevendor;

	// Person name in Add vendor
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div[1]/div/input")
	WebElement personname;

	// EmailId
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/input")
	WebElement emailid;

	// Addbtnclick
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button")
	WebElement Addbtnclick;

	// vendor invite send successfully message
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/span")
	WebElement successmsgvendor;

	// okaybtnclick
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button")
	WebElement okaybtnclick;
	
// logout buyer
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
	WebElement clickbuyerlogout;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
	WebElement clicklogout;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
	WebElement confirmlogout;	

	

	public void Clickvendorbtn() {
		Clickvendorbtn.click();
	}


	public void AddVendorclick() {
		AddVendorclick.click();
	}

	public void AddvendorGettext() {
		AddvendorGettext.getText();
	}

	public void Companynamevendor(String company) {
		Companynamevendor.sendKeys(company);
	}

	public void personname(String person) {
		personname.sendKeys(person);
	}

	public void emailid(String email) {
		emailid.sendKeys(email);
	}

	public void Addbtnclick() {
		Addbtnclick.click();
	}

	public void successmsgvendor() {
		successmsgvendor.getText();
	}

	public void okaybtnclick() {
		okaybtnclick.click();
	}
	// LOGOUT BUYER
	
		public void clickbuyerlogout() {
			waitmethod();
			clickbuyerlogout.click();
		}
		
		public void clicklogout() throws Exception {
			Thread.sleep(2000);
			waitmethod();
			clicklogout.click();
		}
		
		public void confirmlogout() throws Exception {
			Thread.sleep(2000);
			waitmethod();
			confirmlogout.click();
		}
	
	
	
}
