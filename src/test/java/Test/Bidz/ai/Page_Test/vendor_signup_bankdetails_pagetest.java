package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_signup_bankdetails_page;

public class vendor_signup_bankdetails_pagetest extends Basetest {

	@Test(priority=0)
	public void bankdetailspagetest() throws Exception {
		
		vendor_signup_bankdetails_page bankdetails_page = new vendor_signup_bankdetails_page(driver);
		
		String Expected_page = "Bank Details";
		String Actual_page = bankdetails_page.bankdetailspage();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Actual page is:" +Actual_page);
		
		
         logger.info("Bankdetails page entered successfully");
         Test = Extent.createTest(" Verify Testcase Bankdetails page ");
         Test.info(Actual_page);
         System.out.println("Bankdetails page entered successfully");
		Thread.sleep(2000);
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Bankdetails.json"));
		System.out.println("List :" + array);
		for (int i = 0; i < array.size(); i++) {
			JSONObject object = (JSONObject) array.get(i);
// BANK DETAILS				
			String bankname1 = (String) object.get("Bankname");
			String accountholdername1 = (String) object.get("Account_holdername");
			String accountnumber1 = (String) object.get("Account_number");
			String accounttype1 = (String) object.get("account_type");
			String branchcode1 = (String) object.get("branch_code");
			String ifsccode1 = (String) object.get("ifsc_code");
			String branchaddress1 = (String) object.get("branch_address");
			
			bankdetails_page.bankname(bankname1);
			bankdetails_page.accountholdername(accountholdername1);
			bankdetails_page.accountnumber(accountnumber1);
			bankdetails_page.accounttype(accounttype1);
			bankdetails_page.branchcode(branchcode1);
			bankdetails_page.ifsccode(ifsccode1);
			bankdetails_page.branchaddress(branchaddress1);
			
			
// STATUTORY DETAILS			
			
			String taxiidtype = (String) object.get("tax_identification_number");
			String taxcode = (String) object.get("tax_code");
			String pannumber = (String) object.get("pan_number");
			String isonumber = (String) object.get("iso_number");
			String lutnumber = (String) object.get("lut_number");
			String lutdate = (String) object.get("lut_date");
			String msmeregnumber = (String) object.get("msme_registration_number");
			
			
			bankdetails_page.taxiidtype();
			bankdetails_page.selecttaxnumber();
			bankdetails_page.taxcode(taxcode);
			bankdetails_page.pannumber(pannumber);
			bankdetails_page.isonumber(isonumber);
			bankdetails_page.lutnumber(lutnumber);
		//	bankdetails_page.lutdate(lutdate);
			bankdetails_page.msmeregnumber(msmeregnumber);
			
			bankdetails_page.Nextbutton();
			
			
			
				
			

		}
	}
}
