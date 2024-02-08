package Bidz.ai.Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseTest.Basetest;

public class vendor_Rfq_page extends Basetest {

	public vendor_Rfq_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// RFQ	

	@FindBy(xpath = "/html/body/div/div/div/div[1]/a[2]/p")
	WebElement clickrfq;

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[1]/div/span")
	WebElement rfq;
                  
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[9]/div/img")
	WebElement viewrfq;

//  SUBMIT BID

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div[2]/button/span")
	WebElement submitbid;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/label")
	WebElement clickno;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div/input")
	WebElement quantity;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[3]/div/input")
	WebElement unitprice;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[5]/div/textarea")
	WebElement description;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button/span")
	WebElement clicksubmitbid;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button/span")
	WebElement clickokaybutton;

//  Again SUBMIT BID - FOR FIRST ITERATION
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div[2]/button")
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
	
// CLICK NOTIFICATION BELL

	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[2]/div/img")
	WebElement clicknotificationbell;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/div")
	WebElement selectnotification;

	@FindBy(css = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ab2xsx > div > div.NotificationBell_notificationHeader__T85qB > svg")
	WebElement closenotification;

//   VENDOR LOGOUT
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div")
	WebElement clickvendorloginlogout;

	@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
	WebElement vendorloginlogout;
	
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
	WebElement confirmlogout;



	

// RFQ
	public void clickrfq() {
		waitmethod();
		clickrfq.click();
	}

	public String rfq() {
		waitmethod();
		return rfq.getText();
	}

	public void viewrfq() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", viewrfq);
		ex.executeScript("arguments[0].click();", viewrfq);

	}
	
// SUBMIT BID	=  PROCESS 1

	public void submitbid() {
		waitmethod();
		submitbid.click();
	}

	public void clickno() {
		waitmethod();
		clickno.click();
	}

	public void quantity(String Quantity) {
		waitmethod();
		quantity.sendKeys(Quantity);
	}

	public void unitprice(String Unitprice) {
		waitmethod();
		unitprice.sendKeys(Unitprice);
	}

	public void description(String Description) {
		waitmethod();
		description.sendKeys(Description);
	}

	public void clicksubmitbid() throws Exception {
		Thread.sleep(3000);
		waitmethod();
		clicksubmitbid.click();
	}

	public void clickokaybutton() {
		waitmethod();
		clickokaybutton.click();
	}

	// VENDOR LOGOUT

	public void clickvendorloginlogout() throws Exception {
		 Thread.sleep(2000);
		 String urll = driver.getCurrentUrl();
			System.out.println(urll);
		waitmethod();
		clickvendorloginlogout.click();
	}

	public void vendorloginlogout() throws Exception {
		 Thread.sleep(2000);
		waitmethod();
		vendorloginlogout.click();
	}

	public Buyer_organization_login_page confirmlogout() throws Exception {
		
     Thread.sleep(2000);
		waitmethod();
		confirmlogout.click();
		return new Buyer_organization_login_page(driver);
		
	}
	

	

}
