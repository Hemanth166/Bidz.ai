package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_signup_bussinessinfopage;

public class vendor_signup_bussinesspagetest extends Basetest {

	@Test(priority = 0)
	public void vendorsignuppage() throws Exception {

		vendor_signup_bussinessinfopage vendorsignup_page = new vendor_signup_bussinessinfopage(driver);
		
		
		String Expected_page = "Business Info";
		String Actual_page = vendorsignup_page.bidzpage();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println(Actual_page);

     	logger.info("Business Info entered successfully");
		Test.info(Actual_page);
		System.out.println("Business Info entered successfully");
		
		Test = Extent.createTest(" Verify Testcase Vendor signup page");
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\vendorsignup.json"));
		System.out.println("List :" + array);
		for (int i = 0; i < array.size(); i++) {
			JSONObject object = (JSONObject) array.get(i);

  
			String companyname = (String) object.get("company_name");
			String companytype = (String) object.get("company_type");
			String companywebsite = (String) object.get("company_website");
			String companyregisternumber = (String) object.get("company_registration_number");
			
			vendorsignup_page.companyname(companyname);
			vendorsignup_page.companytype(companytype);
			vendorsignup_page.Pvtlmt();
			vendorsignup_page.companywebsite(companywebsite);
			vendorsignup_page.companyregisternumber(companyregisternumber);

// COMPANY ADDRESS
			
			 String companyaddress = (String) object.get("company_address");
			 String country =(String) object.get("country");
			 String state =(String) object.get("state");
			 String city =(String) object.get("city");

			String postalcode = (String) object.get("postal_code");
			String workingdays = (String) object.get("working_days");
			String workinghours = (String) object.get("working_hours");

			vendorsignup_page.companyaddress(companyaddress);
			vendorsignup_page.country();
			vendorsignup_page.state();
			vendorsignup_page.city();
			vendorsignup_page.postalcode(postalcode);
			vendorsignup_page.workingdays(workingdays);
			vendorsignup_page.workinghours(workinghours);

			String companyphonenumber = (String) object.get("company_phone_number");
			String companyfaxnumber = (String) object.get("company_fax_number");			
			String companyofficialemail = (String) object.get("company_official_email");			
			String passwordl = (String) object.get("password1");
			String confirmpasswordl = (String) object.get("confirm_password1");
			
			
		
			

			vendorsignup_page.phonenumber(companyphonenumber);
			
			
			vendorsignup_page.faxnumber(companyfaxnumber);
			vendorsignup_page.officialmailid(companyofficialemail);
			vendorsignup_page.clickgetotp();
			vendorsignup_page.password(passwordl);
			vendorsignup_page.confirmpassword(confirmpasswordl);
	    	
			
			
			
			
			//  GMAIL CREDENTIALS
//		     	vendorsignup_page.newtab();
//			    vendorsignup_page.gmailaccount();
			    
			    Set<String> windowHandles = driver.getWindowHandles();
				List<String> allTabsStored = new ArrayList<String>();
				allTabsStored.addAll(windowHandles);
				driver.switchTo().window(allTabsStored.get(0));
				
//				vendorsignup_page.clickgmaillogout();
//				vendorsignup_page.gmaillogout();
				
//			vendorsignup_page.clickaddacount();
				
//				
//				String username2 = (String) object.get("username2");
//				String password2 = (String) object.get("password2");
//				
//				vendorsignup_page.gmailid(username2);
//				vendorsignup_page.Next();
//				vendorsignup_page.password2(password2);
//				vendorsignup_page.Next1();

				
// GMAIL SEARCHBOX
				
				String searchmessage = (String) object.get("Searchmail");				
				vendorsignup_page.Targetsearchmeaasgeclick(searchmessage);	
				vendorsignup_page.clicktargetmessage();
				String otp = vendorsignup_page.readotpmail();
				System.out.println("OTP : " + otp);
				
			
				driver.switchTo().window(allTabsStored.get(1));
				
				vendorsignup_page.Enterotp(otp);
				vendorsignup_page.Nextbutton();
		

						
			
		}
	}

}
