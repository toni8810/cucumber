package steps;

import base.BaseUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import page.HomePage;
import transformer.UsernameTransformer;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends BaseUtils {
    private final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private BaseUtils baseUtils;

    public LoginSteps(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    @Given("^User goes to the login page$")
    public void userGoesToTheLoginPage() {
        logger.info("user goes to the login page");
        baseUtils.getDriver().navigate().to("https://gigbuddy.org");
    }

    @When("^User attempts to login with the following credentials$")
    public void userAttemptsToLoginWithTheFollowingCredentials(DataTable dataTable) throws Throwable {
        List<User> credentials = dataTable.asList(User.class);
        HomePage homePage = new HomePage(baseUtils.getDriver());
        homePage.clickLoginButton();
        credentials.forEach(user -> {
            logger.info("username is " + user.getUsername());
            logger.info("password is " + user.getPassword());
            homePage.submitLoginForm(user.getUsername(), user.getPassword());
        });

    }

    @Then("^User is logged in$")
    public void userIsLoggedIn() throws Throwable {
        HomePage homePage = new HomePage(baseUtils.getDriver());
        assertTrue(homePage.isLoggedIn());
        logger.info("user is logged in!!");
    }

    @When("^User attempts to login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userAttemptsToLoginWithCredentialsAnd(@Transform(UsernameTransformer.class) String username, String password) throws Throwable {
       logger.info("username is: " + username);
       logger.info("password: " + password);
    }

}
