package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage() {
		//PageFactorycod}
	}
	
	public LoginPage enterUsername(String data) {
		driver.findElementById("username").sendKeys(data);
		return this;
	
	}
	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
		
	}
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
