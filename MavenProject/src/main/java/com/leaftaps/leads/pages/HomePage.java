package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() {
		//PageFactory code
	}
	
	public MyHomePage clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
