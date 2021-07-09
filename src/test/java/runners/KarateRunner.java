package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(        glue = "library",
        tags = {"@Web", "not@ignore"})
public class KarateRunner {

}
