package Bidz.ai.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.invokers.Arguments;

import com.BaseTest.Basetest;

public class vendor_signup_bussinessinfopage extends Basetest {

	public vendor_signup_bussinessinfopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//  BUSINESS INFO

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/p")
	WebElement bidzpage;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]/input")
	WebElement companyname;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div")
	WebElement companytype;

	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[9]")
	WebElement pvtlmt;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[3]/input")
	WebElement companywebsite;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[4]/input")
	WebElement companyregisternumber;

// COMPANY ADDRESS	

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[1]/input")
	WebElement companyaddress;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div[2]/input")
	WebElement country;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[2]/div[3]/div/div/div/div[1]/div[2]/input")
	WebElement state;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[2]/div[4]/div/div/div/div[1]/div[2]/input")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[5]/input")
	WebElement postalcode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[6]/input")
	WebElement workingdays;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[7]/input")
	WebElement workinghours;

// COMPANY CONTACT DETAILS

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/input")
	WebElement phonenumber;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/div[2]/input")
	WebElement faxnumber;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[3]/div/input")
	WebElement officialmail;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[3]/div/button")
	WebElement clickgetotp;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[4]/div/div/input[1]")
	WebElement enterotp;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[5]/div[1]/div/input")
	WebElement password;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[6]/div/input")
	WebElement confirmpassword;

//  GMAIL OTP	

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
	WebElement gmailid;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
	WebElement Next;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
	WebElement password1;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
	WebElement Next1;

	// OLD GMAILMAILLOGOUT

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[2]/div[2]/header/div[2]/div[3]/div[1]/div[2]/div/a/img")
	WebElement clickgmaillogout;

	@FindBy(xpath = "/html/body/div/c-wiz/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/span/span[2]/a/span[2]/div/div")
	WebElement gmaillogout;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[2]/div/div/div[2]")
	WebElement clickaddacount;

	// GMAIL SEARCHBOX

	@FindBy(css = "#gs_lc50 > input:nth-child(1)")
	WebElement targetsearchmessage;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[5]/div[1]/div/table/tbody/tr")
	WebElement clicktargetmessage;

	@FindBy(css = "h3[style*='background:#9cc9e5;']")
	WebElement mailotp;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[2]/div[4]/div/div/input[1]")
	WebElement Enterotp1;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[3]/div/button/span")
	WebElement Nextbutton;

//  BUSINESS INFO	

	public String bidzpage() {

		waitmethod();
		return bidzpage.getText();

	}

	public void companyname(String Campanyname) throws Exception {

		waitmethod();
		companyname.sendKeys(Campanyname);

	}

	public void companytype(String Campanytype) {
		waitmethod();
		companytype.click();

	}

	public void Pvtlmt() {
		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", pvtlmt);
	}

	public void companywebsite(String Campanywebsite) {
		waitmethod();
		companywebsite.click();
		waitmethod();
		companywebsite.sendKeys(Campanywebsite);
	}

	public void companyregisternumber(String Campanyregisternumber) {
		waitmethod();
		companyregisternumber.click();
		waitmethod();
		companyregisternumber.sendKeys(Campanyregisternumber);
//		JavascriptExecutor ex = (JavascriptExecutor) driver;
//	    ex.executeScript("arguments[0].sendkeys='"+ campanyregisternumber +"';", companyregisternumber);

	}

