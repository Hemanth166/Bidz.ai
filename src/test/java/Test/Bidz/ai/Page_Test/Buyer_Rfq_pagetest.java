package Test.Bidz.ai.Page_Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.Buyer_Rfq_page;
import Bidz.ai.Pages.vendor_Rfq_page;

public class Buyer_Rfq_pagetest extends Basetest {

	@Test(priority = 0)
	public void Buyer_Rfq_pagetest() throws Exception {

		Buyer_Rfq_page buyer_Rfq_page = new Buyer_Rfq_page(driver);
		Test = Extent.createTest(" Verify Testcase Buyer RFQ page");

		// RFQ PROCESS IN BUYER

		buyer_Rfq_page.clickRfq();
		buyer_Rfq_page.viewrfq();

		// buyer_Rfq_page.click_view_vendor_bid();
		buyer_Rfq_page.click_requestrevisiedquote();
		buyer_Rfq_page.click_selectvendor();
		buyer_Rfq_page.click_submitquote();
		buyer_Rfq_page.clickokatbutton();

		buyer_Rfq_page.clickbuyerlogout();
		buyer_Rfq_page.clicklogout();
		buyer_Rfq_page.confirmlogout();

		// driver.close();

//  2ND TIME VENDOR LOGIN		  

		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int i = 0; i < array.size(); i++) {

			JSONObject object = (JSONObject) array.get(i);

			String vendorlogin = (String) object.get("vendor_login");
			String vendorpassword = (String) object.get("vendor_password");

			buyer_Rfq_page.emailaddress(vendorlogin);
			buyer_Rfq_page.password(vendorpassword);
			buyer_Rfq_page.loginbutton();
			buyer_Rfq_page.okaybutton();		

		}

		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Rfq_vendor.json");

		Object obj = parser.parse(reader);

		JSONObject jsonObj = (JSONObject) obj;

		JSONObject jsObj = (JSONObject) jsonObj.get("2ndTimeVendorBid");

		String quantity2 = (String) jsObj.get("quantity2");
		String unitPrice2 = (String) jsObj.get("unit_price2");
		String description2 = (String) jsObj.get("description2");

		System.out.println("2nd Time : " + quantity2);
		System.out.println("2nd Time : " + unitPrice2);
		System.out.println("2nd Time : " + description2);

//		buyer_Rfq_page.rfq();
		buyer_Rfq_page.clicknotificationbell();
		
		buyer_Rfq_page.selectnotification();
		
		String actual = buyer_Rfq_page.selectnotification();
		String expected = "Academic year created successfully";
		Assert.assertEquals(actual, expected);
		Test.info(actual);
		
		buyer_Rfq_page.closenotification();
		buyer_Rfq_page.clickrfq();
		buyer_Rfq_page.viewvendorrfq();
		buyer_Rfq_page.submitbid2();
		buyer_Rfq_page.clickno2();
		buyer_Rfq_page.quantity2(quantity2);
		buyer_Rfq_page.unitprice2(unitPrice2);
		buyer_Rfq_page.description2(description2);
		buyer_Rfq_page.clicksubmitbid2();
		buyer_Rfq_page.clickokaybutton2();
		
// VENDOR  LOGOUT
		
		buyer_Rfq_page.clickvendorloginlogout();
		buyer_Rfq_page.vendorloginlogout();
		buyer_Rfq_page.confirmvendorlogout();
		
		
	
		
		
		
			
		
		
		
		

	}
}
