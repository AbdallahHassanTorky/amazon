package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",

        glue = "Steps"

)
public class Test extends AbstractTestNGCucumberTests{

}

