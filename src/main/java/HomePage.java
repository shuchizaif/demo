import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {



	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Shuchi Zaifrani\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co  = new ChromeOptions();
		co.setBinary("C:\\Users\\Shuchi Zaifrani\\Downloads\\chrome-win64\\chrome-win64");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		}
}

		/*
		 * driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		 * driver.findElement(By.xpath("//h3[text()='Sign Up']")).click();
		 * driver.findElement(By.xpath("//input[@id='emailInput']")).sendKeys(
		 * "aryenzaifrani34@gmail.com");
		 * driver.findElement(By.xpath(" //input[@id='passwordInput']")).
		 * sendKeys("Aryen@1234 ");
		 * driver.findElement(By.xpath("//input[@id='firstNameInput']")).sendKeys(
		 * "Samrat");
		 * driver.findElement(By.xpath(" //input[@id='lastNameInput']")).sendKeys(
		 * "Coder");
		 * driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		 */

		// List<WebElement> allproducts =
		// driver.findElements(By.xpath("//div[@class='sc-cxabCf lFOrI']"));
		// totalCount = allproducts.size();
		// System.out.println("Number of Images in slider are " + totalCount);

		/*
		 * List<WebElement> allitems
		 * =driver.findElements(By.xpath("//div[@class='bannerContainer']//img"));
		 * 
		 * System.out.println("Inside Arrays loop"); for(WebElement singleitem :
		 * allitems) { //System.out.println(singleitem.getSize()); String text =
		 * singleitem.getAttribute("alt"); System.out.println(text);
		 * 
		 * }
		 */

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");

		List<WebElement> offerlist = driver
				.findElements(By.xpath("//span[@class='sc-e568c3b8-1 bFgxSY' and text()='4.5']"));
		Thread.sleep(1000);
		
      System.out.println("will print list of all 4.5 rating items");
		for (WebElement offer : offerlist) {

			String alloffer = offer.getText();
			System.out.println(alloffer);

		}

	}

}*/
