package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature/LeaftapsLogin.feature",glue="steps", plugin = { "pretty", "html:Reports" })
public class RunTest  {

}


