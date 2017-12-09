package steps;

import base.BaseUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

public class Setup extends BaseUtils {

    private BaseUtils baseUtils;

    public Setup(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    private final Logger logger = Logger.getLogger(Setup.class.getName());

    @Before
    public void openUpBrowser() {
        logger.info("Opening up the browser");
        if (baseUtils.getDriver() == null) {
            System.setProperty("webdriver.firefox.marionette","/home/toni8810/IdeaProjects/cucumbercourse/geckodriver");
            baseUtils.setDriver(new FirefoxDriver());
        }
    }

    @After
    public void closeBrowser() {
        logger.info("Closing the browser!");
        baseUtils.getDriver().close();
    }
}
