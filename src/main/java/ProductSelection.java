import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSelection {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    //place mouseover on WOMEN header link
	    driver.findElement(By.xpath("//span[@class='jsx-undefined' and text()='Women']"));
	    //how to move control from WOMEN header to Tops Menu link
	
	
	
	
	
	}
	
}
