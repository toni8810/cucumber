package page;

import base.BaseUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriverWait webDriverWait;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        webDriverWait = new WebDriverWait(webDriver,5000);
    }

    private final String HOME_PAGE_URL = "https://gigbuddy.org";

    @FindBy(xpath = "/html/body/app-root/app-header/nav/div/div[2]/ul[2]/li/a")
    private WebElement loginButton;

    @FindBy(how = How.NAME, using = "email")
    private WebElement usernameField;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/app-root/app-header/div/div/div/div[2]/form/div[3]/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/app-root/app-header/nav/div/div[2]/ul[2]/li/a")
    private WebElement logoutButton;

    public void clickLoginButton() {
        loginButton.click();
    }
    public void submitLoginForm(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }
    public boolean isLoggedIn() {
        try {
            return webDriverWait.until(ExpectedConditions.elementToBeClickable(logoutButton))
            .getText().contentEquals("Logout");
        }
        catch (NoSuchElementException nsee) {
            return false;
        }
    }
}
