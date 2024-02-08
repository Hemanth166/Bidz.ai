package Test.Bidz.ai.Page_Test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.AddVendor_page;

public class AddVendor_PageTest extends Basetest {

	@Test(priority=0)
	public void AddVendor_page() throws Exception {
		AddVendor_page Vendor = new AddVendor_page(driver1);
		
		
		Vendor.qabidz();

//		String actualtitle = driver1.getTitle();
//		String expectedtitle = "Bidz.ai";
//		Assert.assertEquals(actualtitle, expectedtitle);
//		System.out.println(actualtitle);
//		System.out.println(expectedtitle);

		Thread.sleep(5000);
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser.parse(
				new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\AddVendor.json"));

		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			String companyname = (String) Jobj.get("Company_Name");
			String personname = (String) Jobj.get("Person_Name");
			String Email = (String) Jobj.get("Email");
			

			System.out.println("JSON FILE : " + file);
			Vendor.Clickvendorbtn();
			Thread.sleep(2000);
			Vendor.AddVendorclick();
			Thread.sleep(2000);
			Vendor.AddvendorGettext();
			Thread.sleep(2000);
			Vendor.Companynamevendor(companyname);
			Thread.sleep(2000);
			Vendor.personname(personname);
			Thread.sleep(2000);
			Vendor.emailid(Email);
			Thread.sleep(2000);
			Vendor.Addbtnclick();
			Thread.sleep(2000);
			Vendor.successmsgvendor();
			Thread.sleep(2000);
			
			Vendor.okaybtnclick();
			Thread.sleep(2000);
			Vendor.clickbuyerlogout();
			Vendor.clicklogout();
			Thread.sleep(2000);
			Vendor.confirmlogout();

			
			
		}
	}
}
