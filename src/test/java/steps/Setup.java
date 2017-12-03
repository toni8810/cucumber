package steps;

import base.BaseUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

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
        this.baseUtils.setStepInfo("Opening up firefox driver!!");
    }

    @After
    public void closeBrowser() {
        logger.info("Closing the browser!");
    }
}
