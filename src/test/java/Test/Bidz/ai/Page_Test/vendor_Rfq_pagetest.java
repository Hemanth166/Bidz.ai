package Test.Bidz.ai.Page_Test;

import java.io.FileReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_Rfq_page;

public class vendor_Rfq_pagetest extends Basetest {

	@org.testng.annotations.Test(priority = 0)
	public void Rfq_pagetest() throws Exception {
		vendor_Rfq_page Rfq_page = new vendor_Rfq_page(driver);
		Test = Extent.createTest(" Verify Testcase Vendor RFQ page");
		Rfq_page.clickrfq();

		// String paerntwindow = driver.getWindowHandle();

		String Expected_page = "RFQ";
		String Actual_page = Rfq_page.rfq();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println(Actual_page);

		Rfq_page.rfq();
		Rfq_page.viewrfq();
		Rfq_page.submitbid();
		Rfq_page.clickno();

		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Rfq_vendor.json");

		Object parse = jsonparser.parse(reader);

		JSONObject jsonObj = (JSONObject) parse;

		JSONObject obj = (JSONObject) jsonObj.get("1stTimeVendorBid");

		String quantity = (String) obj.get("quantity");
		String unitprice = (String) obj.get("unit_price");
		String description = (String) obj.get("description");

		Rfq_page.quantity(quantity);
		Rfq_page.unitprice(unitprice);
		Rfq_page.description(description);
		Rfq_page.clicksubmitbid();
		Rfq_page.clickokaybutton();

		Rfq_page.clickvendorloginlogout();
		Rfq_page.vendorloginlogout();
		Rfq_page.confirmlogout();

		Rfq_page.NewTab();
		Rfq_page.qabidz();

	}
}
