package Test.Bidz.ai.Page_Test;

import org.testng.Assert;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_dashboard_page;

public class vendor_dashboard_pagetest extends Basetest {

	@org.testng.annotations.Test(priority=0)
	public void vendor_dashboard_pagetest() throws Exception {
		
		vendor_dashboard_page dashboard1_page = new vendor_dashboard_page(driver);
		
		Test = Extent.createTest(" Verify Testcase Vendor dashboard page");
		String Expected_page = "Dashboard";
		String Actual_page = dashboard1_page.dashboard();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Vendor dashboard page Entered :" +Actual_page);
		
		
		dashboard1_page.dashboard();	
		dashboard1_page.clicknotificationbell();
		dashboard1_page.selectnotification();
		
		dashboard1_page.closenotification();
		

	}

}
