package Bidz.ai.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

public class Bidz_LoginPage extends Basetest {

	Actions actions = new Actions(driver);

	public Bidz_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Enter Username
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/input")
	WebElement Username;
	
	// Enter Password
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div[1]/input")
	WebElement Password;
	
	// click login
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[4]/button")
	WebElement LoginClick;

	// get text success pop message
	@FindBy(css = "/html/body/div[2]/div[3]/div/div[2]/p")
	WebElement successpopup;

	// okay button
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement okaybtn;

	public void Username(String usrname) {
		waitmethod();
		Username.sendKeys(usrname);
	}

	public void Password(String passwd) {
		waitmethod();
		Password.sendKeys(passwd);
	}

	public void LoginClick() {
		waitmethod();
		LoginClick.click();
	}

	public String successpopup() {

		waitmethod();
		return successpopup.getText();
	}

	public void okaybtn() {
		waitmethod();
		okaybtn.click();
	}

}
