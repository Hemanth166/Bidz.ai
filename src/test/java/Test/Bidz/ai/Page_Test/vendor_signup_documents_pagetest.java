package Test.Bidz.ai.Page_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseTest.Basetest;

import Bidz.ai.Pages.vendor_signup_documents_page;

public class vendor_signup_documents_pagetest extends Basetest {
	
	@Test(priority=0)
	public void Documents_pagetest() throws Exception {
		
		vendor_signup_documents_page documents_page = new vendor_signup_documents_page(driver);
		logger.info("Documents page entered successfully");
		Test = Extent.createTest(" Verify Testcase Documents page");
		System.out.println("Documents page entered successfully");
		
		
		String Expected_page = "Documents";
		String Actual_page = documents_page.documentspage();
		Assert.assertEquals(Actual_page, Expected_page);
		System.out.println("Actual page is:" +Actual_page);
		
		documents_page.businessclick();
		documents_page.cancelledchequeleaf();
		documents_page.taxregistrationcertificate();
		documents_page.declareboxclick();
		documents_page.submitbutton();
		
		documents_page.okaybutton();
		
		
	}

}
