package com.inetbanking.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase002 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("sonikagowda08@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"userPassword\"]")).sendKeys("Sonika@123");
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		Thread.sleep(2000);
		
      List<WebElement> products = driver.findElements(By.xpath("//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']"));	
      
//      WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
//	}
//}
//      
		
		
		for(WebElement product:products) {
			System.out.println(product.getText());
			if(product.getText().equals("ADIDAS ORIGINAL")) {
				product.findElement(By.xpath("//button[contains(text(),'Add To Cart')]")).click();
		
				//product.click();
			}
			
		}
	}
}
 

	
