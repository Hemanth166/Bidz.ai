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
import com.github.dockerjava.api.model.Info;

import Bidz.ai.Pages.Bidz_LoginPage;

public class Bidz_Login_PageTest extends Basetest {
	
	@Test(priority=0)
	public void BuyerLoginpage() throws FileNotFoundException, IOException, ParseException, Exception {
		Bidz_LoginPage bidz = new Bidz_LoginPage(driver);
		Thread.sleep(3000);
qabidz();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Bidz.ai";
		Assert.assertEquals(actualtitle, expectedtitle);
		logger.info("Successfully Entered To Bidz.ai Login Page : " +actualtitle);
		System.out.println("Successfully Entered To Bidz.ai Login Page : " +actualtitle);
		

		Thread.sleep(4000);
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser.parse(
				new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\Login.json"));

		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			String username = (String) Jobj.get("Bidz_login_Username");
			String password = (String) Jobj.get("Bidz_login_Password");

			System.out.println("JSON FILE : " + file);

			bidz.Username(username);
			bidz.Password(password);			
			bidz.LoginClick();
			
//			Thread.sleep(2000);
//			bidz.successpopup();
//			String popupmsg = bidz.successpopup();
//			logger.info("Get text Bidz Login Success popupmsg : " +popupmsg);
//			System.out.println(" Get text Bidz Login Success popupmsg : " +popupmsg);
			
			Thread.sleep(2000);
			bidz.okaybtn();
			
			
		}
	}

}
