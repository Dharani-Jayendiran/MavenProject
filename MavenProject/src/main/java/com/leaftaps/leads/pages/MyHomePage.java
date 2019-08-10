package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage() {
		//PageFactory code
	}
    public MyLeadsPage clickLeads()
    {
    	driver.findElementByLinkText("Leads").click();
    	return new MyLeadsPage();
    }
  
  
}
