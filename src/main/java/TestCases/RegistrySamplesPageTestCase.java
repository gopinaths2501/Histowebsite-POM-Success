package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import CommonPage.HistoWebsiteCommon;
import Pages.LoginPage;
import Pages.RegistrySamplesPage;

public class RegistrySamplesPageTestCase extends HistoWebsiteCommon{
    
	
	@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
	
		 
		new LoginPage()
		
		.RunLoginPage();
		
		 new RegistrySamplesPage()
		 
		 .RegistrySamplesPageDetails();
		

	}

}
