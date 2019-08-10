package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage() {
		//PageFactory code
	}
	 public CreateLeadPage enterCompanyName(String data) {
		   driver.findElementById("createLeadForm_companyName").sendKeys(data);
		   return this;
	   }
	   public CreateLeadPage enterFirstName(String data) {
		   driver.findElementById("createLeadForm_firstName").sendKeys(data);
		   return this;
	   }
	   public CreateLeadPage enterLastName(String data) {
		   driver.findElementById("createLeadForm_lastName").sendKeys(data);
		   return this;
	   }
	   public ViewLeadPage clickSubmit() {
		   driver.findElementByName("submitButton").click();
		   return new ViewLeadPage();
		   
	   }

}
