package com.leaftaps.leads.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.CreateLeadPage;

public class TC02 extends ProjectSpecificMethods {
	 @BeforeTest
	 public void testSetUp() {
	  excelFileName = "TC02s";
	 }
	@Test(dataProvider="fetchData")
	public void createLe(String cname, String fname, String lname)
	{
		new CreateLeadPage().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname).clickSubmit();
	
	
	}
}
		