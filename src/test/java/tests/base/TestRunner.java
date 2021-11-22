package tests.base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/",
        glue = "ru.sbt.nlpPortal",
        tags = "@all"
        //, stepNotifications = true
)
public class TestRunner {
}
