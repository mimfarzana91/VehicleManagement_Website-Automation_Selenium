package vehicle.reservation.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseconfiguration {
	
	
	public void initEnvironment(){
		String DriverLocation =  "D:\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",DriverLocation );	
		
	}
	public WebDriver loadDriver(String url)
	{
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
