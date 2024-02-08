package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class Buyer_Rfq_page extends Basetest {

	public Buyer_Rfq_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// BUYER RFQ	
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/a[3]/p")
	WebElement Rfq;
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[8]/div[1]/img")
	WebElement viewrfq;
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[6]/span")
	WebElement click_view_vendor_bid;
	
// BUYER RFQ REVISED QUOTE
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div[2]/div/button/span")
	WebElement click_request_revisied_quote;
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[4]/div[1]/div/table/tbody/tr/td[1]/span/input")
	WebElement click_select_vendor;
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div[2]/div/button/span")
	WebElement click_submit_quote;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button/span")
	WebElement clickokatbutton;
	
// LOGOUT BUYER
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
	WebElement clickbuyerlogout;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
	WebElement clicklogout;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
	WebElement confirmlogout;
	
//  2nd time VENDOR LOGIN
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div/div/input")
	WebElement emailaddress;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
	WebElement loginbutton;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement okaybutton;	
	
	
// VENDOR RFQ	
                           
		@FindBy(xpath = "/html/body/div/div/div/div[1]/a[2]/p")
		WebElement clickrfq;

		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[1]/div/span")
		WebElement rfq;
	                  
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[9]/div/img")
		WebElement viewvendorrfq;
		
// CLICK NOTIFICATION BELL

		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[2]/div/img")
		WebElement clicknotificationbell;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div[1]")
		WebElement selectnotification;

		@FindBy(css = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ab2xsx > div > div.NotificationBell_notificationHeader__T85qB > svg")
		WebElement closenotification;	
		
		
		
	//  Again SUBMIT BID - FOR FIRST ITERATION
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div[2]/button/span")
		WebElement submitbid2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/label")
		WebElement clickno2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div/input")
		WebElement quantity2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[3]/div/input")
		WebElement unitprice2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[5]/div/textarea")
		WebElement description2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button/span")
		WebElement clicksubmitbid2;

		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button/span")
		WebElement clickokaybutton2;		

		
//   VENDOR LOGOUT
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
		WebElement clickvendorloginlogout;

		@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
		WebElement vendorloginlogout;
		
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
		WebElement confirmvendorlogout;	
	
// VENDOR LOGIN	PROCESS
public void emailaddress(String Emailaddress) {
		
		waitmethod();
		emailaddress.sendKeys(Emailaddress);
	}

	public void password(String Password) {
		
		waitmethod();
		password.sendKeys(Password);
	}
	
	public void loginbutton( ) {

		waitmethod();
		loginbutton.click();
	}		
	
	public void okaybutton() {
		waitmethod();
		okaybutton.click();
	}
	
// VENDOR RFQ PROCESS
	
	public void clickrfq() {
		waitmethod();
		clickrfq.click();
	}

	public String rfq() {
		waitmethod();
		return rfq.getText();
	}

	public void viewvendorrfq() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", viewvendorrfq);
		ex.executeScript("arguments[0].click();", viewvendorrfq);

	}	
	
	
	// CLICK NOTIFICATION BELL

		public void clicknotificationbell() {
			waitmethod();
			clicknotificationbell.click();
		}

		public String selectnotification() throws Exception {
			Thread.sleep(2000);
			waitmethod();
			selectnotification.click();
			return selectnotification.getText();
		}

		public void closenotification() throws Exception {
			Thread.sleep(5000);
			waitmethod();
			closenotification.click();

		}		
	
		public void submitbid2() throws Exception {

			waitmethod();
			// submitbid2.click();
			String urll = driver.getCurrentUrl();
			System.out.println(urll);
			Thread.sleep(5000);
			JavascriptExecutor ex = (JavascriptExecutor) driver;
			ex.executeScript("arguments[0].scrollIntoView(true);", submitbid2);
			ex.executeScript("arguments[0].click();", submitbid2);
		}

		public void clickno2() {
			waitmethod();
			clickno2.click();
		}

		public void quantity2(String Quantity2) {
			waitmethod();
			quantity2.sendKeys(Quantity2);
		}

		public void unitprice2(String Unitprice2) {
			waitmethod();
			unitprice2.sendKeys(Unitprice2);
		}

		public void description2(String Description2) {
			scrollBy();
			waitmethod();
			description2.sendKeys(Description2);
		}

		public void clicksubmitbid2() throws Exception {
			Thread.sleep(3000);
			waitmethod();
			clicksubmitbid2.click();
		}	
	
		public void clickokaybutton2() throws Exception {
			Thread.sleep(3000);
			waitmethod();
			clickokaybutton2.click();
		}	
//  VENDOR LOGOUT	
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
		confirmvendorlogout.click();
		}
	
	
// BUYER  RFQ	
	
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
	
	
	public void click_requestrevisiedquote() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		click_request_revisied_quote.click();
	}
	
	public void click_selectvendor() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		click_select_vendor.click();
	}
	
	public void click_submitquote() throws Exception {
		scrollBy();
		Thread.sleep(3000);
		waitmethod();
		click_submit_quote.click();
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

	

	
	
	
}
