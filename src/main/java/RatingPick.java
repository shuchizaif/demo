import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatingPick {

	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		
		List<WebElement> titlelist = driver.findElements(By.xpath("//div[@class='sc-ea72a08b-20 iNQKlf' and @data-qa='product-name'] "));
		for (WebElement titles : titlelist) {
            Thread.sleep(2000);
			String alltitle = titles.getText();
		
			System.out.println("List of all titles" + alltitle);
		
			
			/*List<WebElement> offerlist = driver
				.findElements(By.xpath("//span[@class='sc-e568c3b8-1 bFgxSY' and text()='4.5']"));
	
		for (WebElement offer : offerlist) {
            Thread.sleep(2000);
			String alloffer = offer.getAttribute("title");
			System.out.println(alloffer);}*/
		
		}
		
		
	}
	
}
			
			//driver.findElement
			//(By.xpath("//div[@class='swiper-button-next custom-navigation swiper-nav-home-productCarousel-componentArea-13-componentRow-productCarousel-0-1690621349508']")).click();
		
			//scenario is
			//Display name of all products having rating 4.5
			//steps done - 
			//open url, scroll page ,get list of products having rating 4.5, click the arrow to read another set of products having rating 4.5
			//
      
      
	
		
		
		

	


