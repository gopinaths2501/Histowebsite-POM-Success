package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import CommonPage.HistoWebsiteCommon;
import Pages.DonorPage;
import Pages.LoginPage;

public class DonorTestCase extends HistoWebsiteCommon{
    
	
	@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
	
		 
		new LoginPage()
		
		.RunLoginPage();
		
		 new DonorPage()
		 
		 .DonorPageDetails();
		

	}

}
