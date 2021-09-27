package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			
			features = "src/test/java/Features/Login.feature",
			glue = {"stepDefinitions"} , 
			tags = {"@Sanity"}, 
			//dryRun = true,
			monochrome = true,
			//strict = true,
			plugin= {"pretty" , "html:target/cucumber.html" , "json:target/cucumber.json" 
					  , "junit:target/cukes.xml"  }		
		    //plugin= {"pretty" , "html:target/cucumber.html" , "json:target/cucumber.json" , }
			
			)
	
public class testRunner {

}
