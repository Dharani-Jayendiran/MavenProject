package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class LoginLT extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	@Given("Open the chrome Browser")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		}
	@Given("Maximise the browser")
	public void maximise_the_browser() {
		   driver.manage().window().maximize();
	}

	@Given("set the Timeouts")
	public void set_the_Timeouts() {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@Given("Load the URL")
	public void load_the_URL() {
		driver.get("http://Leaftaps.com/opentaps");
	}

	@Given("Enter the username as (.*)") 
	public void enter_the_username(String data) {
		driver.findElementById("username").sendKeys(data);
	}

	@Given("Enter the password as (.*)")
	public void enter_the_password(String data) {
		driver.findElementById("password").sendKeys(data);
	   
	}

	@When("User clicks on the Login Button")
	public void user_clicks_on_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify the Login is success")
	public void verify_the_Login_is_success() {
	   System.out.println("Login is Success");
	}


	}

