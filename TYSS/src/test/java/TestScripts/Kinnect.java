package TestScripts;

import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v121.emulation.model.SensorMetadata;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class Kinnect {
     
	private static final String RandomStringUtils = null;
	static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {
		
		
		String hubUrl = "http://localhost:4444/wd/hub";

		ChromeOptions options = new ChromeOptions();

		driver = new RemoteWebDriver(new URL(hubUrl), options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		driver.manage().window().maximize();
	
		
		driver.get("https://staging.kinnect.us/");
		System.out.println();
		
		
		driver.findElement(By.xpath("//INPUT[@placeholder='Email']")).sendKeys("lavanya+190@kinnect.us");
		driver.findElement(By.xpath("//INPUT[@placeholder='Password']")).sendKeys("Password123!");
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		
		wait.until(ExpectedConditions.invisibilityOf(submit));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement homeIcon = driver.findElement(By.xpath("//IMG[@alt='Home icon']"));
		
		wait.until(ExpectedConditions.visibilityOf(homeIcon));
		homeIcon.isDisplayed();
		
		if(driver.findElement(By.xpath("//span[contains(text(),' Welcome Back')]")).isDisplayed()) {
			WebElement cancle = driver.findElement(By.xpath("//SPAN[contains(@class,'material-icons relative')]"));
			click(cancle);
		    }
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement AddConnection = driver.findElement(By.xpath("//span[contains(text(),\" Add Connection\")]"));
		wait.until(ExpectedConditions.elementToBeClickable(AddConnection));
		click(AddConnection);
		
		
		WebElement InviteNewUser = driver.findElement(By.xpath("//span[normalize-space(.)='Invite New User']"));
		wait.until(ExpectedConditions.elementToBeClickable(InviteNewUser));
		click(InviteNewUser);
		//InviteNewUser.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[normalize-space(.)='Invite New User']")).isDisplayed();
		
		String email = "@testyantrateam851182.testinator.com";
		String randomString = generateRandomString(4);
		email=email+randomString;
	
		 
		driver.findElement(By.xpath("//INPUT[@placeholder='Name']")).sendKeys("prapthi");
		driver.findElement(By.xpath("//INPUT[@placeholder='Email']")).sendKeys(email);
		WebElement Type = driver.findElement(By.xpath("//INPUT[@formcontrolname='relationshipType']"));
		//Type.click();
		click(Type);
		
		Robot robot = new Robot();

	 	robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		
	    WebElement send = driver.findElement(By.xpath("//SPAN[normalize-space(.)='Send']"));
	    Thread.sleep(3000);
	    //send.click();
	    click(send);
	    
	     //driver.findElement(By.xpath("//DIV[@id='toast-container']/DIV[contains(.,'Invite Sent')]")).isDisplayed();
	     
	     ((JavascriptExecutor) driver).executeScript("window.open()");

	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));

        driver.get("https://www.mailinator.com/v4/private/inboxes.jsp?to=*");
	    driver.findElement(By.xpath("//a[@class='nav-item nav-login d-flex align-items-center justify-content-center']")).click();
	    driver.findElement(By.xpath("//input[@id='many_login_email']")).sendKeys("ssonikakrgowda@gmail.com");
	    driver.findElement(By.xpath("//input[@id='many_login_password']")).sendKeys("Password@123");
	    driver.findElement(By.xpath("//a[@class='btn btn-default submit']")).click();
	    //String randomString = generateRandomString(4);
	    
	
		
	}

	
	



//public static void waitTill(String xpath) {
//	int count=0;
//	int count1=5;
//	while(count<count1) {
//		
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
//			wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
//			System.out.println("Passed");
//			break;
//		}catch (Exception e) {
//			count++;
//			System.out.println("im executing dont worry"+ e);
//		}
//
//	}
//	System.out.println(count);
//	System.out.println(count1);
//
//	if(count1==count) {
//		System.out.println("failed");
//	}
//}
public  static void click(WebElement elementToclick){
	JavascriptExecutor jss = (JavascriptExecutor) driver;
	jss.executeScript("arguments[0].click();", elementToclick);
	
}
public static String generateRandomString(int length) {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    Random random = new Random();
    StringBuilder stringBuilder = new StringBuilder(length);

    for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(characters.length());
        stringBuilder.append(characters.charAt(randomIndex));
    }

    return stringBuilder.toString();
}
}


