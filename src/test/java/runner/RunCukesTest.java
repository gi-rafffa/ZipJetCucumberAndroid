package test.java.runner;
import test.java.views.*;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/"},
    glue = {"test.java.features.step_definitions"},
    plugin = {"pretty"},
	tags = {"@play"}

  //  plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
    
)
public class RunCukesTest {
   // @AfterClass
    //public static void setup() {
       // Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
       // Reporter.setSystemInfo("user", System.getProperty("user.name"));
        //Reporter.setSystemInfo("os", "Mac OSX");
        //Reporter.setTestRunnerOutput("Sample test runner output message");
    //}
}