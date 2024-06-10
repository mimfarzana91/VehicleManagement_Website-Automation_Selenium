package vehicle.reservation.service.impl;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import vehicle.reservation.lib.UIElementConstants;
import vehicle.reservation.lib.XpathConstants;
import vehicle.reservation.service.interfaces.Register_inter;

public class Register_service_iml implements Register_inter {

	public void GUIVerification(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath(XpathConstants.Signup.Register)).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		/*level verification*/
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathConstants.Signup.headerLevel)));
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.EmailLevel)).getText(), UIElementConstants.Register.emailLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.NewPasswordLevel)).getText(),UIElementConstants.Register.NewPasswordLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.RetypePasswordLevel)).getText(),UIElementConstants.Register.RetypePasswordLevel);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.checkBox)).getText(),UIElementConstants.Register.CheckboxText);
		
       /*links are clickable or go to expected page verification*/
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathConstants.Signup.termsOfService)));
		element.click();
		driver.navigate().back();

		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathConstants.Signup.privacyPolicy)));
		element1.click();
		driver.navigate().back();
        
		/*level verification*/
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.SignUpButton)).getText(),UIElementConstants.Register.SignUpButtonText);
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.AlreadyHAveAccount)).getText(),UIElementConstants.Register.AlreadyHAveAccount);
        
		/*links are clickable or go to expected page verification*/
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathConstants.Signup.LoginHere)));
		element2.click();
		driver.navigate().back();

		/* TenMinteEmailpickup and signup with email verification */
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

		System.out.println("pass");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.get("https://10minutemail.com/10MinuteMail/index.html");
		/*
		 * WebElement Element =
		 * driver.findElement(By.xpath(XpathConstants.TenminitesMail.mailaddress));
		 * RemoteWebDriver js=null; js.executeScript("arguments[0].scrollIntoView();",
		 * Element); System.out.println("pass");
		 */

		if (driver.findElements(By.xpath(XpathConstants.TenminitesMail.ADDbar)).size() != 0) {
			driver.findElement(By.xpath(XpathConstants.TenminitesMail.CroosbuttonOfAdd)).click();
		}

		else {
			System.out.println("add not available");
		}

		String mailAdrees = driver.findElement(By.xpath(XpathConstants.TenminitesMail.mailaddress))
				.getAttribute("value");
		System.out.println("mailAdrees");

		driver.switchTo().window(tabs.get(0));
		driver.get("https://dev.find-garage.com/registration");
		driver.findElement(By.xpath(XpathConstants.Signup.EmailTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.Signup.EmailTextBox)).sendKeys(mailAdrees);
		driver.findElement(By.xpath(XpathConstants.Signup.NewPasswordTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.Signup.NewPasswordTextBox)).sendKeys("Abcd12345");
		driver.findElement(By.xpath(XpathConstants.Signup.RetypePasswordTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.Signup.RetypePasswordTextBox)).sendKeys("Abcd12345");
		driver.findElement(By.xpath(XpathConstants.Signup.checkBox)).click();
		driver.findElement(By.xpath(XpathConstants.Signup.SignUpButton)).click();
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Signup.verifyYourmailText)).getText(),UIElementConstants.Register.verifyYourmailText);
		driver.switchTo().window(tabs.get(0));
		driver.get("https://10minutemail.com/10MinuteMail/index.html");
		// js.executeScript("arguments[0].scrollIntoView();", Element);
		if (driver.findElements(By.xpath(XpathConstants.TenminitesMail.ADDbar)).size() != 0) {
			driver.findElement(By.xpath(XpathConstants.TenminitesMail.CroosbuttonOfAdd)).click();
		}

		else {
			System.out.println("add not available");
		}

		driver.findElement(By.xpath(XpathConstants.TenminitesMail.mailDetails)).click();
	
		// WebElement Element1 =
		// driver.findElement(By.xpath(XpathConstants.TenminitesMail.verifyEmailButton));
		// js.executeScript("arguments[0].scrollIntoView();", Element1);
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.verifyEmailButton)).click();
		driver.switchTo().window(tabs.get(0));
		driver.get("https://dev.find-garage.com/registration/success");
		Assert.assertEquals(driver.findElement(By.cssSelector(XpathConstants.TenminitesMail.congratulationText)).getText(),UIElementConstants.Register.CongratulationText);
		/*
		 * String pageSource = driver.getPageSource();
		 * System.out.println("Current Page Source is: " +pageSource);
		 */

		driver.findElement(By.xpath(XpathConstants.TenminitesMail.BackToLoginPage)).click();
		driver.switchTo().window(tabs.get(0));
		driver.get("https://dev.find-garage.com/login");
		driver.findElement(By.xpath(XpathConstants.Login.mailTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.Login.mailTextBox)).sendKeys(mailAdrees);
		driver.findElement(By.xpath(XpathConstants.Login.passwordTextBox)).clear();
		driver.findElement(By.xpath(XpathConstants.Login.passwordTextBox)).sendKeys("Abcd12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.Login.loginButton)).click();
		Assert.assertEquals(driver.findElement(By.xpath(XpathConstants.Login.profileName)).getText(), mailAdrees);
		driver.switchTo().window(tabs.get(0));
		driver.get("https://anotepad.com/notes/q9y96t5");
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.logIn)).click();
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.email)).clear();
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.email)).sendKeys("farzana.sharmin@monstar-lab.com.bd");
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.Password)).clear();
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.Password)).sendKeys("Abcd12345");
		
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.homeButton)).click();
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.onlineNotepAdTexArea)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.onlineNotepAdTexArea)).sendKeys(mailAdrees);
		Thread.sleep(2000);
		driver.findElement(By.xpath(XpathConstants.TenminitesMail.SaveButton)).click();
		
		

		/*mail id generated by lorenlipsum
		 * String lorem = Lorem.getFirstName()+"@gmail.com";
		 * driver.findElement(By.xpath(XpathConstants.Signup.EmailTextBox)).clear();
		 * driver.findElement(By.xpath(XpathConstants.Signup.EmailTextBox)).sendKeys(
		 * lorem);
		 * driver.findElement(By.xpath(XpathConstants.Signup.NewPasswordTextBox)).clear(
		 * ); driver.findElement(By.xpath(XpathConstants.Signup.NewPasswordTextBox)).
		 * sendKeys("Abcd12345");
		 * driver.findElement(By.xpath(XpathConstants.Signup.RetypePasswordTextBox)).
		 * clear();
		 * driver.findElement(By.xpath(XpathConstants.Signup.RetypePasswordTextBox)).
		 * sendKeys("Abcd12345");
		 * driver.findElement(By.xpath(XpathConstants.Signup.checkBox)).click();
		 * driver.findElement(By.xpath(XpathConstants.Signup.SignUpButton)).click();
		 */

	}

}
