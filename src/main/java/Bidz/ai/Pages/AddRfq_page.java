package Bidz.ai.Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.Basetest;

public class AddRfq_page extends Basetest {
	Actions actions = new Actions(driver1);
	
	public AddRfq_page(WebDriver driver) {
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
		
	// RFQ Click btn
		@FindBy(xpath = "/html/body/div/div/div/div[1]/a[3]")
		WebElement RFQbtnclick;

		// RFQ get text
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[1]/div/span")
		WebElement RFQgettext;

		// New RFQ btn click
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[2]/div[2]/div/button")
		WebElement NewRFQbtnclick;

		// New RFQ get text
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/span")
		WebElement Newrfqgettext;

		// Item code enter previous code enter in this
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[2]/div[1]/div/div/div/input")
		WebElement Itemcode1;

		// Quamtity
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[2]/div[5]/div/input")
		WebElement Quantity;

		// PartNumber (Optional)
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[2]/div[6]/div/input")
		WebElement PartNumber;

		// No radio btn click
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[3]/div[1]/div[1]/div[2]")
		WebElement Noradiobtn;

		// Descriptionbox enter text
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[3]/div[1]/div[2]/div/textarea")
		WebElement Descriptionboxtext;

		// unit enter
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[3]/div[2]/div[1]/div/div/div/input")
		WebElement enterunit;

		// Request number
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[3]/div[2]/div[2]/div/input")
		WebElement Requestnumber;

		// open radio btn click
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[1]/div/div[1]/label")
		WebElement openradiobtnclick;

		// From Calendar Icon
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[2]/div[1]/div/div/div/div/button")
		WebElement fromCalendarIcon;

		// TO Calendar Icon
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[2]/div[2]/div/div/div/div/button")
		WebElement toCalendarIcon;

		// From date
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[2]/div[1]/div/div/div/input")
		WebElement FromDate1;

		// To date
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[2]/div[2]/div/div/div/input")
		WebElement ToDate1;

		// End Time
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[2]/div[3]/div/div/div/input")
		WebElement EndTime;

		// Hour time change
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/div[4]/span[4]")
		WebElement Hourtimechange;

		// Minute time change
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/div[4]/span[6]")
		WebElement Minutetimechange;

		// AM or PM btn click
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[1]/div/div[2]/button[2]/span")
		WebElement PMbtnclick;

		// Selecttimeokbtnclick
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/div[3]/button[2]")
		WebElement Selecttimeokbtnclick;

		// get text the end time under
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[3]/p")
		WebElement gettexttheendtimedate;

		// select vendor
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[4]/div/div")
		WebElement selectvendor;

		// savebtnclick
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[6]/div/button")
		WebElement Savebtnclick;

		// shippingaddress
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[4]/div[2]/div/span")
		WebElement shippingaddress;

		// address 1
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[1]/div/input")
		WebElement address1;

		// country
		/// html/body/div/div/div/div[3]/div[3]/div[5]/div[3]/div/div/input india xpath
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[3]/div/div/div/div[1]/div[2]/input")
		WebElement country;

		// state click
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[4]/div/div/div/div[1]/div[2]/input")
		WebElement State;

		// City
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[5]/div/div/div/div[1]/div[2]/input")
		WebElement City;

		// zipcode
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[6]/div/input")
		WebElement Zipcode;

		// Number
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[7]/div/div/input")
		WebElement PhoneNumber;

		// rfq created ok btn click
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div/button")
		WebElement RFQcreatedokbtn;

		// RFQ created get text
		@FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/span")
		WebElement RFQcreatedgettext;

		// When RFQ created and then in box there is a save
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[1]/div/table/tbody/tr/td[1]/span")
		WebElement RFQMainpagegettext;

		// Click the dashboard btn
		@FindBy(xpath = "/html/body/div/div/div/div[1]/a[1]")
		WebElement clickdashboardbtn;

		// action class to click date 3 btn click
		@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[3]")
		WebElement Click3btndate;

		// action class to click to date 4 btn click
		@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[4]")
		WebElement Click4todatebtn;

		// dropdowm down arrow click button
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[3]/div[5]/div[4]/div/svg/path")
		WebElement Downarrowclickbtn;
		
		// Logoutbtn1click
		@FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/span")
		WebElement logout1;

		// Logoutbtnclick2
		@FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/span[3]")
		WebElement logout2;

		// Are You Sure Want to Logout
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/span")
		WebElement Areyousure;

		// yesbtnclick1 vendor
		@FindBy(xpath = "/html/body/div[3]/div[3]/div/div[2]/div/div/button")
		WebElement yesbtnclick1;
		
		
		
		public void RFQbtnclick() {
			RFQbtnclick.click();
		}

		public void RFQgettext() {
			RFQgettext.getText();
		}

		public void NewRFQbtnclick() {
			NewRFQbtnclick.click();
		}

		public void Newrfqgettext() {
			Newrfqgettext.getText();
		}

		public void Itemcode1(String itemcode) throws Exception {
			Itemcode1.sendKeys(itemcode);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

		}

		public void Quantity(String quantity) {
			Quantity.sendKeys(quantity);
		}

		public void PartNumber(String part) {
			PartNumber.sendKeys(part);
		}

		public void Noradiobtn() {
			Noradiobtn.click();
		}

		public void Descriptionboxtext(String text) {
			Descriptionboxtext.sendKeys(text);
		}

		public void enterunit(String unit) throws Exception {
			enterunit.sendKeys(unit);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

		}

		public void Requestnumber(String Reqnumber) throws Exception {
			Thread.sleep(2000);
			Requestnumber.sendKeys(Reqnumber);
		}

		public void openradiobtnclick() throws Exception {
//				Thread.sleep(5000);
//				JavascriptExecutor js = (JavascriptExecutor) driver1;
//				js.executeScript("arguments[0].scrollIntoView(true);", openradiobtnclick);
			openradiobtnclick.click();
			Thread.sleep(2000);

		}

		public void FromDate(String from) throws Exception {

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver1;
			Thread.sleep(5000);
			js.executeScript("arguments[0].scrollIntoView(true);", FromDate1);
			Thread.sleep(2000);

			fromCalendarIcon.click();
			Thread.sleep(1000);

		}

		public void click3btndate() {
//				Click3btndate.click(); from date
			actions.moveToElement(Click3btndate).click().perform();
		}

		public void click4btndate() throws Exception {
//				Click4todatebtn.click(); from date
			Thread.sleep(2000);
			actions.moveToElement(Click4todatebtn).click().perform();
		}

		public void ToDate(String to) throws Exception {
//				wait.until(ExpectedConditions.elementToBeClickable(ToDate1));

			Thread.sleep(2000);
			toCalendarIcon.click();

		}

		public void EndTime() {
			EndTime.click();
		}

		public void HourtimeChange() throws Exception {
//				Hourtimechange.sendKeys(time);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyPress(KeyEvent.VK_UP);
//				Thread.sleep(2000);
//				JavascriptExecutor js = (JavascriptExecutor) driver1;
//				js.executeScript("arguments[0].click();", Hourtimechange);		
//				String updateTime = "";
//				DateFormat timeFormat = new SimpleDateFormat("HH:mm");
//				Calendar cal = Calendar.getInstance();
			//
//				cal.add(Calendar.HOUR, 2);
			//
//				updateTime = timeFormat.format(cal.getTime());
			//
//				Thread.sleep(2000);
//				Hourtimechange.sendKeys(updateTime);

			// actions.moveToElement(Hourtimechange).click().perform();
		}

		public void MinutetimeChange() throws Exception {
//				Minutetimechange.sendKeys(minute);

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver1;
			js.executeScript("arguments[0].click();", Minutetimechange);

			// actions.moveToElement(Minutetimechange).click().perform();
		}

		public void selectvendor() throws Exception {
			selectvendor.click();
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			actions.moveToElement(selectvendor).click().perform();

		}

		public void Selecttimeokbtnclick() {
			Selecttimeokbtnclick.click();
		}

		public void Savebtnclick() {
			Savebtnclick.click();
		}

		public void shippingaddress() {
			shippingaddress.click();
		}

		public void address1(String address) {
			address1.sendKeys(address);
		}

		public void country(String countrys) throws Exception {
			Thread.sleep(3000);
			country.click();
			Thread.sleep(3000);
			country.sendKeys(countrys);
			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

		public void State(String state) throws Exception {
			State.sendKeys(state);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

		public void City(String city) throws Exception {
			City.sendKeys(city);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

		public void Zipcode(String zipcode) {
			Zipcode.sendKeys(zipcode);
		}

		public void PhoneNumber(String Phone) {
			PhoneNumber.sendKeys(Phone);
		}

		public void gettexttheendtimedate() {
			gettexttheendtimedate.getText();
		}

		public void RFQcreatedokbtn() {
			RFQcreatedokbtn.click();
		}

		public void RFQcreatedgettext() {
			RFQcreatedgettext.getText();
		}

		public void RFQMainpagegettext() {
			RFQMainpagegettext.getText();
		}

		public void clickdashboardbtn() {
			clickdashboardbtn.click();
		}
		public void pmbtnclick() {
			PMbtnclick.click();
		}
		public void logout1() {
			logout1.click();
		}

		public void logout2() {
			logout2.click();
		}

		public void Areyousure() {
			Areyousure.getText();
		}

		public void yesbtnclick1() {
			yesbtnclick1.click();
		}
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
