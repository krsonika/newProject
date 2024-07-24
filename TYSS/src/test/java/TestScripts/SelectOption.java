package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {
 public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://demowebshop.tricentis.com/");
	WebElement books = driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[contains(text(),'Books')]"));
	WebElement Dropdown = driver.findElement(By.xpath("//span[text()='Sort by']/..//select"));
	books.click();
	/*
	 * Dropdown.click(); Select sel=new Select(Dropdown);
	 * sel.deselectByVisibleText("Position");
	 */

	
	
}
}
