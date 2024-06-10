package vehicle.reservation.testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vehicle.reservation.lib.Baseconfiguration;
import vehicle.reservation.service.impl.MyVehicleService_Impl;
import vehicle.reservation.service.impl.ProfileUpdate_service_impl;
import vehicle.reservation.service.impl.Register_service_iml;
import vehicle.reservation.service.interfaces.MyVehicleUpdate_inter;
import vehicle.reservation.service.interfaces.ProfileUpdate_inter;
import vehicle.reservation.service.interfaces.Register_inter;

public class MyVehicleUpdate_testCase {
	
	private Baseconfiguration baseConfig= new Baseconfiguration();
    private WebDriver driver=null;
    private Register_inter Register=new Register_service_iml();
    private ProfileUpdate_inter proUpdate=new ProfileUpdate_service_impl();
    private MyVehicleUpdate_inter vehicleInfoUpdate=new MyVehicleService_Impl();
    
    
    @BeforeTest
 public void initdriver() throws Exception{
    	
    	baseConfig.initEnvironment();
    	driver= baseConfig.loadDriver("https://find-vehicle.com/dashboard/vehicles");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    
    
   	
  
    
	
	
	  @Test 
	  public void VehicleInformationUpdate() throws Exception {
	  
	  
		
	
		
		
		 Register.GUIVerification(driver);
		 proUpdate.profilenformationUpdate(driver);
		 
		 
		 
	     vehicleInfoUpdate.MyVehicleInfoUpdate(driver);
	 
	 }
	 
	 
    
    
    @AfterTest
    public void  testCaseTearDown() {
    	//driver.quit();
    }
    	

}
