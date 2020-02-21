package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import CommonPage.HistoWebsiteCommon;
import Pages.LoginPage;

public class LoginTestCase extends HistoWebsiteCommon{
	
@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
	
		 
		 new LoginPage()
		 
		 .RunLoginPage();

}

}