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
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.gmail_page;

public class gmail_pagetest extends Basetest {

	@Test(priority = 0)
	public void gmail_pagetest() throws Exception {

		gmail_page gmail_page = new gmail_page(driver);

		gmail_page.gmailaccount();
		gmail_page.gmailsignin();

		String Expected_page = "Sign in";
		String Actual_page = gmail_page.gmailsignin();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Actual page is:" + Actual_page);

		Test = Extent.createTest("Verify Testcase Gmail page ");
		Test.info("Gmail launched successfully");

		JSONParser jsonparser = new JSONParser();
		JSONArray array = (JSONArray) jsonparser
				.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int i = 0; i < array.size(); i++) {

			JSONObject object = (JSONObject) array.get(i);

			String gmailusername = (String) object.get("gmail_username");
			String gmailpassword = (String) object.get("gmail_password");

			gmail_page.emailaddress(gmailusername);
			gmail_page.next();
			gmail_page.password(gmailpassword);
			gmail_page.next2();

			String searchmessage = (String) object.get("Searchmail");
			gmail_page.Targetsearchmeaasgeclick(searchmessage);
			gmail_page.clicktargetmessage();

			Thread.sleep(3000);

			WebElement table = driver.findElement(By.xpath("(//table[@role='presentation'])[3]"));

			List<WebElement> rows = table.findElements(By.tagName("tr"));

			for (int j = 0; j < rows.size(); j++) {

				WebElement row = rows.get(j);

				List<WebElement> datas = row.findElements(By.tagName("td"));

				for (int k = 0; k < datas.size(); k++) {
					WebElement data = datas.get(k);

					if (data.getText().contains("https://qa.bidz.ai/#/vendor_signup/")) {
						System.out.println(data.getText());
						data.click();
					}

				}

			}

			// gmail_page.clickgmaillink();

			Set<String> windowHandles = driver.getWindowHandles();
			List<String> allTabsStored = new ArrayList<String>();
			allTabsStored.addAll(windowHandles);
			driver.switchTo().window(allTabsStored.get(1));

		}

	}
}
