package vehicle.reservation.testSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import vehicle.reservation.lib.Baseconfiguration;
import vehicle.reservation.service.impl.TopPage_service_impl;
import vehicle.reservation.service.interfaces.TopPage_inter;

public class TopPage {
	
	private Baseconfiguration baseConfig= new Baseconfiguration();
    private WebDriver driver=null;
    private TopPage_inter TopPage= new TopPage_service_impl();
    
    
    @BeforeSuite
    public void initdriver() throws Exception{
    	
    	baseConfig.initEnvironment();
    	driver= baseConfig.loadDriver("https://find-vehicle.com/");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
    	
    @Test
    public void TopPageVerification() throws Exception
    {
    	TopPage.guiVerification( driver);
    	
    }
    
    
    @Test
    public void SelectModelConditionChecking() throws Exception
    {
    	 TopPage.SelectModelConditionChecking( driver);
    	
    }
    
    
    
    @AfterSuite
    public void testCaseTearDown() {

      // driver.quit();
    }
}
    	
    
    
    
	
	


