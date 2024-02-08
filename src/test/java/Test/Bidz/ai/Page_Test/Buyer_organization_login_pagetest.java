package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.Buyer_organization_login_page;

public class Buyer_organization_login_pagetest extends Basetest {
	
	@org.testng.annotations.Test(priority=0)
	public void buyerlogin_pagetest() throws Exception{
		
		Buyer_organization_login_page buyerlogin_page = new Buyer_organization_login_page(driver);
		
	//	buyerlogin_page.clickoldloginlogout();
		Test = Extent.createTest(" Verify Testcase Buyer Login page");
		
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));
		System.out.println(array);
		

		for (int i = 0; i < array.size(); i++) {

			JSONObject object = (JSONObject) array.get(i);

			String buyermailaddress = (String) object.get("Buyer_organization_login");
			String buyerpassword = (String) object.get("Buyer_organization_password");

			buyerlogin_page.emailaddress(buyermailaddress);
			buyerlogin_page.password(buyerpassword);
			buyerlogin_page.loginbutton();
			buyerlogin_page.okaybutton();
		
		
		
		
	}
	
  }	

}
