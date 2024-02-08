package Bidz.ai.Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class Bidz_Buyer_item_page extends Basetest {

	Actions actions = new Actions(driver);

	public Bidz_Buyer_item_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Click buyer
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/a[2]")
	private WebElement Buyerclick;
	// Add buyer
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[2]/div[2]/div/button")
	private WebElement clickaddbuyer;
	// firstname
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[1]/div/input")
	private WebElement FirstName;
	// Lastname
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div/input")
	private WebElement LastName;
	// Email
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[3]/div/input")
	private WebElement Email;
	// Phoneno
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[4]/div/div/input")
	private WebElement phoneno;
	// Department
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[5]/div/input")
	private WebElement Department;
	// Role
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[6]/div/input")
	private WebElement Role;
	// password
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[7]/div/input")
	private WebElement password;
	// confirmpassword
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[8]/div/input")
	private WebElement confirmpassword;
	// addbtnclick
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button")
	private WebElement addbtnclick;
	// add okie btn click
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button")
	private WebElement addokclick;
	// Item get text
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/div/span")
	private WebElement itemgettext;
	// item btn click
	@FindBy(xpath = "/html/body/div/div/div/div[1]/a[5]")
	private WebElement itembtnclick;
	// Add Item Click
	@FindBy(xpath = "/html/body/div/div/div/div[3]/div[2]/div[2]/div/button")
	private WebElement Additembtnclick;
	// Item name
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[1]/div/input")
	private WebElement Itemname;

	// hsn code

	// item code
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[2]/div/input")
	private WebElement Itemcode;
	// catageory
	//
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[3]/div/input")
	private WebElement catageroy;
	// unspc code
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[4]/div/div/div/input")
	private WebElement unspsccode;
	// hsc code
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div[5]/div/div/div/input")
	private WebElement hsccode;
	// addbtnclick
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button")
	private WebElement addbtnclick1;
	// item added get text
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/span")
	private WebElement itemaddedgettext;
	// itemadded ok btn click
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button")
	private WebElement itemaddedokbtnclick;
	// add1clickinitems
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[3]/div/button")
	private WebElement add1clickinitems;
	
	// LOGOUT BUYER
	
	    @FindBy(xpath = "/html/body/div/div/div/div[1]/a[1]/p")
	    WebElement dashboard;

		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[2]/div")
		WebElement clickbuyerlogout;

		@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]/p")
		WebElement clicklogout;

		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button/span")
		WebElement confirmlogout;	
	
	

	public void Buyerclick() {
		Buyerclick.click();
	}

	public void clickaddbuyer() {
		clickaddbuyer.click();
	}

	public void FirstName(String first) {
		FirstName.sendKeys(first);
	}

	public void LastName(String last) {
		LastName.sendKeys(last);
	}

	public void Email(String emailid) {
		Email.sendKeys(emailid);
	}

	public void phoneno(String no) {
		phoneno.sendKeys(no);
	}

	public void Department(String departments) {
		Department.sendKeys(departments);
	}

	public void Role(String roles) {
		Role.sendKeys(roles);
	}

	public void password(String pswds) {
		password.sendKeys(pswds);
	}

	public void confirmpassword(String pswds2) {
		confirmpassword.sendKeys(pswds2);
	}

	public void addbtnclick() {
		addbtnclick.click();
	}

	public void addokclick() {
		addokclick.click();
	}

	public void itemgettext() {
		itemgettext.getText();
	}

	public void itembtnclick() {
		itembtnclick.click();
	}

	public void Additembtnclick() {
		Additembtnclick.click();
	}

	public void Itemname(String item) {
		Itemname.sendKeys(item);
	}

	public void Itemcode(String code) {
		Itemcode.sendKeys(code);
	}

	public void catageroy(String catageory) {
		catageroy.sendKeys(catageory);
	}

	public void unspsccode(String UNSPSC) throws Exception {
		unspsccode.sendKeys(UNSPSC);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	public void hsccode(String HSCCODE) throws Exception {
		hsccode.sendKeys(HSCCODE);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	public void addbtnclick1() {
		addbtnclick1.click();
	}

	public void itemaddedgettext() {
		itemaddedgettext.getText();
	}

	public void itemaddedokbtnclick() {
		
		waitmethod();
		itemaddedokbtnclick.click();
	}

	public void add1clickinitems() {
		add1clickinitems.click();
	}

	// LOGOUT BUYER
	
	public void dashboard() {
		dashboard.click();
	}

	public void clickbuyerlogout() {
		waitmethod();
		clickbuyerlogout.click();
	}

	public void clicklogout() throws Exception {
		Thread.sleep(1000);
		waitmethod();
		clicklogout.click();
	}

	public void confirmlogout() throws Exception {
		Thread.sleep(2000);
		waitmethod();
		confirmlogout.click();
	}

}
