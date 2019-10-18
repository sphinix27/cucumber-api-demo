package cucumber.api.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * GithubLandPage
 */
public class GithubLandPage {

    private WebDriver driver;

    public GithubLandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
