package com.leaftaps.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.LoginPage;

public class TC01 extends ProjectSpecificMethods {
	 @BeforeTest
	 public void testSetUp() {
	  excelFileName = "TC01s";
	 }
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		System.out.println("Welcome DJ");
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead();
	}
	

}
		