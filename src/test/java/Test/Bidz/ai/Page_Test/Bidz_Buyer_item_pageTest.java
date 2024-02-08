package Test.Bidz.ai.Page_Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.Bidz_Buyer_item_page;

public class Bidz_Buyer_item_pageTest extends Basetest {

	@Test(priority=0)
	public void DashBoard_BuyerPage() throws Exception {

		Bidz_Buyer_item_page dashboard = new Bidz_Buyer_item_page(driver);
		Thread.sleep(2000);
		dashboard.Buyerclick();
		Thread.sleep(2000);
		dashboard.clickaddbuyer();

		Thread.sleep(2000);
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser.parse(new FileReader(
				"C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\AddBuyer&Item.json"));

		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			System.out.println("JSON FILE : " + file);

			String firstname = (String) Jobj.get("First_name");
			String lasttname = (String) Jobj.get("Last_Name");
			String email = (String) Jobj.get("Email");
			String phone = (String) Jobj.get("Phone");
			String department = (String) Jobj.get("Department");
			String role = (String) Jobj.get("Role");
			String password = (String) Jobj.get("Password");
			String confpasswrd = (String) Jobj.get("Confirm_Password");
			String uplast = (String) Jobj.get("Update_Last_Name");

			String itemname = (String) Jobj.get("Item_Name");
			String itemcode = (String) Jobj.get("Item_Code");
			String catageory = (String) Jobj.get("Category");
			String unspsccode = (String) Jobj.get("UNSPSC_Code");
			String HSNCODE = (String) Jobj.get("HSN_Code");

			Thread.sleep(2000);
			dashboard.FirstName(firstname);
			Thread.sleep(2000);
			dashboard.LastName(lasttname);
			Thread.sleep(2000);
			dashboard.Email(email);
			Thread.sleep(2000);
			dashboard.phoneno(phone);
			Thread.sleep(2000);
			dashboard.Department(department);
			Thread.sleep(2000);
			dashboard.Role(role);
			Thread.sleep(2000);
			dashboard.password(password);
			Thread.sleep(2000);
			dashboard.confirmpassword(confpasswrd);
			Thread.sleep(2000);
			dashboard.addbtnclick();
			Thread.sleep(2000);
			dashboard.addokclick();
			Thread.sleep(2000);
			System.out.println("Datas Entered in Add Buyer");

			Thread.sleep(2000);
			dashboard.itembtnclick();
			System.out.println("Item Button Clicked");
			dashboard.itemgettext();
			dashboard.Additembtnclick();
			Thread.sleep(2000);
			dashboard.Itemname(itemname);
			dashboard.Itemcode(itemcode);
			dashboard.catageroy(catageory);
			Thread.sleep(1000);
			dashboard.unspsccode(unspsccode);
			Thread.sleep(1000);
			dashboard.hsccode(HSNCODE);
			Thread.sleep(1000);
			dashboard.add1clickinitems();
			Thread.sleep(1000);
			dashboard.itemaddedokbtnclick();
			Thread.sleep(1000);
			// dashboard.itemaddedgettext();
			Thread.sleep(2000);
			System.out.println("Item Added");
			Thread.sleep(1000);
			dashboard.dashboard();
			dashboard.clickbuyerlogout();
			dashboard.clicklogout();
			dashboard.confirmlogout();
			driver.close();

//				Set<String> windowHandles = driver.getWindowHandles();
//				List<String> allTabsStored = new ArrayList<String>();
//				allTabsStored.addAll(windowHandles);
//				driver.switchTo().window(allTabsStored.get(0));

		}
	}

}
