package testngp;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateL extends ProjspecMethods {
 @BeforeTest
 public void testSetUp() {
  excelFileName = "createLeadData";
 }
 
 @Test(dataProvider = "fetchData")
 public void runCreateLead(String cn, String fn, String lN, String ph) {
  driver.findElementByXPath("//a[contains(@href,'/crmsfa/control/leadsMain')]");
  driver.findElementByLinkText("Create Lead").click();
  driver.findElementById("createLeadForm_companyName")
  .sendKeys(cn);
  driver.findElementById("createLeadForm_firstName")
  .sendKeys(fn);
  driver.findElementById("createLeadForm_lastName")
  .sendKeys(lN);
  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(ph);
  driver.findElementByName("submitButton").click();
 }
}
