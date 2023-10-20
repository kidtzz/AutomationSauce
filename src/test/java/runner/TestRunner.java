package runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOption(
        feutures = "src/java/features",
        glue = {"src/test/java/stepDefinition", "src/test/java/utility"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}
)
public final class TestRunner {

}
