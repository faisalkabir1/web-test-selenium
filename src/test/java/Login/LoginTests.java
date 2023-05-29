package Login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    //private WebDriver driver;
    @Test
    public Void testlogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.ClickForm();
        loginPage.setUsername("tomsmith");
        loginPage.setPass("SuperSecretPassword");
        loginPage.clickLogin();
        Thread.sleep(5000);

        return null;
    }

}
