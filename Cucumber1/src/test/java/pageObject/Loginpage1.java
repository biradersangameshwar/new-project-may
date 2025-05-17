package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class Loginpage1 {

    WebDriver ldriver;

    // Constructor
    public Loginpage1(WebDriver rDriver) {
        this.ldriver = rDriver;

        // ✅ Fixed: Use DefaultElementLocatorFactory for compatibility with Selenium 4.11+
        PageFactory.initElements(new DefaultElementLocatorFactory(ldriver), this);
    }

    // Element locators
    @FindBy(id = "username")
    WebElement email;

    @FindBy(name = "pwd")
    WebElement password;

    @FindBy(xpath = "//div[text()='Login ']")
    WebElement Login;

    @FindBy(id = "logoutLink")
    WebElement logout;

    // Actions
    public void enterEmail(String emailAdd) {
        email.sendKeys(emailAdd);
    }

    public void enterPassword(String pwdAdd) {
        password.sendKeys(pwdAdd);
    }

    public void clickOnLoginBuutton() {
        Login.click();
    }

    public void clickOnLogoutBuutton() {
        logout.click();
    }
}