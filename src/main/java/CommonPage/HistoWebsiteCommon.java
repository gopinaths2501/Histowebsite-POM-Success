package CommonPage;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HistoWebsiteCommon {
	
	    public static ChromeDriver driver;
	
	       @BeforeMethod
	    
		   public void RunWebSite() throws InterruptedException, IOException {
			
	        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://clients.histogenetics.com/ClientService/Patient");
			
			//driver.get("https://www.histogenetics.com/");
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
		
			Thread.sleep(2000);
	         
		/*
		 * driver.findElementByXPath("//a [text()='Log in']").click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles();
		 * 
		 * windowHandles.size();
		 * 
		 * System.out.println(windowHandles);
		 * 
		 * List<String> ListOfWindows = new ArrayList<>();
		 * 
		 * ListOfWindows.addAll(windowHandles);
		 * 
		 * driver.switchTo().window(ListOfWindows.get(1));
		 * 
		 * Thread.sleep(1000);
		 */
	          
			
	    }
	       
	       @AfterMethod
	       
	       public void ClosePatinetPage()
	   	{
	   		driver.close();
	   	}

		  
	         
				  
		}
