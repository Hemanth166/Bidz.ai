package Test.Bidz.ai.Page_Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.Buyer_organizationvendor_page;

public class Buyer_organizationvendor_pagetest extends Basetest {

	@org.testng.annotations.Test(priority = 0)
	public void Buyer() throws Exception {

		Buyer_organizationvendor_page Buyer_organizationvendor_page = new Buyer_organizationvendor_page(driver);

		launchbrowser3();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("Launched browser 3 : " +currentUrl);
		
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser
				.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int j = 0; j < file.size(); j++) {
			JSONObject Jobj1 = (JSONObject) file.get(j);

			String username = (String) Jobj1.get("Buyer_organization_login");
			System.out.println("Buyer_organization_username : " + username);
			String password = (String) Jobj1.get("Buyer_organization_password");
			System.out.println("Buyer_organization_password : " + password);

			Thread.sleep(2000);
			Buyer_organizationvendor_page.Username2(username);
			Thread.sleep(2000);
			Buyer_organizationvendor_page.password2(password);
			Thread.sleep(2000);
			Buyer_organizationvendor_page.login2click();
			Thread.sleep(2000);
			Buyer_organizationvendor_page.successgettext();
			Thread.sleep(2000);
			Buyer_organizationvendor_page.successbtnclick();

		}

	}

}
