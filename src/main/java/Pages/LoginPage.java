package Pages;

import CommonPage.HistoWebsiteCommon;

public class LoginPage extends HistoWebsiteCommon {
	
	public LoginPage RunLoginPage()
	{

		  driver.findElementById("txtUserName").sendKeys("HistoIndia");
		  
		  driver.findElementById("txtPassword").sendKeys("Histoindia123$");
		 
	      driver.findElementById("ImgSignIn").click();
			        	
	     return this;
	}

}
