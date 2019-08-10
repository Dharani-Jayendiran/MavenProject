package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public MyLeadsPage() {
		//PageFactory code
	}
	
	public CreateLeadPage clickCreateLead() {
		 driver.findElementByLinkText("Create Lead").click();
		 return new CreateLeadPage();
		 
	}
  
}
