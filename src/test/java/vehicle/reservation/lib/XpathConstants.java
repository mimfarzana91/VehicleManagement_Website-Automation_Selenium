package vehicle.reservation.lib;

public class XpathConstants {
	
	
	public static class TopPage{
		
		public static final String Logo="/html[1]/body[1]/app-root[1]/app-page-layout[1]/header[1]/app-navigation[1]/nav[1]/a[1]/img[1]";
		public static final String BannerText="/html[1]/body[1]/app-root[1]/app-page-layout[1]/main[1]/app-home[1]/div[1]/div[1]/div[1]/div[1]/h1[1]";
		public static final String Location="//input[@placeholder='Location']";
		public static final String FirstLocationItem="//*[@class='pac-container pac-logo']//*[@class='pac-item']";
		public static final String SelectService=" //input[@id='service']";   
	    public static final String SelectedService="//span[contains(text(),'Minor Service [Oil Change + Oil Filter]')]";
	    public static final String SelectBrand="//input[@id='brand']";
	    public static final String SelectedBrand="//span[contains(text(),'GREATWALL')]";
	    public static final String SelectModel= "//input[@id='model']";
	    public static final String SelectedModel="//button[@class='dropdown-item active']";
	    public static final String ModelYear=" //input[@id='variant']";
	    public static final String SelectedModelYear= "//span[contains(text(),'1990')]";
	    public static final String EngineType="//input[@id='enginetype']";
	    public static final String SelectedEngineType="//span[contains(text(),'2.4L-Petrol')]";
	    public static final String SearchButton="//button[@class='btn-top-page-search mt-3']";
	     
	
	}
	
	public static class Signup{
		
		public static final String headerLevel="//h3[@class='name']";
		public static final String Register="//a[@class='nav-link btn btn-register']";
		public static final String EmailLevel="//label[contains(text(),'Email')]";
		public static final String EmailTextBox="//input[@id='email']";
		public static final String NewPasswordLevel="//label[contains(text(),'New Password')]";
		public static final String NewPasswordTextBox="//input[@id='pass1']";
		public static final String RetypePasswordLevel="//label[contains(text(),'Retype Password')]";
		public static final String RetypePasswordTextBox="//input[@id='pass2']";
		public static final String checkBox="//div[@class='checkbox-wrap']//label[1]";
		public static final String SignUpButton="//button[@class='btn btn-primary btn-block']";
		public static final String AlreadyHAveAccount="//p[contains(text(),'Already have an account?')]";
		public static final String LoginHere="//a[contains(text(),'Login Here')]";
		public static final String privacyPolicy="//a[contains(text(),'privacy policy.')]";
		public static final String termsOfService="//a[contains(text(),'terms of service')]";
		public static final String verifyYourmailText="//h3[@class='title']";
		
	}
	
	public static class TenminitesMail{
		
		public static final String mailaddress="//input[@id='mailAddress']";//*[@class='pac-container pac-logo']//*[@class='pac-item']";
		public static final String mailDetails="//span[@class='inc-mail-subject']";
		public static final String verifyEmailButton="//a[contains(text(),'Verify email address')]";
		public static final String congratulationText="app-success:nth-child(2) main:nth-child(1) section.verify-page.py-5 div.content-area.congratulations > p.details";
		public static final String BackToLoginPage="/html[1]/body[1]/app-root[1]/app-page-layout[1]/main[1]/app-success[1]/main[1]/section[1]/div[2]/p[2]/a[1]";
		public static final String ADDbar=" //span[@id='div-gpt-ad-10minutemail_com-medrectangle-2-0']";
		public static final String CroosbuttonOfAdd="//center//span[@class='ezmob-footer-close'][contains(text(),'x')]";
		public static final String onlineNotepAdTexArea="//textarea[@id='edit_textarea']";
		public static final String SaveButton="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]";
		public static final String homeButton="//span[contains(text(),'Home')]";
		public static final String logIn=" //span[contains(text(),'Register/Login')]";
		public static final String email="//input[@id='loginEmail']";
		public static final String Password="//div[@class='containerMain']//div[2]//form[1]//div[2]//div[1]//input[1]";
		public static final String login=" //button[contains(text(),'Login')]";
		
		
		
		
	}
	
	public static class Login{
		public static final String mailTextBox=" //input[@id='email']";
		public static final String passwordTextBox=" //input[@id='password']";
		public static final String loginButton="//button[@class='btn btn-primary btn-block']";
		public static final String profileName="//*[@id=\"navbarDropdownDesktop\"]/span[2]";
		
	}
	
