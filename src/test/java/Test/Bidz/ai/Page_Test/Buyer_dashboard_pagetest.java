package Test.Bidz.ai.Page_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.Buyer_dashboard_page;

public class Buyer_dashboard_pagetest extends Basetest {
	
	@Test(priority=0)
 public void 	Buyer_dashboard_pagetest() throws Exception {
		
		
		
		Buyer_dashboard_page Buyer_dashboard_page = new Buyer_dashboard_page(driver);
		Test = Extent.createTest(" Verify Testcase Buyer dashboard page");
		String Expected_page = "Dashboard";
		String Actual_page = Buyer_dashboard_page.dashboard();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Buyer dashboard page Entered :" +Actual_page);
		
		
		Buyer_dashboard_page.dashboard();
		Buyer_dashboard_page.clicknotificationbell();
		Buyer_dashboard_page.selectnotification();
		Thread.sleep(2000);
		Buyer_dashboard_page.textselectnotification();
		
		String gettext = Buyer_dashboard_page.textselectnotification();
		System.out.println(" Checking notification of Vendor added by Buyer :"+gettext);
		
		Buyer_dashboard_page.closenotification();
		
	 
 }
	
	
	
	
	

}
