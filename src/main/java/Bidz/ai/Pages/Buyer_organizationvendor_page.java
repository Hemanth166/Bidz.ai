package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class Buyer_organizationvendor_page extends Basetest {

	public Buyer_organizationvendor_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Enter Username for bidz.ai login page 2
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div/div/input")
		WebElement Username;
		// enter password for bidz.ai login2
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div/div[1]/input")
		WebElement password;
		// click the login click in bidz.ai login 2
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
		WebElement loginclick;
		// success popup click
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button")
		WebElement succesfullokbtnclick;
		// get text the success pop
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/span")
		WebElement successgettext;
		
		
		
		
		
		public void Username2(String usrname) throws Exception {


//			waitMethod();
			Username.click();
	
		
			JavascriptExecutor js = (JavascriptExecutor) driver2;
			//js.executeScript("arguments[0].value='" + usrname + "';", Username);
			js.executeScript("arguments[0].sendkeys='"+ usrname +"';", Username);
		}

		public void password2(String pswds2) throws Exception {
			
			
//			waitMethod();
			password.click();
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver2;
	//		js.executeScript("arguments[0].value='" + pswds2 + "';", password);
			js.executeScript("arguments[0].sendkeys='"+ pswds2 +"';", password);
		}

		public void login2click() throws Exception {
			waitMethod();
			JavascriptExecutor js = (JavascriptExecutor) driver2;
			js.executeScript("arguments[0].click();", loginclick);
		}

		public void successbtnclick() {
			waitMethod();
			succesfullokbtnclick.click();
		}

		public void successgettext() {
			waitMethod();
			successgettext.getText();
		}
	

}
