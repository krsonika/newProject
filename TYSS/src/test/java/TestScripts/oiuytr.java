package TestScripts;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class oiuytr {
	String hubUrl = "http://localhost:4444/wd/hub";
	//URL url=new URL(hubUrl);
	 ChromeOptions option=new ChromeOptions();
	
	 WebDriver driver = new RemoteWebDriver(new URL(hubUrl), option);
	 
}
