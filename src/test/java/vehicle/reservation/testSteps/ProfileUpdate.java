package vehicle.reservation.testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vehicle.reservation.lib.Baseconfiguration;
import vehicle.reservation.service.impl.ProfileUpdate_service_impl;
import vehicle.reservation.service.impl.Register_service_iml;
import vehicle.reservation.service.interfaces.ProfileUpdate_inter;
import vehicle.reservation.service.interfaces.Register_inter;

public class ProfileUpdate {
	
	private Baseconfiguration baseConfig= new Baseconfiguration();
    private WebDriver driver=null;
    private Register_inter Register=new Register_service_iml();
    private ProfileUpdate_inter proUpdate=new ProfileUpdate_service_impl();
    
    
    @BeforeTest
 public void initdriver() throws Exception{
    	
    	baseConfig.initEnvironment();
    	driver= baseConfig.loadDriver("https://find-vehicle.com/");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    
    
	
	
	/*
	 * @Test(priority = 1) public void RequiredField() throws Exception {
	 * 
	 * 
	 * Register.GUIVerification(driver);
	 * proUpdate.RequiredfieldVerification(driver);
	 * 
	 * }
	 */
	 
	 
   	
  
    
	
	
	  @Test (priority = 2)
	  public void ProfileInformationUpdate() throws Exception {
	  
	  
	  Register.GUIVerification(driver); 
	  proUpdate.profilenformationUpdate(driver);
	 
	 
	 }
	 
	 
    
    
    @AfterTest
    public void  testCaseTearDown() {
    	//driver.quit();
    }
    	

}
