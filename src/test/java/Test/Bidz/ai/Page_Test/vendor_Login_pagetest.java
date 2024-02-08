package Test.Bidz.ai.Page_Test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_Login_page;

public class vendor_Login_pagetest extends Basetest {

	@Test(priority = 0)
	public void Login_pagetest() throws Exception {

		vendor_Login_page login_page = new vendor_Login_page(driver);
		
		
	//	login_page.qabidz();
		Thread.sleep(2000);
		logger.info("Login page entered successfully");
		Test = Extent.createTest(" Verify Testcase Login page");
    //  driver.get("https://qa.bidz.ai/#/login");
		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser
				.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));
		System.out.println(array);
		for (int i = 0; i < array.size(); i++) {

			JSONObject object = (JSONObject) array.get(i);

			String emailaddress = (String) object.get("vendor_login");
			String password = (String) object.get("vendor_password");

			login_page.emailaddress(emailaddress);
			login_page.password(password);
			login_page.loginbutton();
			login_page.okaybutton();
	
		}
	}
}
