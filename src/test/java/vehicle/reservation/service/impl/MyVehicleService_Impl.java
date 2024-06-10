package vehicle.reservation.service.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import vehicle.reservation.lib.UIElementConstants;
import vehicle.reservation.lib.XpathConstants;
import vehicle.reservation.service.interfaces.MyVehicleUpdate_inter;
//import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

public class MyVehicleService_Impl implements MyVehicleUpdate_inter {
	
	public void MyVehicleInfoUpdate(WebDriver driver) throws InterruptedException {
		
		
		NewVehicleAdd(driver);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 Thread.sleep(2000);
		 
		 
		 String congmesg=driver.findElement(By.xpath(XpathConstants.MyVehicle.ConfirmationMesg)).getText();
		  
		 
		 Assert.assertTrue(congmesg.contains(UIElementConstants.MyVehicle.ConfirmationMesg), "confirmation message");
		 driver.findElement(By.xpath(XpathConstants.MyVehicle.CrossButton)).click();
		 
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VehcileBrand)).getText(),UIElementConstants.MyVehicle.VehicleBrandText);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.ModelYear)).getText(),UIElementConstants.MyVehicle.ModelYearLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.EngineType)).getText(),UIElementConstants.MyVehicle.EngineType);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.Vin)).getText(),UIElementConstants.MyVehicle.Vin);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.SelectedBrandFord)).getText(),UIElementConstants.MyVehicle.selectedBrand);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.SelectedModelEverest)).getText(),UIElementConstants.MyVehicle.SelectedVehicleModel+"  "+UIElementConstants.MyVehicle.SelectedModelYear);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.EngineTypeDiesel)).getText(),UIElementConstants.MyVehicle.SelectedEnhineType);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VINNumber)).getText(),UIElementConstants.MyVehicle.VinNumber);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.EditButton)).getText(),UIElementConstants.MyVehicle.EditButton);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.Delete)).getText(),UIElementConstants.MyVehicle.Delete);
		
		driver.findElement(By.xpath(XpathConstants.MyVehicle.EditButton)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OthersTicBox)).click();
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherBrandTExtBox)).clear();;
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherBrandTExtBox)).sendKeys("toyota");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherVehicleModelTExtBox)).clear();;
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherVehicleModelTExtBox)).sendKeys("toyota 1006");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherModelYearTExtBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherModelYearTExtBox)).sendKeys("toyota 2006");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherEngineTypeTExtBox)).clear();
		driver.findElement(By.xpath(XpathConstants.MyVehicle.OtherEngineTypeTExtBox)).sendKeys("toyota crabi");
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.DoneButton)).click();
		Thread.sleep(2000);
		 congmesg=driver.findElement(By.xpath(XpathConstants.MyVehicle.ConfirmationMesg)).getText();
		 Assert.assertTrue(congmesg.contains(UIElementConstants.MyVehicle.UpdateConfirmationmsg), "confirmation message");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.CrossButton)).click();
		
		  NewVehicleAdd(driver);
		  Thread.sleep(2000);
		 congmesg=driver.findElement(By.xpath(XpathConstants.MyVehicle.ConfirmationMesg)).getText();
		 Assert.assertTrue(congmesg.contains(UIElementConstants.MyVehicle.VehicleAddmeg), "confirmation message");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.CrossButton)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.Delete)).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.Deletemsg)).getText(),UIElementConstants.MyVehicle.Deletemsg);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.DeleteYes)).click();
		Thread.sleep(2000);
		 congmesg=driver.findElement(By.xpath(XpathConstants.MyVehicle.ConfirmationMesg)).getText();
		 Assert.assertTrue(congmesg.contains(UIElementConstants.MyVehicle.deletedonemsg), "confirmation message");
		driver.findElement(By.xpath(XpathConstants.MyVehicle.CrossButton)).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void NewVehicleAdd(WebDriver driver) throws InterruptedException {
		
		
		 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.header)).getText(),UIElementConstants.MyVehicle.header);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.AddVehicleButton)).getText(),UIElementConstants.MyVehicle.AddVehicleButtonText);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.AddVehicleButton)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.AddNewVehicle)).getText(),UIElementConstants.MyVehicle.AddNewVehicleText);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VehicleBrandText)).getText(),UIElementConstants.MyVehicle.VehicleBrandText);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.IfYouDontText)).getText(),UIElementConstants.MyVehicle.IfYouDontText);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.brandTextBox)).getAttribute("placeholder"),UIElementConstants.MyVehicle.placeHolder);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.brandTextBox)).click();
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		Action click = builder.click(driver.findElement(By.xpath(XpathConstants.MyVehicle.selectedBrand))).build();
		click.perform();
		 
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VehicleModelLevel)).getText(),UIElementConstants.MyVehicle.VehicleModelLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VehicleModelTextBox)).getAttribute("placeholder"),UIElementConstants.MyVehicle.placeHolder);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.VehicleModelTextBox)).click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		Action click1 = builder1.click(driver.findElement(By.xpath(XpathConstants.MyVehicle.SelectedVehicleModel))).build();
		click1.perform();
		
		
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.ModelYearLevel)).getText(),UIElementConstants.MyVehicle.ModelYearLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.ModelYearTextBox)).getAttribute("placeholder"),UIElementConstants.MyVehicle.placeHolder);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.ModelYearTextBox)).click();
		Thread.sleep(2000);
		Actions builder2 = new Actions(driver);
		Action click2 = builder2.click(driver.findElement(By.xpath(XpathConstants.MyVehicle.SelectedModelYear))).build();
		click2.perform();
		
		
		
		
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.EngineTypeLevel)).getText(),UIElementConstants.MyVehicle.EngineType);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.EngineTypeTextBox)).getAttribute("placeholder"),UIElementConstants.MyVehicle.placeHolder);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.EngineTypeTextBox)).click();
		Thread.sleep(2000);
		Actions builder3 = new Actions(driver);
		Action click3 = builder3.click(driver.findElement(By.xpath(XpathConstants.MyVehicle.SelectedEnhineType))).build();
		click3.perform();
		
		
		if(driver.findElement(By.xpath(XpathConstants.MyVehicle.DoneButton)).isEnabled()) {
			System.out.println("VIN number is optional");
		}
		else {
			System.err.println("VIN number is not optional");
		}
		
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.VinLevel)).getText(),UIElementConstants.MyVehicle.VinLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.yourVinDetails)).getText(),UIElementConstants.MyVehicle.yourVinDetails);
		
		driver.findElement(By.xpath(XpathConstants.MyVehicle.VinTextBox)).sendKeys(UIElementConstants.MyVehicle.VinNumber);
		
		Actions builder4 = new Actions(driver);
		builder4.moveToElement(driver.findElement(By.xpath(XpathConstants.MyVehicle.whatIcon))).click().build().perform();
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.MyVehicle.WhatIconDetails)).getText(),UIElementConstants.MyVehicle.WhatIconDetails1+"\n"+UIElementConstants.MyVehicle.WhatIconDetails2+"\n"+UIElementConstants.MyVehicle.WhatIconDetails3+"\n"+UIElementConstants.MyVehicle.WhatIconDetails4+"\n"+UIElementConstants.MyVehicle.WhatIconDetails5);
		Thread.sleep(4000);
		driver.findElement(By.xpath(XpathConstants.MyVehicle.DoneButton)).click();;
	}

}
