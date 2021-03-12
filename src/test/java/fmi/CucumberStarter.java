package fmi;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", plugin = {"pretty", "html:target/cucumberRaport"}, monochrome = true)
public class CucumberStarter 
{
	
}