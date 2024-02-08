package Bidz.ai.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class Buyer_dashboard_page extends Basetest {
	

	
	public Buyer_dashboard_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[1]")
	WebElement dashboard;
	
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[2]/div/img")
	WebElement clicknotificationbell;
	 
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/div")
	WebElement selectnotification;

	@FindBy(css = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-1ab2xsx > div > div.NotificationBell_notificationHeader__T85qB > svg")
	WebElement closenotification;	

	public String dashboard() {
		waitmethod();
		return dashboard.getText();
	}

	public void clicknotificationbell() {
		waitmethod();
		clicknotificationbell.click();
	}
	
	public void selectnotification() {
		waitmethod();
		selectnotification.click();
	}
	
	public String textselectnotification() {
		waitmethod();
		return selectnotification.getText();
	}
	
	
	public void closenotification() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		closenotification.click();
//		JavascriptExecutor ex = (JavascriptExecutor) driver;		
//		ex.executeScript("arguments[0].click();", closenotification);
	}
	

}
