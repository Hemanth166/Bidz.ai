package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class vendor_signup_contactdetails_page extends Basetest {

	public vendor_signup_contactdetails_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div/p")
	WebElement contactdetailspage;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]/input")
	WebElement firstname;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/input")
	WebElement lastname;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[3]/input")
	WebElement designation;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[4]/div/input")
	WebElement officialmobilenumber;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[5]/input")
	WebElement officialemailaddress;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div[1]/div[2]/input")
	WebElement sameasclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[1]/div[2]/input")
	WebElement sameasclick1;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/div[3]/div[2]/button/span")
	WebElement Nextbutton;

	
	
	public String contactdetailspage( ) {
	       
		waitmethod();
		return contactdetailspage.getText();

	}
	
	
	public void firstname(String Firstname) throws Exception {
		
		waitmethod();
		firstname.click();
		waitmethod();
		firstname.sendKeys(Firstname);
		scrollBy();

	}

	public void lastname(String Lastname) {
       
		waitmethod();
		lastname.sendKeys(Lastname);

	}

	public void designation(String Designation) {

		waitmethod();
		designation.sendKeys(Designation);

	}

	public void officialmobilenumber(String Officialmobilenumber) {

		waitmethod();
		officialmobilenumber.sendKeys(Officialmobilenumber);

	}

	public void officialemailaddress(String Officialemailaddress) {

		waitmethod();
		officialemailaddress.sendKeys(Officialemailaddress);
		 scrollBy();
	}

	public void sameasclick() throws Exception {
		 scrollBy();
		 Thread.sleep(3000);
		waitmethod();
		sameasclick.click();

	}

	public void sameasclick1() {

		waitmethod();
		sameasclick1.click();
		scrollBy();

	}	
	
	public vendor_signup_documents_page Nextbutton() throws Exception {
		waitmethod();
		Nextbutton.click();
		return new vendor_signup_documents_page(driver);
		
//		JavascriptExecutor ex = (JavascriptExecutor) driver;
//		ex.executeScript("arguments[0].scrollIntoView(true);", Nextbutton);
//		ex.executeScript("arguments[0].click();", Nextbutton);
	}

}
