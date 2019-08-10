package steps;

import org.openqa.selenium.OutputType;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;

public class Hooks extends LoginLT {
	
	
public void BeforeScenario(Scenario sc) {
	System.out.println(sc.getName());
	System.out.println("Line No:" + sc.getId());
}

public void AfterScenario(Scenario sc) {
	System.out.println("Status"+sc.getStatus());
	
}
@AfterStep
public void afterSteps(Scenario sc) {
	byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
	sc.embed(screenshotAs, "image/png");
}
}