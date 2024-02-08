package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import io.qameta.allure.Step;

public class GoogleAccountPage extends Basetest {
	public GoogleAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// EmailID google account
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")	
	WebElement EmailIDGoogle1;
	// Next 1 btnclick
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement Next1Click;
	// Email pass google account
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
	private WebElement Emailpassgoogle;
	// Next 2 btnclick
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement Next2Click;
	// Searchbox
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[2]/div[2]/header/div[2]/div[2]/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/input[1]")
	private WebElement SearchBox;
	// old mail click
	@FindBy(css = "div[role='main'] table[role='grid'] tbody tr:nth-child(1)")
	private WebElement clicktheonboardoldmail;
	// clicking the link
	@FindBy(xpath = "//p[text()='Congratulations! You have been successfully onboarded.']/following-sibling::p/a")
	private WebElement clickthelink;
	// mailloginclick
	@FindBy(css = "#\\:ne > div:nth-child(2) > table > tbody > tr:nth-child(2) > td > p:nth-child(6) > a")
	private WebElement mailloginclick;
	// maillink
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/table/tbody/tr[2]/td/p[6]/a")
	private WebElement maillink;
	// username gettext
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/table/tbody/tr[2]/td/p[3]/a")
	WebElement usernamegettext;
	// password gettext
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/table/tbody/tr[2]/td/p[4]/span[2]")
	private WebElement passwordgettext;
//	// Enter Username for bidz.ai login page 2
//	@FindBy(xpath = "//input[@type='text']")
//	WebElement Username;
//	// enter password for bidz.ai login2
//	@FindBy(xpath = "//input[@type='password']")
//	WebElement password;
//	// click the login click in bidz.ai login 2
//	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
//	WebElement loginclick;
//	// success popup click
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button")
//	WebElement succesfullokbtnclick;
//	// get text the success pop
//	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/span")
//	WebElement successgettext;

	
	
	
	
	@Step("Enter EmailIDGoogle")
	public void EmailIDGoogle(String EmailIDgoogle2) throws Exception {
		Thread.sleep(5000);
		EmailIDGoogle1.sendKeys(EmailIDgoogle2);
	}

	@Step("click nxt btn")
	public void Next1Click() {
		Next1Click.click();
	} 

	@Step("Enter Email pass google")
	public void Emailpassgoogle(String Emailpass) {
		Emailpassgoogle.sendKeys(Emailpass);         
	}

	@Step("click nxt btn")
	public void Next2Click() {
		Next2Click.click();
	}

	@Step("search box")
	public void searchbox() throws Exception {
		Thread.sleep(8000);
		SearchBox.click();
		SearchBox.sendKeys("Welcome to Teckost! Activate Your Account and Set a New Password");
		SearchBox.sendKeys(Keys.ENTER);
	}

	public void clicktheonboardoldmail() {
		clicktheonboardoldmail.click();
	}

	public void clickthelink() {
		clickthelink.click();
	}

	public void mailloginclick() {
		mailloginclick.click();
	}

	public void maillink() {
		maillink.click();
	}

	public String usernamegettext() {
		return usernamegettext.getText();
	}

	public String passwordgettext() {
		return passwordgettext.getText();
	}

	
//	public void Username2(String usrname) throws Exception {
//
//		Thread.sleep(2000);
//		waitMethod();
//		Username.click();
//		waitMethod();
//		Username.clear();
//		waitMethod();
//	
//		JavascriptExecutor js = (JavascriptExecutor) driver1;
//		js.executeScript("arguments[0].value='" + usrname + "';", Username);
//	}
//
//	public void password2(String pswds2) throws Exception {
//		
//		Thread.sleep(2000);
//		waitMethod();
//		password.click();
//		waitMethod();
//		password.clear();
//		waitMethod();
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver1;
//		js.executeScript("arguments[0].value='" + pswds2 + "';", password);
//	}
//
//	public void login2click() throws Exception {
//		waitMethod();
//		JavascriptExecutor js = (JavascriptExecutor) driver1;
//		js.executeScript("arguments[0].click();", loginclick);
//	}
//
//	public void successbtnclick() {
//		waitMethod();
//		succesfullokbtnclick.click();
//	}
//
//	public void successgettext() {
//		waitMethod();
//		successgettext.getText();
//	}

}