// COMPANY ADDRESS

	public void companyaddress(String Campanyaddress) {
		waitmethod();
		companyaddress.click();
		waitmethod();
		companyaddress.sendKeys(Campanyaddress);
	}

	public void country() throws Exception {
		// waitmethod();
		Thread.sleep(2000);
		country.sendKeys("India");
		Thread.sleep(3000);
		Robot robot = new Robot();
		waitmethod();
		robot.keyPress(KeyEvent.VK_DOWN);
		waitmethod();
		robot.keyPress(KeyEvent.VK_ENTER);

//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);

//	    Select select = new Select(country);
//	    select.selectByVisibleText("India");
//	    country.sendKeys("India");
//	    
//		Actions action = new Actions(driver);
//		action.click(country);

//		JavascriptExecutor ex = (JavascriptExecutor) driver;
//	    ex.executeScript("arguments[0].sendkeys", country);
	}

	public void state() throws Exception {
		waitmethod();
		state.click();
		Thread.sleep(3000);
		state.sendKeys("Karnataka");
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

	public void city() throws Exception {
		waitmethod();
		city.click();
		waitmethod();
		city.sendKeys("Bangalore");
		Robot robot = new Robot();
		waitmethod();
		robot.keyPress(KeyEvent.VK_DOWN);
		waitmethod();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public void postalcode(String Postalcode) {
		waitmethod();
		postalcode.click();
		waitmethod();
		postalcode.sendKeys(Postalcode);
	}

	public void workingdays(String Workingdays) {
		waitmethod();
		workingdays.click();
		waitmethod();
		workingdays.sendKeys(Workingdays);
	}

	public void workinghours(String Workinghours) {
		waitmethod();
		workinghours.click();
		waitmethod();
		workinghours.sendKeys(Workinghours);
	}

//  COMPANY CONTACT DETAILS

	public void phonenumber(String Phonenumber) {
		waitmethod();
		phonenumber.click();
		waitmethod();
		phonenumber.sendKeys(Phonenumber);
	}

	public void faxnumber(String Faxnumber) {
		scrollBy();
		waitmethod();
		faxnumber.click();
		waitmethod();
		faxnumber.sendKeys(Faxnumber);
		scrollBy();
	}

	public void officialmailid(String Officialmailid) throws Exception {

		scrollBy();
		Thread.sleep(4000);
		officialmail.click();
		waitmethod();
		officialmail.sendKeys(Officialmailid);
//		JavascriptExecutor ex = (JavascriptExecutor) driver;		
//		ex.executeScript("arguments[0].scrollIntoView(true);", officialmail);
//		ex.executeScript("arguments[0].value='"+ Officialmailid +"';", officialmail);

	}

	public void password(String Password) {
		waitmethod();
		password.click();
		waitmethod();
		password.sendKeys(Password);
	}

	public void confirmpassword(String Confirmpassword) {
		waitmethod();
		confirmpassword.click();
		waitmethod();
		confirmpassword.sendKeys(Confirmpassword);
	}

	public void clickgetotp() throws Exception {
		scrollBy();
		Thread.sleep(2000);
		waitmethod();
		clickgetotp.click();
	}

	public void clickgmaillogout() throws Exception {

		waitmethod();
		// clickgmaillogout.click();
		Actions action = new Actions(driver);
		action.moveToElement(clickgmaillogout).click().perform();

	}

	public void gmaillogout() {
		waitmethod();
		driver.switchTo().frame("account");
		gmaillogout.click();

	}

	public void Enterotp(String otp) {
		waitmethod();
		Enterotp1.click();
		Enterotp1.sendKeys(otp);
		scrollBy();

	}

	public void Nextbutton() throws Exception {

		Thread.sleep(3000);
		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", Nextbutton);
		ex.executeScript("arguments[0].click();", Nextbutton);

	}

	public void gmailid(String username2) {
		waitmethod();
		gmailid.click();
		gmailid.sendKeys(username2);
	}

	public void Next() {
		Next.click();
	}

	public void password2(String passward) throws Exception {
		waitmethod();
		password1.click();
		waitmethod();
		password1.sendKeys(passward);
	}

	public void Next1() throws Exception {

		Next1.click();
		Thread.sleep(2000);
	}

	public void Targetsearchmeaasgeclick(String searchmessage) throws Exception {
		Thread.sleep(10000);
		targetsearchmessage.click();
		Thread.sleep(2000);
		targetsearchmessage.clear();
		Actions action = new Actions(driver);
		action.moveToElement(targetsearchmessage).click().perform();
		targetsearchmessage.sendKeys("OTP for Onboard");
		targetsearchmessage.sendKeys(Keys.RETURN);
	}

	public void clicktargetmessage() throws Exception {
		Thread.sleep(2000);
		clicktargetmessage.click();

	}

	public String readotpmail() throws Exception {
		scrollBy();
		Thread.sleep(1000);
		return mailotp.getText();
	}

}
