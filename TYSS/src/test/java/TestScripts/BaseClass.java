package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilis.ReadConfig;

public class BaseClass {
	ReadConfig read = new ReadConfig();
	String baseURL = read.getURL();
	String userName = "mngr548335";
	String password = "AhYjEge";
	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}
