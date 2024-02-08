package Test.Bidz.ai.Page_Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.GoogleAccountPage;
import Bidz.ai.Pages.gmail_page;

public class GoogleAccount_PageTest extends Basetest {

	@Test(priority=0)
	public void GoogleAccount_Page() throws Exception {

		launchbrowser2();
		
		System.out.println("New Browser is Launched");
		
//		String Actual = driver.getCurrentUrl();
//		String Expected = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhesgi6u-WDosNTdnlwdnSeqBah5cRwr1Phr7MJ5mG1lvvUhx17iK0NV3yYS3YcT40M9RSXKnA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S956565027%3A1697006068448564&theme=glif";
//		Assert.assertEquals(Actual, Expected);
//		logger.info("Gmail Login page Entered Successfully : " +Actual);
//		System.out.println("Gmail Login Page Opened");
//		
		GoogleAccountPage google = new GoogleAccountPage(driver1);
		
		JSONParser jsonparser = new JSONParser();

		JSONArray file = (JSONArray) jsonparser.parse(
				new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			String id = (String) Jobj.get("EmailID");
			String pswd = (String) Jobj.get("Password");
			String searchboxenter = (String) Jobj.get("Searchboxenter");
//			String username = (String) Jobj.get("Buyer_organization_login");
//			String password = (String) Jobj.get("Buyer_organization_password");
			

			System.out.println("JSON FILE : " + file);

			google.EmailIDGoogle(id);
			System.out.println("Gmail Page is Launched for to Activate Buyer Organization Account and Set a New Password");
			Thread.sleep(2000);
			google.Next1Click();
			Thread.sleep(2000);
			google.Emailpassgoogle(pswd);
			Thread.sleep(2000);
			google.Next2Click();
			
			Thread.sleep(3000);
			google.searchbox();

			Thread.sleep(2000);
			google.clicktheonboardoldmail();
			

			Thread.sleep(4000);
			String name = google.usernamegettext();
			System.out.println("UserName : " + name);
			String pass = google.passwordgettext();
			System.out.println("Password : " + pass);
			Thread.sleep(4000);
			

//			google.NewTab();
//			Thread.sleep(3000);
//			google.qabidz();

//			Set<String> windowHandles = driver1.getWindowHandles();
//			List<String> allTabsStored = new ArrayList<String>();
//			allTabsStored.addAll(windowHandles);
//			driver1.switchTo().window(allTabsStored.get(1));
//			System.out.println("Switched To Another Window to enter the credentials of Buyer organization");

//             
//			launchbrowser3();
//			
//			JSONParser jsonparser1 = new JSONParser();
//
//			JSONArray file1 = (JSONArray) jsonparser1.parse(
//					new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));
//
//			for (int j = 0; j < file1.size(); j++) {
//				JSONObject Jobj1 = (JSONObject) file1.get(j);
//				
//				String username = (String) Jobj1.get("Buyer_organization_login");
//				System.out.println("Buyer_organization_username : "+username);
//				String password = (String) Jobj1.get("Buyer_organization_password");
//				System.out.println("Buyer_organization_password : "+password);
//				
//				
//			google.Username2(username);
//			google.password2(password);
//			Thread.sleep(2000);
//			google.login2click();
//			Thread.sleep(2000);
//			google.successgettext();
//			Thread.sleep(2000);
//			google.successbtnclick();
//
//		}
	}
  }
}
