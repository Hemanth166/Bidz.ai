package Bidz.ai.Pages;	

import java.awt.Desktop.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;
import io.qameta.allure.Step;

public class OnBoardNow_Buyer_page extends Basetest{

	Actions actions = new Actions(driver);

	public OnBoardNow_Buyer_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Click OnBoardNow Button
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[1]/button/span")
	private WebElement OnBoardNow;
	// Click Buyer
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/label[1]")
	private WebElement ClickBuyer;
	// Click Continue btn
	@FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/button/span")
	private WebElement ClickContinue;

	// Company Name
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]/input")
	private WebElement CompanyName;
	// Company type dropdown
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div")
	private WebElement dropdown;
	// company type
	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[5]")
	private WebElement companytypename;
	// Company Registration Number
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[3]/input")
	private WebElement companyRegister;
	// FirstName
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[1]/input")
	private WebElement FirstName;
	// LastName
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[2]/input")
	private WebElement LastName;
	// *[@id="root"]/div/div/div[2]/div[3]/div[2]/div/div[3]/input
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[3]/input")
	private WebElement Designation;
	// PhoneNo
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[4]/div/input")
	private WebElement PhoneNo;
	// Email ID
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[2]/div/div[5]/div/input")
	private WebElement EmailId;
	// GetOTP
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[5]/div/button")
	private WebElement GetOTP;
	// EmailID google account
	@FindBy(id = "identifierId")
	private WebElement EmailIDGoogle;
	// Next 1 btnclick
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement Next1Click;
	// Email pass google account
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement Emailpassgoogle;
	// Next 2 btnclick
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement Next2Click;
	// Searchbox
	@FindBy(xpath = "//*[@id=\"gs_lc50\"]/input[1]")
	private WebElement SearchBox;
	// old mail click
	@FindBy(css = "div[role='main'] table[role='grid'] tbody tr:nth-child(1)")
	private WebElement clicktheonboardoldmail;
	// otp
	@FindBy(css = "h3[style*='background:#9cc9e5;']")
	WebElement Otptext;
	// otpboxenter
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div/div[6]/div/div/input[1]")
	WebElement Otpboxenter;
	// nxt btn click on bidz.ai
	@FindBy(css = "#root > div > div > div.BuyerSignup_stages__RcCd4 > div:nth-child(3) > div.BuyerSignup_btnWrapper__kMlre > div > button > span")
	WebElement nxtbtnclick;
	// enter password
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/input")
	WebElement Enterpassword1;
	// enter confirm password
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/input")
	WebElement Enterconfirm1;
	// submit btn
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[2]/button/span")
	WebElement submitbtn1;
	// By sign up radio butn click
	@FindBy(id = "t&c")
	WebElement BySignup;
	// success okay btn
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement Successokbtn;
	// maillogoutclick
	@FindBy(css = "#gb > div.gb_ld.gb_fd.gb_rd > div.gb_vd.gb_9a.gb_kd.gb_xd > div.gb_Qd > div.gb_b.gb_Ld.gb_Xf.gb_D > div > a")
	WebElement maillogoutclick;
	// signoutbtnclick
	@FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/span/span[2]")
	WebElement signoutbtnclick;
	// remove btn click
	@FindBy(css = "#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div > div > ul > li:nth-child(3) > div")
	WebElement removebtnclick;
	// sub-btnclick
	@FindBy(css = "#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div > div.pQ0lne > ul > li.JDAKTe.ibdqA.W7Aapd.zpCp3.SmR8 > div > div.n3x5Fb > svg")
	WebElement subbtnclick;
	// yesremovebtnclick
	@FindBy(css = "#yDmH0d > div.llhEMd.iWO5td > div > div.g3VIld.bYmtV.Up8vH.J9Nfi.iWO5td > div.XfpsVe.J9fJmf > div:nth-child(1) > span > span")
	WebElement yesremoveclick;

	@Step("Click OnBoard Button")
	public void OnBoardnow() throws Exception {
		waitmethod();
		OnBoardNow.click();
	}

	public void ClickBuyer() throws Exception {
		waitmethod();
		ClickBuyer.click();
	}

	public void ClickContinue() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		ClickContinue.click();
	}

	@Step("Enter company name")
	public void Companyname(String companyname) {
		
		waitmethod();		
		CompanyName.sendKeys(companyname);
	}

	@Step("Enter company type dropdown")
	public void Companytypedropdown() {
		waitmethod();
		actions.moveToElement(dropdown).click().perform();
	}

	@Step("Enter company type")
	public void companytypename() {
		waitmethod();
		actions.moveToElement(companytypename).click().perform();
	}

	@Step("Enter company Register")
	public void companyRegister(String companyregister) {
		waitmethod();
		companyRegister.sendKeys(companyregister);
	}

	@Step("Enter First name")
	public void FirstName(String firstname) {
		waitmethod();
		FirstName.sendKeys(firstname);
	}

	@Step("Enter Last name")
	public void LastName(String lastname) {
		waitmethod();
		LastName.sendKeys(lastname);
	}

	@Step("Enter Designation")
	public void Designation(String desgination) {
		waitmethod();
		Designation.sendKeys(desgination);
	}

	@Step("Enter Phoneno")
	public void PhoneNo(String Phoneno) {
		waitmethod();
		PhoneNo.sendKeys(Phoneno);
	}

	@Step("Enter Email Id")
	public void EmailId(String Emailid) {
		waitmethod();
		EmailId.sendKeys(Emailid);
	}

	@Step("click get otp button")
	public void GetOTP() {
		waitmethod();
		GetOTP.click();
	}

	@Step("Enter EmailIDGoogle")
	public void EmailIDGoogle(String EmailIDgoogle) {
		waitmethod();
		EmailIDGoogle.sendKeys(EmailIDgoogle);
	}

	@Step("click nxt btn")
	public void Next1Click() {
		waitmethod();
		Next1Click.click();
	}

	@Step("Enter Email pass google")
	public void Emailpassgoogle(String Emailpass) {
		waitmethod();
		Emailpassgoogle.sendKeys(Emailpass);
	}

	@Step("click nxt btn")
	public void Next2Click() {
		waitmethod();
		Next2Click.click();
	}

	@Step("search box")
	public void searchbox() {
		waitmethod();
		SearchBox.click();
		SearchBox.sendKeys("OTP for Onboard");
		SearchBox.sendKeys(Keys.ENTER);
	}

	@Step("click old mail")
	public void clicktheonboardoldmail() {
		waitmethod();
		clicktheonboardoldmail.click();
	}

	@Step("click old mail")
	public String OtpText() throws Exception {
		waitmethod();
		Thread.sleep(2000);
		return Otptext.getText();
	}

	public void Otpboxenter(String otp) {
		waitmethod();
		Otpboxenter.sendKeys(otp);
	}

	public void nxtbtnclick1() throws Exception {
		Thread.sleep(1000);
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", nxtbtnclick);

	}

	public void Enterpassword(String pswd) throws Exception {
		
		Thread.sleep(2000);
		waitmethod();
		safeClick(Enterpassword1, 1);
		Enterpassword1.click();
		Enterpassword1.sendKeys(pswd);
	}

	public void Enterconfirm(String confirmpswd) throws Exception {
		
		Thread.sleep(2000);
		waitmethod();
		Enterconfirm1.sendKeys(confirmpswd);
	}

	public void BySignup() throws Exception {
		Thread.sleep(2000);
		BySignup.click();
	}

	public void submitbtn1() {
		actions.moveToElement(submitbtn1).click().perform();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", submitbtn1);
		submitbtn1.click();
	}

	public void Successokbtn() {
		Successokbtn.click();
	}

	public void maillogoutclick() {
		maillogoutclick.click();
	}

	public void signoutbtnclick() throws Exception {
		Thread.sleep(3000);
		actions.moveToElement(signoutbtnclick).click().perform();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", signoutbtnclick);
		signoutbtnclick.click();
	}

	public void removebtnclick() {
		waitmethod();
		removebtnclick.click();
	}

	public void subbtnclick() {
		waitmethod();
		subbtnclick.click();
	}

	public void yesremoveclick() {
		waitmethod();
		yesremoveclick.click();
	}

}


