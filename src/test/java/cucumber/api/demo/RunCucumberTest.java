package cucumber.api.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * RunCucumberTest
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources")
public class RunCucumberTest {

}
