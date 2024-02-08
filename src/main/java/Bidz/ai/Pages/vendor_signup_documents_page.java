package Bidz.ai.Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class vendor_signup_documents_page extends Basetest {

	public vendor_signup_documents_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[2]/div/div[4]/div/p")
	WebElement documentspage;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[1]/div/label/span")
	WebElement businessclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[2]/div/label/span")
	WebElement chequeclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[3]/div/label/span")
	WebElement taxclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[4]/div/label/span")
	WebElement msmeclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[5]/div/label/span")
	WebElement panclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[3]/div[6]/div/label/span")
	WebElement tdsclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[4]/input")
	WebElement declareboxclick;

	@FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[5]/div[2]/button/span")
	WebElement submitbutton;
	
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/button/span")
	WebElement okaybutton;
	
	
	
	public String documentspage() {
		waitmethod();
		return documentspage.getText();
	}
	
	public void businessclick() throws Exception {

		waitmethod();

		businessclick.click();

		Thread.sleep(5000);
		String file = "C:\\Users\\heman\\Downloads\\Business registration form pdf.pdf";
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void cancelledchequeleaf() throws Exception {

		Thread.sleep(3000);
		waitmethod();
		chequeclick.click();

		Thread.sleep(5000);
		String file1 = "C:\\Users\\heman\\Downloads\\Cancelled cheque.pdf";
		StringSelection selection = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void taxregistrationcertificate() throws Exception {

		Thread.sleep(3000);
		waitmethod();
		taxclick.click();

		Thread.sleep(5000);
		String file2 = "C:\\Users\\heman\\Downloads\\Tax Registration Certificate.pdf";
		StringSelection selection = new StringSelection(file2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void declareboxclick() {

		waitmethod();
		declareboxclick.click();
	}

	public void submitbutton() {

		waitmethod();
		submitbutton.click();
	}

	public vendor_Login_page okaybutton() {

		waitmethod();
		okaybutton.click();
		return new vendor_Login_page(driver);
	}

	
	
	
}
