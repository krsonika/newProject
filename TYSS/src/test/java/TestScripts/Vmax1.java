package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vmax1 {

	public static void main(String[] args) throws InterruptedException, Exception {
		String hubUrl = "http://localhost:4444/wd/hub";

		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options= new FirefoxOptions();

		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		driver.manage().window().maximize();

		driver.get("https://konu.co.in/dev.survey.proper-t.co/login ");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Username\"]")).sendKeys("konu-tester");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter password\"]")).sendKeys("k7qP63YSQj");

		driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]")).click();

		WebElement addProperty = driver
				.findElement(By.xpath("//a[@class=\"btn btn-secondary custom-toggle add-property mx-2\"]"));
		wait.until(ExpectedConditions.visibilityOf(addProperty));
		addProperty.click();

		driver.findElement(By.xpath("//input[@class=\"form-control req- ctfd-required is-number\"]"))
				.sendKeys("A12345719");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info pick__my-location\"]")).click();
		System.out.println("heyy");

		WebElement category = driver.findElement(By.xpath("//select[@name=\"category\" and @id=\"category\"]"));
		Select sele = new Select(category);
		sele.selectByIndex(1);

		WebElement commercialType = driver.findElement(By.xpath(
				"(//label[contains(text(),'Commercial Types')]/..//select[@name=\"commercial_type\" and @id=\"plot_land_types\"])[2]"));
		Select type = new Select(commercialType);
		type.selectByIndex(1);

		driver.findElement(By.xpath(
				"(//label[text()=\"Street Name/No/Road No \"]/following-sibling::input[@name=\"street_name\"])[16]"))
				.sendKeys("sdf");

		driver.findElement(By.xpath(
				"(//label[text()=\"Colony/Locality Name \"]/following-sibling::input[@name=\"locality_name\"])[16]"))
				.sendKeys("jhtgfd");

		driver.findElement(By.xpath(
				"(//div[@class=\"row  commercial-fields-child \"])[last()]/div/div/div/input[@name=\"no_of_floors\"]"))
				.sendKeys("1");
		WebElement save1 = driver
				.findElement(By.xpath("//div[@class='text-center mt-4']//button[contains(text(),'Save')]"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", save1);

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"(//div[@class=\"row  commercial-fields-child \"])[last()]/div/div/div/div/button[text()=\"Add Floors\"]"))
				.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[contains(text(),'Floor Name')]/..//input")).sendKeys("ikujh");

		WebElement unit = driver.findElement(By.xpath("//Label[contains(text(),'Unit Type')]/..//select "));
		Select selc = new Select(unit);
		selc.selectByVisibleText("vacant");

		save1.click();

		WebElement addPropertyy = driver.findElement(By.xpath("//span[contains(text(),'Add Property')]"));

		JavascriptExecutor jsee = (JavascriptExecutor) driver;
		jsee.executeScript("arguments[0].scrollIntoView(true);", addPropertyy);

		wait.until(ExpectedConditions.visibilityOf(addPropertyy));
		addPropertyy.click();

		driver.findElement(By.xpath("//input[@class=\"form-control req- ctfd-required is-number\"]"))
				.sendKeys("A12345719");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info pick__my-location\"]")).click();
		System.out.println("hiii");
		driver.findElement(By.xpath("//label[contains(text(),'Split')]/..//div//input")).click();

		WebElement splitproperty = driver
				.findElement(By.xpath("//label[contains(text(),'Split Property ')]/..//select"));
		Select sel = new Select(splitproperty);
		sel.selectByIndex(1);

		WebElement upload = driver.findElement(
				By.xpath("//label[contains(text(),'Upload Screenshot for Split Property')]/..//input[@type=\"file\"]"));
		upload.sendKeys("C:\\Users\\User\\Downloads\\Gate Community.png");

		WebElement category1 = driver.findElement(By.xpath("//select[@name=\"category\" and @id=\"category\"]"));
		Select selee = new Select(category1);
		selee.selectByIndex(1);

		WebElement commercialType1 = driver.findElement(By.xpath(
				"(//label[contains(text(),'Commercial Types')]/..//select[@name=\"commercial_type\" and @id=\"plot_land_types\"])[2]"));
		Select typee = new Select(commercialType1);
		typee.selectByIndex(1);

		driver.findElement(By.xpath(
				"(//label[text()=\"Street Name/No/Road No \"]/following-sibling::input[@name=\"street_name\"])[16]"))
				.sendKeys("sdf");

		driver.findElement(By.xpath(
				"(//label[text()=\"Colony/Locality Name \"]/following-sibling::input[@name=\"locality_name\"])[16]"))
				.sendKeys("jhtgfd");

		driver.findElement(By.xpath(
				"(//div[@class=\"row  commercial-fields-child \"])[last()]/div/div/div/input[@name=\"no_of_floors\"]"))
				.sendKeys("1");
		WebElement save2 = driver
				.findElement(By.xpath("//div[@class='text-center mt-4']//button[contains(text(),'Save')]"));

		JavascriptExecutor jseee = (JavascriptExecutor) driver;
		jseee.executeScript("arguments[0].scrollIntoView(true);", save2);

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"(//div[@class=\"row  commercial-fields-child \"])[last()]/div/div/div/div/button[text()=\"Add Floors\"]"))
				.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[contains(text(),'Floor Name')]/..//input")).sendKeys("ikujh");

		WebElement unit1 = driver.findElement(By.xpath("//Label[contains(text(),'Unit Type')]/..//select "));
		Select selcc = new Select(unit1);
		selcc.selectByVisibleText("vacant");

		JavascriptExecutor jsn = (JavascriptExecutor) driver;
		jsn.executeScript("arguments[0].scrollIntoView(true);", save2);

		save2.click();
		System.out.println("helllo");

	}

}
