package Test.Bidz.ai.Page_Test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.OnBoardNow_Buyer_page;

public class OnBoardNow_Buyer_pagetest extends Basetest {

	public static String ParentWindow;

	@Test(priority = 0)
	public void OnBoardPage_Buyer() throws Exception {
		OnBoardNow_Buyer_page OnBoardPage = new OnBoardNow_Buyer_page(driver);

		OnBoardPage.page();
		OnBoardPage.OnBoardnow();
		OnBoardPage.ClickBuyer();
		OnBoardPage.ClickContinue();
		
		
		String ActualTitle = driver.getCurrentUrl();
		String ExpectedTitle = "https://qa.bidz.ai/#/buyer_organization_signup";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		logger.info("Bidz Signup page Entered Successfully : " + ActualTitle);
		System.out.println("Bidz Signup page Entered Successfully : " + ActualTitle);

		// click the direct login pager to login the datas

		Thread.sleep(2000);
		JSONParser jsonparser = new JSONParser();
		JSONArray file = (JSONArray) jsonparser
				.parse(new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\Eclipse\\Bidz.ai\\Json\\BuyerSignup.json"));



		for (int i = 0; i < file.size(); i++) {
			JSONObject Jobj = (JSONObject) file.get(i);

			String CompanyName1 = (String) Jobj.get("company_name");
			// String CompanyType = (String) Jobj.get("company_type");
			String CompanyRegister = (String) Jobj.get("company_registration_number");
			String FirstName = (String) Jobj.get("first_name");
			String LastName = (String) Jobj.get("last_name");
			String Designation = (String) Jobj.get("designation");
			String PhoneNo = (String) Jobj.get("phone_number");
			String EmailID = (String) Jobj.get("official_email");
			String EmailIDGoogle = (String) Jobj.get("Email_ID_Google");
			String Emailpass = (String) Jobj.get("Email_pass_Google");
			String searchBox = (String) Jobj.get("Search_Box");
			String enterpswd = (String) Jobj.get("password");
			String confirmpswd = (String) Jobj.get("confirm_password");

			Thread.sleep(2000);
			OnBoardPage.Companyname(CompanyName1);
			
			OnBoardPage.Companytypedropdown();
			OnBoardPage.companytypename();
			OnBoardPage.companyRegister(CompanyRegister);
			OnBoardPage.FirstName(FirstName);
			OnBoardPage.LastName(LastName);
			OnBoardPage.Designation(Designation);
			OnBoardPage.PhoneNo(PhoneNo);
			OnBoardPage.EmailId(EmailID);
			OnBoardPage.GetOTP();
			ParentWindow = driver.getWindowHandle();

			System.out.println("Opening Another Window");
//  opening new tab
			OnBoardPage.NewTab();
//	opening google account
			OnBoardPage.GoogleAccount();
			OnBoardPage.EmailIDGoogle(EmailIDGoogle);
			OnBoardPage.Next1Click();
			Thread.sleep(4000);
			OnBoardPage.Emailpassgoogle(Emailpass);
			OnBoardPage.Next2Click();
			Thread.sleep(2000);
			Thread.sleep(10000);
			OnBoardPage.searchbox();
			Thread.sleep(6000);
			OnBoardPage.clicktheonboardoldmail();
			String otp = OnBoardPage.OtpText();
			System.out.println(otp);

			Thread.sleep(6000);
			driver.close();

			System.out.println("Switching To Parent Window");
			driver.switchTo().window(ParentWindow);
			OnBoardPage.Otpboxenter(otp);
			System.out.println("OTP Placed In OTP Box");
			Thread.sleep(4000);
			OnBoardPage.nxtbtnclick1();
			Thread.sleep(2000);

			OnBoardPage.Enterpassword(enterpswd);
			Thread.sleep(2000);
			OnBoardPage.Enterconfirm(confirmpswd);
			Thread.sleep(2000);
			OnBoardPage.BySignup();
			Thread.sleep(2000);
			OnBoardPage.submitbtn1();
			Thread.sleep(2000);
			OnBoardPage.Successokbtn();

//			String BidzActual = driver.getCurrentUrl();
//			String BidzExpected = "https://qa.bidz.ai/#/buyer_organization_signup";
//			Assert.assertEquals(BidzActual, BidzExpected);
//			logger.info("Bidz Login page Entered Successfully : " + BidzActual);
//			System.out.println("Bidz.ai Login Page Opened");

		}
	}
}
