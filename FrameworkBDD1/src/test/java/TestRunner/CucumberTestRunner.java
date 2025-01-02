package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Features"},glue= {"stepDefinitions"},
plugin= {"pretty","html:target/reporthtml.html"})
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
