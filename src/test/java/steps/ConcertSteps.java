package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.En;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:feature/concert.feature"},
        glue = {"steps.ConcertSteps"})
public class ConcertSteps implements En {
    private final Logger logger = Logger.getLogger(ConcertSteps.class.getName());

    public ConcertSteps() {
        Given("^User visits the concert page$", () -> {
            logger.info("User is visiting the concert page!");
        });
        Then("^User should be on the concert page$", () -> {
            logger.info("User is on the concert page!");
        });
    }
}
