package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class vendor_signup_bankdetails_page extends Basetest {

	public vendor_signup_bankdetails_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// BANK DETAILS	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[2]/div/p")
	WebElement bankdetailspage;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/input")
	WebElement bankname;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/input")
	WebElement accountholdername;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[3]/input")
	WebElement accountnumber;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[4]/input")
	WebElement accounttype;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[5]/input")
	WebElement branchcode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[6]/input")
	WebElement ifsccode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[7]/input")
	WebElement branchaddress;

// STATUTORY DETAILS	

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div")
	WebElement taxiidtype;

	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[3]")
	WebElement selecttaxnumber;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/input")
	WebElement taxcode;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[3]/input")
	WebElement pannumber;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[4]/input")
	WebElement isonumber;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[5]/input")
	WebElement lutnumber;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[2]/div[6]/div/div/input")
	WebElement lutdate;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[7]/input")
	WebElement msmeregnumber;
	   
	@FindBy(css = "#root > div > div > div.vendorSignup_stages__XQOBR > div:nth-child(3) > div.vendorSignup_btnWrapper__rvbV4 > div.SignupButtons_btnWrapper__fl5XG.vendorSignup_nextBtn__LSZrp > button > span")
	WebElement Nextbutton;

// BANK DETAILS	
	
	public String bankdetailspage() throws Exception {
		waitmethod();
		return bankdetailspage.getText();

	}

	public void bankname(String Bankname) throws Exception {
		Thread.sleep(4000);
		waitmethod();
		bankname.sendKeys(Bankname);

	}

	public void accountholdername(String Accountholdername) {
		waitmethod();
		accountholdername.sendKeys(Accountholdername);
	}

	public void accountnumber(String Accountnumber) {
		waitmethod();
		accountnumber.sendKeys(Accountnumber);

	}

	public void accounttype(String Accounttype) {
		waitmethod();
		accounttype.sendKeys(Accounttype);
	}

	public void branchcode(String Branchcode) {
		waitmethod();
		branchcode.sendKeys(Branchcode);
	}

	public void ifsccode(String Ifsccode) {
		waitmethod();
		ifsccode.sendKeys(Ifsccode);
	}

	public void branchaddress(String Branchaddress) {
		waitmethod();
		branchaddress.sendKeys(Branchaddress);
	}
	
// STATUTORY DETAILS

	public void taxiidtype() {
		waitmethod();
		taxiidtype.click();
	}

	public void selecttaxnumber() {
		waitmethod();
		selecttaxnumber.click();
		selecttaxnumber.sendKeys(Keys.ENTER);
	}

	public void taxcode(String Taxcode) {
		waitmethod();
		taxcode.sendKeys(Taxcode);
	}

	public void pannumber(String Pannumber) {
		waitmethod();
		pannumber.sendKeys(Pannumber);
	}

	public void isonumber(String Isonumber) {
		waitmethod();
		isonumber.sendKeys(Isonumber);
	}

	public void lutnumber(String Lutnumber) {
		waitmethod();
		lutnumber.sendKeys(Lutnumber);
	}

	public void lutdate(String Lutdate) throws Exception {
		
		Thread.sleep(2000);
		lutdate.click();
		Thread.sleep(2000);
		lutdate.clear();
		Thread.sleep(2000);
		lutdate.click();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
	    ex.executeScript("arguments[0].value='"+ Lutdate +"';", lutdate);
	}

	public void msmeregnumber(String Msmeregnumber) {
		waitmethod();
		msmeregnumber.sendKeys(Msmeregnumber);
	}

	public vendor_signup_contactdetails_page Nextbutton() throws Exception {
		
		Thread.sleep(4000);
		waitmethod();		
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", Nextbutton);
		ex.executeScript("arguments[0].scrollIntoView(true);", Nextbutton);
		
		return new vendor_signup_contactdetails_page(driver);
	}

}
