package Bidz.ai.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class gmail_page extends Basetest {

	public gmail_page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

// GMAIL LOGIN CREDENTIALS	
	
	@FindBy(xpath = "//*[@id=\"headingText\"]/span")
	WebElement gmailsignin;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
	WebElement emailaddress;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
	WebElement next;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
	WebElement password;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")
	WebElement next2;

// GMAIL SEARCHBOX	
	@FindBy(css = "#gs_lc50 > input:nth-child(1)")
	WebElement targetsearchmessage;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[5]/div[1]/div/table/tbody/tr")
	WebElement clicktargetmessage;
 
	@FindBy(xpath = "/html/body/div[8]/div[3]/div/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/div[3]/div[5]/div[1]/div/table/tbody/tr/td[5]/div/div/div[2]/span")
	WebElement maillink;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[3]/div/button/span")
	WebElement Nextbutton;

//  CLICK GMAILLINK	 

	@FindBy(linkText = "https://qa.bidz.ai/#/vendor_signup/280cb1a3cd2f4f25a40cbc238cc91805")
	WebElement clickgmaillink;
	
	
	
	

	public String gmailsignin() throws Exception {
         Thread.sleep(2000);
		waitmethod();
		return gmailsignin.getText();
	}


	public void emailaddress(String Emailaddress) {

		waitmethod();
		emailaddress.sendKeys(Emailaddress);
	}

	public void next() {

		waitmethod();
		next.click();
	}

	public void password(String Password) {

		waitmethod();
		password.sendKeys(Password);
	}

	public void next2() {

		waitmethod();
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", next2);
	}

	public void Targetsearchmeaasgeclick(String searchmessage) throws Exception {
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.moveToElement(targetsearchmessage).click().perform();
		targetsearchmessage.sendKeys("Invitation email");
		targetsearchmessage.sendKeys(Keys.RETURN);
	}

	public void clicktargetmessage() throws Exception {
		Thread.sleep(2000);
		clicktargetmessage.click();
	}

	public void readinvitelink() throws Exception {
		waitmethod();
		

	}

	public vendor_signup_bussinessinfopage clickgmaillink() throws Exception {
		Thread.sleep(3000);
		waitmethod();		
		String text = clickgmaillink.getText();
		System.out.println(text);
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].scrollIntoView(true);", clickgmaillink);
		ex.executeScript("arguments[0].click();", clickgmaillink);
		return new vendor_signup_bussinessinfopage(driver);

//		
//		WebElement table = driver.findElement(By.xpath("(//table[@role='presentation'])[3]"));
//
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//
//		for (int i = 0; i < row.size(); i++) {
//			WebElement rows = row.get(i);
//
//			List<WebElement> data = rows.findElements(By.tagName("td"));
//
//			for (int j = 0; j < data.size(); j++) {
//
//				WebElement datas = data.get(j);
//
//				if (datas.getText().contains("https://qa.bidz.ai/#/vendor_signup/662eb7856ef54b8da1d33c08e6a504f1")) {
//					datas.click();
//				}
//
//			}
//
//		}

	}

}
