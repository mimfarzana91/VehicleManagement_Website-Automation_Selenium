package vehicle.reservation.testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vehicle.reservation.lib.Baseconfiguration;
import vehicle.reservation.service.impl.Register_service_iml;
import vehicle.reservation.service.interfaces.Register_inter;

public class Register_teststep {
	
	private Baseconfiguration baseConfig= new Baseconfiguration();
    private WebDriver driver=null;
    private Register_inter Register=new Register_service_iml();
    
    
    @BeforeTest
 public void initdriver() throws Exception{
    	
    	baseConfig.initEnvironment();
    	driver= baseConfig.loadDriver("https://find-vehicle.com/");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    
    
    @Test
     public void GUIVerification( ) throws Exception   {
    	
    	
    	Register.GUIVerification(driver);
    	
    	
    }
    
    
    @AfterTest
    public void  testCaseTearDown() {
    	//driver.quit();
    }
    	

}
