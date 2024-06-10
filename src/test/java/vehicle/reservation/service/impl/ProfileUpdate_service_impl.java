package vehicle.reservation.service.impl;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import vehicle.reservation.lib.UIElementConstants;
import vehicle.reservation.lib.XpathConstants;
import vehicle.reservation.service.interfaces.ProfileUpdate_inter;

public class ProfileUpdate_service_impl implements ProfileUpdate_inter {
	

	
	public void profilenformationUpdate(WebDriver driver) throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.MyProfileTitle)).getText(), UIElementConstants.MyProfile.MyProfileTitle);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.FullNamelevel)).getText(),UIElementConstants.MyProfile.FullNamelevel);
		
		Lorem lorem = LoremIpsum.getInstance();
		String name=lorem.getName();
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).sendKeys(name);
		
		
		
		
		 
		 
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.EmailLevel)).getText(),UIElementConstants.MyProfile.EmailLevel);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String email = (String) jse.executeScript("return arguments[0].value;", driver.findElement(By.xpath(XpathConstants.MyProfile.Email)));
		String emailAdres=driver.findElement(By.xpath(XpathConstants.Login.profileName)).getText();
		 Assert.assertEquals(email, emailAdres);
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.PNumberLevel)).getText(),UIElementConstants.MyProfile.PNumberLevel);
		
		driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).sendKeys("0145254124");
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.HomeAddressLevel)).getText(),UIElementConstants.MyProfile.HomeAddressLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.CountryLevel)).getText(),UIElementConstants.MyProfile.CountryLevel);
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.locationLevel)).getText(),UIElementConstants.MyProfile.locationLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.Address1Level)).getText(),UIElementConstants.MyProfile.Address1Level);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.Address2Level)).getText(),UIElementConstants.MyProfile.Address2Level);
		
		if(driver.findElement(By.xpath(XpathConstants.MyProfile.SelectLocation)).isEnabled()) {
			System.err.println("location Element is Enable");
		}
		else {
			System.out.println("location Element is Disabled");
			}
		
		
		if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).isEnabled()) {
			System.err.println("Address Text box 1 Element is Enable");
		}
		else {
			System.out.println("Address Text box 1  Element is Disabled");
			}
		
	
		if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address2TextBox)).isEnabled()) {
			System.err.println("Address Text box 2 Element is Enable");
		}
		else {
			System.out.println("Address Text box 2 Element is Disabled");
			}
		Select drpCountry= new Select (driver.findElement(By.xpath(XpathConstants.MyProfile.Selectcounty)));
		 List<WebElement> elementCount = drpCountry.getOptions();
		 int listNUmber=elementCount.size()-1;
		 System.out.println(listNUmber);
		 
		 Random rand = new Random(); 
		    int  indexNumber=rand.nextInt(listNUmber)+1;
		    System.out.println(indexNumber);
		    
		    drpCountry.selectByIndex(indexNumber);
	   
	    
	    if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).isEnabled()) {
	    	System.err.println("Address Text box 1 Element is Enable");
		}
		else {
			System.out.println("Address Text box 1  Element is Disabled");
			}
		
		
		if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address2TextBox)).isEnabled()) {
			System.err.println("Address Text box 2 Element is Enable");
		}
		else {
			System.out.println("Address Text box 2 Element is Disabled");
			}
		
	    
	    if(driver.findElement(By.xpath(XpathConstants.MyProfile.SelectLocation)).isEnabled()) 
		{
			System.out.println("Select location Element is Enable after selecting country");
			Select locationName= new Select (driver.findElement(By.xpath(XpathConstants.MyProfile.SelectLocation)));
			 List<WebElement> elementCount2 = locationName.getOptions();
			 int listNUmber2=elementCount2.size()-1;
			 System.out.println(listNUmber2);
			int  indexNumber1=rand.nextInt(listNUmber2)+1;
			
			locationName.selectByIndex(indexNumber1);}
			
			else {
				System.err.println("Select location Element is Disabled after selecting country");
		    }
	    
	    
	    
	    if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address1Level)).isEnabled()) 
		{
			System.out.println("Select Address 1 Element is Enable after selecting location");
			String stateAdress=lorem.getStateFull();
			driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).sendKeys(stateAdress);
		}
			else {
				System.err.println("Select Address 1 Element is Disabled after selecting location");
		    }
	    
	    
	    if(driver.findElement(By.xpath(XpathConstants.MyProfile.Address2Level)).isEnabled()) 
			{
				System.out.println("Select Address 2 Element is Enable after selecting location");
				String stateAdress=lorem.getStateFull();
				driver.findElement(By.xpath(XpathConstants.MyProfile.Address2TextBox)).sendKeys(stateAdress);
			}
				else {
					System.err.println("Select Address 2 Element is Disabled after selecting location");
			    }
	    Thread.sleep(3000);
		driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).click();
		
		 Thread.sleep(3000);
		 Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle. header)).getText(),UIElementConstants.MyVehicle.header);
		 
	}
	
	
	public void RequiredfieldVerification(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Lorem lorem = LoremIpsum.getInstance();
		String name=lorem.getName();
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).sendKeys(name);
		
		driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).sendKeys("0145254124");
		
		if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
			System.out.println("Next button is active");
		}
		else {
			System.err.println("Though required field filled but Next button still inactive");
		}
		
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).sendKeys(Keys.CONTROL+"A");
		driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).sendKeys(Keys.DELETE);
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameFieldIsRequired)).getText(),UIElementConstants.MyProfile.FullnameIsRequired);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
			  System.err.println("Next button is active though  required fields not filled ");
			}
			else {
				System.out.println("As one required field Full name not filled so Next button is inactive");
			}
		  
		
		  driver.findElement(By.xpath(XpathConstants.MyProfile.FullNameTextBox)).sendKeys(name);
		  driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).sendKeys(Keys.CONTROL+"A");
			driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).sendKeys(Keys.DELETE);
		  Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.MobileFieldIsRequired)).getText(),UIElementConstants.MyProfile.FullnameIsRequired);
			  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			  if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
				  System.err.println("Next button is active though  required fields not filled ");
				}
				else {
					System.out.println("As one required field  Mobile not filled so Next button is inactive");
				}
			
			  
			  driver.findElement(By.xpath(XpathConstants.MyProfile.mobileTextBox)).sendKeys("0125545455");
			  
				Select drpCountry= new Select (driver.findElement(By.xpath(XpathConstants.MyProfile.Selectcounty)));
				 List<WebElement> elementCount = drpCountry.getOptions();
				 int listNUmber=elementCount.size()-1;
				 System.out.println(listNUmber);
				 
				 Random rand = new Random(); 
				    int  indexNumber=rand.nextInt(listNUmber)+1;
				    System.out.println(indexNumber);
				    
				    drpCountry.selectByIndex(indexNumber);
			    
			    if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
			    	System.err.println("Next button is active though  required fields not filled");
				}
				else {
					System.out.println("As two required field  Location & Address not filled so Next button is inactive");
				}
			  
			    
			    Select locationName= new Select (driver.findElement(By.xpath(XpathConstants.MyProfile.SelectLocation)));
				 List<WebElement> elementCount2 = locationName.getOptions();
				 int listNUmber2=elementCount2.size()-1;
				 int  indexNumber1=rand.nextInt(listNUmber2)+1;
				 locationName.selectByIndex(indexNumber1);
				
				  if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
					  System.err.println("Next button is active though  required fields not filled ");
					}
					else {
						System.out.println("As one required field  Address not filled so Next button is inactive");
					}
				  
				  
				  locationName.selectByIndex(0);
				  Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.LocationisRequiredFeild)).getText(),UIElementConstants.MyProfile.FullnameIsRequired);
				  locationName.selectByIndex(indexNumber1);
				  
				String stateAdress=lorem.getStateFull();
				driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).sendKeys(stateAdress);
				if(driver.findElement(By.xpath(XpathConstants.MyProfile.Next)).isEnabled()) {
					System.out.println("Next button is active after filling required fields ");
				}
				else {
					System.err.println("Though all required field filled but Next button is inactive");
				}
				
				
				driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).sendKeys(Keys.CONTROL+"A");
				driver.findElement(By.xpath(XpathConstants.MyProfile.Address1TextBox)).sendKeys(Keys.DELETE);
				driver.findElement(By.xpath(XpathConstants.MyProfile.Address2TextBox)).click();;
				Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyProfile.addressIsRequiredFeild)).getText(),UIElementConstants.MyProfile.FullnameIsRequired);
				
	}
}
