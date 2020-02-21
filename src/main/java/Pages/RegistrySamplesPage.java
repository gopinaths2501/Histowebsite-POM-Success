package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CommonPage.HistoWebsiteCommon;


public class RegistrySamplesPage extends HistoWebsiteCommon {
	 
    
	public RegistrySamplesPage RegistrySamplesPageDetails() throws InterruptedException
     
     {
  
    	 driver.findElementByXPath("//label[text()='Registry Samples']").click();
    	
    	 
    	 WebElement SpecimentType = driver.findElementById("HistoNewContentPlaceHolder_ddlSpecimenType_MultipleSamples");
    	 
    	 Select SpecimentTypeSamples = new Select(SpecimentType);
    	 
    	 SpecimentTypeSamples.selectByVisibleText("DNA");
    	 
  	
    	 WebElement Attachment = driver.findElementByName("ctl00$HistoNewContentPlaceHolder$fileImage");
    	
    	 Attachment.sendKeys("F:\\FMI.txt");
    	
 	   
 	    WebElement HLAGeneA = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_0_ddl0");
 	    
 	    Select HLAGeneResolA =new Select(HLAGeneA);
 	    
 	    HLAGeneResolA.selectByVisibleText("1X");
 	    
 	    
 	    WebElement HLAGeneB = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_1_ddl1");
 	    
 	    Select HLAGeneResolB =new Select(HLAGeneB);
 	    
 	    HLAGeneResolB.selectByVisibleText("1X");
 	    
 	    
 	    WebElement HLAGeneC = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_2_ddl2");
 	    
 	    Select HLAGeneResolC =new Select(HLAGeneC);
 	    
 	    HLAGeneResolC.selectByVisibleText("1X");
 	    
 	    
 	    WebElement HLAGeneDRB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_3_ddl3");
 	    
 	    Select HLAGeneResolDRB1 =new Select(HLAGeneDRB1);
 	    
 	    HLAGeneResolDRB1.selectByVisibleText("1X");
 	    
 	    
 	    WebElement HLAGeneDRB345 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_4_ddl4");
 	    
 	    Select HLAGeneResolDRB345 =new Select(HLAGeneDRB345);
 	    
 	    HLAGeneResolDRB345.selectByVisibleText("None");
 	    
 	    
 	    WebElement HLAGeneDQB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_5_ddl5");
 	    
 	    Select HLAGeneResolDQB1 =new Select(HLAGeneDQB1);
 	    
 	    HLAGeneResolDQB1.selectByVisibleText("1X");
 	    
 	    
 	    WebElement HLAGeneDPB1 = driver.findElementById("HistoNewContentPlaceHolder_ucLocusMaster_7_ddl7");
 	    
 	    Select HLAGeneResolDPB1 =new Select(HLAGeneDPB1);
 	    
 	    HLAGeneResolDPB1.selectByVisibleText("1X");
 	    
 	   WebElement ShippedOn = driver.findElement(By.id("HistoNewContentPlaceHolder_txtShippedOn"));
 	   ShippedOn.sendKeys("02/21/2020");
 	   ShippedOn.sendKeys(Keys.TAB);
 	   Thread.sleep(1000);
     
 	    driver.findElementById("HistoNewContentPlaceHolder_txtCarrier").sendKeys("Fedex");
 	    
 	    driver.findElementById("HistoNewContentPlaceHolder_txtTrackingNo").sendKeys("9047237353");
 	    
      
    	  return this;
   	  
     }

}
