package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import CommonPage.HistoWebsiteCommon;
import Pages.LoginPage;
import Pages.PatientPage;

public class PatientTestCase extends HistoWebsiteCommon{
    
	
	@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
		
		 new LoginPage()
		 
		 .RunLoginPage();
		 
		 new PatientPage()
		 
		 .RunPatientDetails();
		 

	}

}
