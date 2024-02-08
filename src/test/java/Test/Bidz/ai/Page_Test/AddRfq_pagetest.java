 package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.AddRfq_page;

public class AddRfq_pagetest extends Basetest{
	
	

	@org.testng.annotations.Test(priority=0)
	public void add_rfq() throws Exception {
		AddRfq_page AddRfq_page = new AddRfq_page(driver);
		
		Test = Extent.createTest(" Verify Testcase AddRfq_page ");
		
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser.parse(
				new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			String username = (String) Jobj.get("Bidz_login_Username");
			String password = (String) Jobj.get("Bidz_login_Password");

			System.out.println("JSON FILE : " + file);

			AddRfq_page.Username(username);
			AddRfq_page.Password(password);			
			AddRfq_page.LoginClick();
			
//			Thread.sleep(2000);
//			bidz.successpopup();
//			String popupmsg = bidz.successpopup();
//			logger.info("Get text Bidz Login Success popupmsg : " +popupmsg);
//			System.out.println(" Get text Bidz Login Success popupmsg : " +popupmsg);
			
			Thread.sleep(2000);
			AddRfq_page.okaybtn();
			
		
		
		Thread.sleep(5000);
		JSONParser jsonparser1 = new JSONParser();
		JSONArray file1 = (JSONArray) jsonparser.parse(
				new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\AddVendor.json"));

		for (int j = 0; j < file.size(); j++) {
			JSONObject Jobj1 = (JSONObject) file.get(j);
			
			String itemcodes = (String) Jobj1.get("ITemCode");
			String Quantity = (String) Jobj1.get("Quantity");
			String optional = (String) Jobj1.get("Part_NumberOptional");
			String description = (String) Jobj1.get("Proposal_Description");
			String unit = (String) Jobj1.get("Unit");
			String requestnumber = (String) Jobj1.get("Request_Number");
			String fromdate = (String) Jobj1.get("From_Date");
			String Todate = (String) Jobj1.get("To_Date");
			String addressline = (String) Jobj1.get("Address_Line_1");
			String postalcode = (String) Jobj1.get("Postal_Zipcode");
			String mobilenumber = (String) Jobj1.get("Mobile_Number");
			String Timesinfield = (String) Jobj1.get("Times");
			String Minutes = (String) Jobj1.get("Minute");
			String countries = (String) Jobj1.get("Country");
			String state = (String) Jobj1.get("State");
			String city = (String) Jobj1.get("City");
		
		
			AddRfq_page.RFQbtnclick();
			AddRfq_page.NewRFQbtnclick();
			AddRfq_page.RFQgettext();
		
		AddRfq_page.Itemcode1(itemcodes);
		AddRfq_page.Quantity(Quantity);
		AddRfq_page.PartNumber(optional);
		AddRfq_page.Noradiobtn();
		AddRfq_page.Descriptionboxtext(description);
		AddRfq_page.enterunit(unit);
		AddRfq_page.Requestnumber(requestnumber);
		AddRfq_page.openradiobtnclick();
		AddRfq_page.FromDate(fromdate);
		AddRfq_page.click3btndate();
		AddRfq_page.ToDate(Todate);
		AddRfq_page.click4btndate();
		AddRfq_page.EndTime();

//			Vendor.Timeclick();

		AddRfq_page.HourtimeChange();
//			Vendor.MinutetimeChange();
		AddRfq_page.pmbtnclick();
		AddRfq_page.Selecttimeokbtnclick();
		Thread.sleep(2000);
		AddRfq_page.selectvendor();
		Thread.sleep(2000);
//			Vendor.Savebtnclick();
//			Vendor.Savebtnclick();
//			Vendor.Savebtnclick();
		AddRfq_page.shippingaddress();
		AddRfq_page.address1(addressline);
		Thread.sleep(2000);
		AddRfq_page.country(countries);
		Thread.sleep(2000);
		AddRfq_page.State(state);
		Thread.sleep(2000);
		AddRfq_page.City(city);
		Thread.sleep(2000);
		AddRfq_page.Zipcode(postalcode);
		Thread.sleep(2000);
		AddRfq_page.PhoneNumber(mobilenumber);
		Thread.sleep(2000);
		AddRfq_page.Savebtnclick();
		Thread.sleep(2000);
		AddRfq_page.RFQcreatedgettext();
		Thread.sleep(2000);
		AddRfq_page.RFQcreatedokbtn();
		Thread.sleep(2000);
		AddRfq_page.RFQMainpagegettext();
		Thread.sleep(2000);
		AddRfq_page.clickdashboardbtn();
		
		Thread.sleep(2000);
		String actual1 = driver1.getCurrentUrl();
		String expected1 = "https://qa.bidz.ai/#/Buyer_dashboard/Vendors";
		Assert.assertEquals(actual1, expected1);
		System.out.println(actual1);
		System.out.println(expected1);
		System.out.println("Successfully Entered To Buyer Dashboard vendors");

		Thread.sleep(3000);
		AddRfq_page.logout1();
		Thread.sleep(2000);
		AddRfq_page.logout1();
		Thread.sleep(3000);
		AddRfq_page.Areyousure();
		AddRfq_page.yesbtnclick1();
		System.out.println("Vendor logout Successfully");
		Thread.sleep(2000);

		String actual2 = driver1.getCurrentUrl();
		String expected2 = "https://qa.bidz.ai/#/login";
		Assert.assertEquals(actual2, expected2);
		System.out.println(actual2);
		System.out.println(expected2);
		
//		Thread.sleep(2000);
//		driver.close();

		
		
	}
  }
}			
}

