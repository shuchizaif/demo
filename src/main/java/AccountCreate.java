import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AccountCreate {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
}
//
//span[@class='sc-e568c3b8-1 bFgxSY' and text()='4.5'

	   //Search Item
	/*try {
			driver.findElement(By.id("searchBar")).sendKeys("electronic");
		
		Thread.sleep(1000);
		
		
			List<WebElement> searchlist = driver.findElements(By.xpath("//div[@class='sc-a554a9cf-5 jGBDWB']"));
		Thread.sleep(1000);
  for(WebElement singlelist : searchlist)
   
   {
  	 
  	  String textlist = singlelist.getText();
  	 System.out.println(textlist);
  	 Thread.sleep(1000);
  	driver.findElement(By.xpath("//input[@id='searchBar']/parent::div/child::button/child::img[@alt='Clear'] ")).click();
  
	  
}
		}
	catch(StaleElementReferenceException exc)
			 {
		        exc.printStackTrace();
	}


		
	}
	
	
}*/
		
		
		
	



	