	public static class MyProfile
	{
		//public static final String MyProfileTitle="app-layout:nth-child(2) main.main-content app-my-profile:nth-child(3) section.container-fluid.page-top > h5.page-title";
		public static final String MyProfileTitle="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-my-profile[1]/section[1]/h5[1]";
		public static final String FullNamelevel="//label[contains(text(),'Full Name')]";
		public static final String FullNameTextBox="//input[@id='name']";
		public static final String EmailLevel="//label[contains(text(),'Email')]";
		public static final String Email="//input[@id='email']";
		//public static final String mobileNumberLevel
		public static final String mobileTextBox="//input[@id='Mobile']";
		public static final String HomeAddressLevel="//section[@class='container-fluid form-container']//div//h6";
		public static final String CountryLevel="//label[contains(text(),'County')]";
		public static final String Selectcounty="//select[@id='country']";
		public static final String locationLevel=" //label[contains(text(),'Location')]";
		public static final String SelectLocation="//select[@id='city']";
		public static final String Address1Level=" //label[contains(text(),'Address # 1')]";
		public static final String Address1TextBox="//input[@id='address1']";
		public static final String Address2Level="//label[contains(text(),'Address # 2')]";
		public static final String Address2TextBox="//input[@id='address2']";
		public static final String Next="//button[@class='btn btn-primary']";
		public static final String PNumberLevel="//label[contains(text(),'Mobile')]";;
		public static final String FullNameFieldIsRequired="//div//div[1]//app-validation-message[1]//div[1]";
		public static final String MobileFieldIsRequired=" //div[2]//app-validation-message[1]//div[1]";
		public static final String LocationisRequiredFeild="//div[@class='invalid-feedback']";
		public static final String addressIsRequiredFeild="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-my-profile[1]/form[1]/section[1]/div[1]/div[5]/app-validation-message[1]/div[1]";
	}
	
	
	public static class MyVehicle{
		
		public static final String header="//h5[@class='page-title']";
		public static final String AddVehicleButton="//button[@class='btn btn-success']";
		public static final String AddNewVehicle="//small[@class='crumb']";
		public static final String VehicleBrandText="//label[contains(text(),'Vehicle Brand')]";
		public static final String OthersTicBox=" //input[@id='others']";
		public static final String IfYouDontText="//p[@class='small']";
		public static final String brandTextBox="//input[@id='brand']";
		public static final String selectedBrand="//span[contains(text(),'FORD')]";
		public static final String VehicleModelLevel="//label[contains(text(),'Vehicle Model')]";
		public static final String VehicleModelTextBox="//input[@id='model']";
		public static final String SelectedVehicleModel="//span[contains(text(),'EVEREST')]";
		public static final String ModelYearLevel="//label[contains(text(),'Model Year')]";
		public static final String ModelYearTextBox="//input[@id='variant']";
		public static final String SelectedModelYear="//span[contains(text(),'2006 ~ 2015')]";
		public static final String EngineTypeLevel=" //label[contains(text(),'Engine Type')]";
		public static final String EngineTypeTextBox="//input[@id='enginetype']";
		public static final String SelectedEnhineType="//span[contains(text(),'2.5L-Diesel')]";
		public static final String VinLevel="//label[contains(text(),'VIN')]";
		public static final String yourVinDetails="//p[@class='label-details']";
		public static final String VinTextBox=" //input[@id='vin']";
		public static final String whatIcon="//span[@class='la la-question-circle']";
		public static final String WhatIconDetails="//p[contains(text(),'A VIN (Vehicle identification Number) is a 17-digi')]";
		public static final String DoneButton="//button[@class='btn btn-primary']";
		public static final String ConfirmationMesg="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-list-vehicles[1]/section[2]/div[1]/div[1]/alert[1]/div[1]";
		public static final String CrossButton="//button[@class='close']"; //html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-list-vehicles[1]/section[2]/div[1]/div[1]/alert[1]/div[1]
		public static final String VehcileBrand="//th[contains(text(),'Vehicle Brand')]";
		public static final String ModelYear="//th[contains(text(),'Model Year')]";
		public static final String EngineType="//th[contains(text(),'Engine Type')]";
		public static final String Vin="//th[contains(text(),'VIN')]";
		public static final String SelectedBrandFord="//td[contains(text(),'FORD')]";
		public static final String SelectedModelEverest="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-list-vehicles[1]/section[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]";
		public static final String EngineTypeDiesel="//td[contains(text(),'2.5L-Diesel')]";
		public static final String VINNumber="//td[contains(text(),'23625411325622136')]";
		public static final String EditButton="//a[contains(text(),'Edit')]";
		public static final String Delete="//tr[1]//td[5]//a[2]";
		public static final String UpdateConfirmationmsg="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-list-vehicles[1]/section[2]/div[1]/div[1]/alert[1]";
		public static final String Deletemsg="//p[contains(text(),'Do you really want to delete?')]";
		public static final String DeleteYes="//button[@class='btn btn-default text-gray']";
		public static final String OtherBrandTExtBox="//input[@id='brandName']";
		public static final String OtherVehicleModelTExtBox="//input[@id='modelName']";
		public static final String OtherModelYearTExtBox="//input[@id='modelVariantName']";
		public static final String OtherEngineTypeTExtBox="//input[@id='engineVariantName']";
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	

}

/*"//*[@class='dropdown-item active']//*[@text='1990']";*/