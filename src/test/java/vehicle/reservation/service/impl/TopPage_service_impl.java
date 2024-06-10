package vehicle.reservation.service.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



import vehicle.reservation.lib.UIElementConstants;
import vehicle.reservation.lib.XpathConstants;
import vehicle.reservation.service.interfaces.TopPage_inter;

public class TopPage_service_impl implements TopPage_inter {
	
	
	public void guiVerification( WebDriver driver) throws InterruptedException {
		
		
		/*Title verification*/
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		
		if (title.equals("GarageReservation")) {
			System.out.println("Correct title");
		
		}
		else 
			System.err.println("incorrect title");
		
		
	/* Logo verification*/
	WebDriverWait wait = new WebDriverWait(driver, 20);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.TopPage.Logo)));
	boolean logoPresent = driver.findElement(By.xpath(XpathConstants.TopPage.Logo)).isDisplayed();
	System.out.println(logoPresent);
	String expectedColor="#4a7ce2";
	String logocolor=driver.findElement(By.xpath(XpathConstants.TopPage.Logo)).getCssValue("color");
	System.out.println(logocolor);
	String hexcolor=Color.fromString(logocolor).asHex();
	System.out.println(hexcolor);
	Assert.assertEquals(hexcolor, expectedColor);
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.Logo)).getAttribute("alt"), UIElementConstants.TopPage.logoText);
	
	/*Banner text verification*/
	boolean BannerPresent = driver.findElement(By.xpath(XpathConstants.TopPage.Logo)).isDisplayed();
	System.out.println(BannerPresent);
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.BannerText)).getText(), UIElementConstants.TopPage.BannerText1+"\n"+UIElementConstants.TopPage.BannerText2);
	
	
	/*Location search box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.Location)).getAttribute("placeholder"),UIElementConstants.TopPage.LocationPlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.Location)).click();
	driver.findElement(By.xpath(XpathConstants.TopPage.Location)).sendKeys("n");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String locate= driver.findElement(By.xpath(XpathConstants.TopPage.FirstLocationItem)).getText();
	System.out.println(locate);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	Thread.sleep(1000);
	Actions builder = new Actions(driver);
	Action click = builder.click(driver.findElement(By.xpath(XpathConstants.TopPage.FirstLocationItem))).build();
	click.perform();
	
	/*Select Service box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.SelectService)).getAttribute("placeholder"),UIElementConstants.TopPage.ServicePlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectService)).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	Actions builder1 = new Actions(driver);
	Action click1 = builder1.click(driver.findElement(By.xpath(XpathConstants.TopPage.SelectedService))).build();
	click1.perform();
	
	/*Select Brand box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.SelectBrand)).getAttribute("placeholder"),UIElementConstants.TopPage.BrandPlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectBrand)).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectedBrand)).click();
	
	/*Select Model box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.SelectModel)).getAttribute("placeholder"),UIElementConstants.TopPage.ModelPlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectModel)).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectedModel)).click();
	
	/*Model year box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.ModelYear)).getAttribute("placeholder"),UIElementConstants.TopPage.ModelYearPlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.ModelYear)).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectedModelYear)).click();
	
	
	/*Select Engine Type box verification*/
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.EngineType)).getAttribute("placeholder"),UIElementConstants.TopPage.EngineTypePlaceholderText);
	driver.findElement(By.xpath(XpathConstants.TopPage.EngineType)).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.xpath(XpathConstants.TopPage.SelectedEngineType)).click();
	Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.TopPage.SearchButton)).getText(),UIElementConstants.TopPage.SearchText);
	driver.findElement(By.xpath(XpathConstants.TopPage.SearchButton)).click();
	
	
	
}
	
	public void SelectModelConditionChecking(WebDriver driver) throws InterruptedException {
		/*Select model not enable verification*/
		if(driver.findElement(By.xpath(XpathConstants.TopPage.SelectModel)).isEnabled()) {
			System.err.println("Select Model Element is Enable");
		}
		else {
			System.out.println("Select Mode Element is Disabled");
		}
		
		/*model year not enable verification*/
		if(driver.findElement(By.xpath(XpathConstants.TopPage.ModelYear)).isEnabled()) {
			System.err.println("Model year Element is Enable");
		}
		else {
			System.out.println("Mode year Element is Disabled");
		}
		
		/*Engine type not enable verification*/
		if(driver.findElement(By.xpath(XpathConstants.TopPage.EngineType)).isEnabled()) {
			System.err.println("EngineType Element is Enable");
		}
		else {
			System.out.println("EngineType Element is Disabled");
			
			
			}
		
		/*Select Model,active verification*/
		driver.findElement(By.xpath(XpathConstants.TopPage.SelectBrand)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.TopPage.SelectedBrand)).click();
		
		if(driver.findElement(By.xpath(XpathConstants.TopPage.SelectModel)).isEnabled()) 
		{
			System.out.println("Select Model Element is Enable");
			driver.findElement(By.xpath(XpathConstants.TopPage.SelectModel)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(XpathConstants.TopPage.SelectedModel)).click();
		}
		else {
			System.err.println("Select Model Element is Disabled");
		    }
		
		if(driver.findElement(By.xpath(XpathConstants.TopPage.ModelYear)).isEnabled()) {
			System.out.println("Model year Element is Enable");
			driver.findElement(By.xpath(XpathConstants.TopPage.ModelYear)).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath(XpathConstants.TopPage.SelectedModelYear)).click();
			
			}
		else {
			System.err.println("Mode year Element is Disabled");
		}
		
		
		if(driver.findElement(By.xpath(XpathConstants.TopPage.EngineType)).isEnabled()) {
			System.out.println("EngineType Element is Enable");
			
			driver.findElement(By.xpath(XpathConstants.TopPage.EngineType)).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath(XpathConstants.TopPage.SelectedEngineType)).click();
			
		}
		else {
			System.err.println("EngineType Element is Disabled");
			
		}
		
	}}
	
	
	
	

