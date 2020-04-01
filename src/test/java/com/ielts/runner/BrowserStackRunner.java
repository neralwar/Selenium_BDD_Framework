package com.ielts.runner;
import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		 features = {"src/test/resources/features/UI_Automation/Booking/organisation_Search.feature","src/test/resources/features/RestService_Automation/Employee/employee_management.feature"}
		 ,glue={"com/ielts/ui/stepdefinition","com.ielts.restservice.stepdefinition"}
		 
		 )
public class BrowserStackRunner extends BrowserStackSerenityTest {
}
		








	

	
	
		
	
	
		
	
	
		

	
