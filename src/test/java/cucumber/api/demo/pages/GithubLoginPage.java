package cucumber.api.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * GithubLogin
 */
public class GithubLoginPage {

    private WebDriver driver;

    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement signInButton;

    public GithubLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setLoginField(String username) {
        loginField.clear();
        loginField.sendKeys(username);
    }

    public void setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public GithubLandPage signIn(String username, String password) {
        setLoginField(username);
        setPasswordField(password);
        clickSignInButton();
        return new GithubLandPage(driver);
    }
}
