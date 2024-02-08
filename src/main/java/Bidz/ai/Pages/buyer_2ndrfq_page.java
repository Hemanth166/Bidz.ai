package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class buyer_2ndrfq_page extends Basetest {

	public buyer_2ndrfq_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// 2ND BUYER LOGIN	

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div/div/input")
	WebElement emailaddress;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement password;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
	WebElement loginbutton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement okaybutton;

// 2ND BUYER LOGIN		

	public void emailaddress(String Emailaddress) {

		waitmethod();
		emailaddress.sendKeys(Emailaddress);
	}

	public void password(String Password) {

		waitmethod();
		password.sendKeys(Password);
	}

	public void loginbutton() {

		waitmethod();
		loginbutton.click();
	}

	public void okaybutton() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		okaybutton.click();

	}

// 2ND BUYER RFQ PROCESS	

	// BUYER RFQ

	@FindBy(xpath = "/html/body/div/div/div/div[1]/a[3]/p")
	WebElement Rfq;

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[8]/div[1]/img")
	WebElement viewrfq;

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[6]/span")
	WebElement click_view_vendor_bid;

	// BUYER RFQ REVISED QUOTE

                  
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[4]/div[1]/div/table/tbody/tr[1]/td[7]/div/div/button/span")
	WebElement click_select_bid;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div/button/span")
	WebElement click_submit_yes;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button/span")
	WebElement clickokatbutton;

	// LOGOUT BUYER

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
	WebElement clickbuyerlogout;

	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
	WebElement clicklogout;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
	WebElement confirmlogout;

	// BUYER RFQ

	public void clickRfq() {
		waitmethod();
		Rfq.click();
	}

	public void viewrfq() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		viewrfq.click();
	}

	public void click_view_vendor_bid() throws Exception {

		scrollBy();
		Thread.sleep(2000);
		waitmethod();
		// click_view_vendor_bid.click();

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", click_view_vendor_bid);
		ex.executeScript("arguments[0].click();", click_view_vendor_bid);

	}

	public void click_select_bid() throws Exception {
		scrollBy();
		Thread.sleep(2000);
		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", click_select_bid);
		ex.executeScript("arguments[0].click();", click_select_bid);
	}

	public void click_submit_yes() throws Exception {
		Thread.sleep(4000);
		waitmethod();
		click_submit_yes.click();
	}

	public void clickokatbutton() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		clickokatbutton.click();
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
	
	
	
	// VENDOR FINAL LOGIN
	
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div/div/input")
	WebElement vendoremailaddress;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement vendorpassword;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
	WebElement vendorloginbutton;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement vendorokaybutton;
	
	
	
	public void vendoremailaddress(String Emailaddress) {
		
		waitmethod();
		vendoremailaddress.sendKeys(Emailaddress);
	}

	public void vendorpassword(String Password) {
		
		waitmethod();
		vendorpassword.sendKeys(Password);
	}
	
	public void vendorloginbutton( ) {

		waitmethod();
		vendorloginbutton.click();
	}	
	
	public void vendorokaybutton() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		vendorokaybutton.click();	
		
		
	}		
	
	
	
	
	// CLICK NOTIFICATION
	
	
	
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[2]/div/img")
	WebElement clicknotificationbell;
	 
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/div")
	WebElement selectnotification;

	@FindBy(css = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ab2xsx > div > div.NotificationBell_notificationHeader__T85qB > svg")
	WebElement closenotification;
	
	
	
	public void clicknotificationbell() {
		waitmethod();
		clicknotificationbell.click();
	}
	
	public String selectnotification() {
		waitmethod();
		selectnotification.click();
		return selectnotification.getText();
	}
	
	public void closenotification() {
		waitmethod();
		closenotification.click();
	}
	
	
	
//  VENDOR LOGOUT
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
	WebElement clickvendorloginlogout;

	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
	WebElement vendorloginlogout;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
	WebElement confirmvendorlogout;
	
	
	public void clickvendorloginlogout() throws Exception {
		 Thread.sleep(2000);
		waitmethod();
		clickvendorloginlogout.click();
	}

	public void vendorloginlogout() throws Exception {
		 Thread.sleep(2000);
		waitmethod();
		vendorloginlogout.click();
	}

	public void confirmvendorlogout() throws Exception {
		
    Thread.sleep(2000);
		waitmethod();
		confirmlogout.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
