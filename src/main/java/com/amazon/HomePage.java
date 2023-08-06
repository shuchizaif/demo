package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
	    Thread.sleep(3000);
	    List<WebElement> searchlist =driver.findElements(By.xpath("//div[@class='s-suggestion-container'] "));
	    Thread.sleep(3000);
	    for(WebElement searchitem:searchlist)
	    {
	    	
	    	System.out.println(searchitem.getText());
	    }
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	    
	    
	    
	    //Place mousehover on EN and select language radiobutton
	    
	    driver.findElement(By.xpath("//span[@class='nav-line-2']/div ")).click();
	    Thread.sleep(500);
	     driver.findElement(By.xpath("(//div[@class='a-row a-spacing-mini'])[2] ")).click();
	      System.out.println("Hindi language is selected");
	    

	}

}
