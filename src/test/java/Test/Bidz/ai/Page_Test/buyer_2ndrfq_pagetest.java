package Test.Bidz.ai.Page_Test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.buyer_2ndrfq_page;

public class buyer_2ndrfq_pagetest extends Basetest{
	
	@org.testng.annotations.Test(priority=0)
	public void buyer_2nd_rfq_page() throws Exception {
		
		buyer_2ndrfq_page rfq_page = new buyer_2ndrfq_page(driver);
		
		Test = Extent.createTest(" Verify Testcase Buyer 2nd_rfq_process page");
		
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));
		System.out.println(array);
		

		for (int i = 0; i < array.size(); i++) {

			JSONObject object = (JSONObject) array.get(i);

			String buyermailaddress = (String) object.get("Buyer_organization_login");
			String buyerpassword = (String) object.get("Buyer_organization_password");

			rfq_page.emailaddress(buyermailaddress);
			rfq_page.password(buyerpassword);
			rfq_page.loginbutton();
			rfq_page.okaybutton();
		
			
			
			// RFQ PROCESS IN BUYER

			rfq_page.clickRfq();
			rfq_page.viewrfq();

			// buyer_Rfq_page.click_view_vendor_bid();
			
			rfq_page.click_select_bid();
			rfq_page.click_submit_yes();
			rfq_page.clickokatbutton();
			rfq_page.clickbuyerlogout();
			rfq_page.clicklogout();
			rfq_page.confirmlogout();
			
			
// VENDOR FINAL LOGIN			
			
			JSONArray array1 = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));
			System.out.println(array);
			for (int i1 = 0; i1 < array.size(); i1++) {

				JSONObject object1 = (JSONObject) array.get(i1);

				String emailaddress = (String) object.get("vendor_login");
				String password = (String) object.get("vendor_password");

				rfq_page.vendoremailaddress(emailaddress);
				rfq_page.vendorpassword(password);
				rfq_page.vendorloginbutton();
				rfq_page.vendorokaybutton();
				
				rfq_page.clicknotificationbell();
				rfq_page.selectnotification();
				rfq_page.closenotification();
				
				rfq_page.clickvendorloginlogout();
				rfq_page.vendorloginlogout();
				rfq_page.confirmvendorlogout();
				
				
		
			}
			
		driver.quit();		
		
		
	}		
		
		
	}

}
