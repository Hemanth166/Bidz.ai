package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_signup_contactdetails_page;

public class vendor_signup_contactdetails_pagetest extends Basetest {
	
	
	@Test(priority=0)
	public void Contactdetails_pagetest() throws Exception{
		
	
		vendor_signup_contactdetails_page contactdetails_page = new vendor_signup_contactdetails_page(driver);
		
		
		logger.info("Contacts page entered successfully");
		Test = Extent.createTest(" Verify Testcase Contactdetails page");
		System.out.println("Contacts page entered successfully");
		
		String Expected_page = "Contact Details";
		String Actual_page = contactdetails_page.contactdetailspage();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Actual page is:" +Actual_page);
		
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\contactdetails.json"));
		System.out.println(array);
		
		for (int i = 0; i < array.size(); i++) {
			
			JSONObject object = (JSONObject) array.get(i);
			
			String firstname = (String) object.get("first_name");
			String lastname = (String) object.get("last_name");
			String designation = (String) object.get("designation");
			String officialmobilenumber = (String) object.get("official_mobile_number");
			String officialemailaddress = (String) object.get("official_email_address");
		
			contactdetails_page.firstname(firstname);
			contactdetails_page.lastname(lastname);
			contactdetails_page.designation(designation);
			contactdetails_page.officialmobilenumber(officialmobilenumber);
			contactdetails_page.officialemailaddress(officialemailaddress);
			
			contactdetails_page.sameasclick();
			contactdetails_page.sameasclick1();
			contactdetails_page.Nextbutton();
			
			
//			String repfirstname = (String) object.get("rep_first_name");
//			String replastname = (String) object.get("rep_last_name");
//			String repdesignation = (String) object.get("rep_designation");
//			String repofficialmobilenumber = (String) object.get("rep_official_mobile_number");
//			String repofficialemailaddress = (String) object.get("rep_official_email_address");
//			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		}		
		
		
	}
	

}
