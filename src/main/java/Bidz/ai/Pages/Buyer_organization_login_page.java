package Bidz.ai.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class Buyer_organization_login_page extends Basetest {

	public Buyer_organization_login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button/span")
	WebElement clickoldloginlogout;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div/div/input")
	WebElement emailaddress;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement password;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[4]/button")
	WebElement loginbutton;

	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement okaybutton;

	public void clickoldloginlogout() {

		waitmethod();
		clickoldloginlogout.click();
	}

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

	public vendor_dashboard_page okaybutton() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		okaybutton.click();
		return new vendor_dashboard_page(driver);

	}

}
