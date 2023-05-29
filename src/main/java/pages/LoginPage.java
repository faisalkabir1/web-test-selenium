package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passWordField = By.id("password");
    private By loginBtn = By.cssSelector("#login button");
    private By loginForm = By.linkText("Form Authentication");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public Void ClickForm(){
        driver.findElement(loginForm).click();


        return null;
    }

    public Void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);

        return null;
    }
    public Void setPass(String password){
        driver.findElement(usernameField).sendKeys(password);

        return null;
    }
    public Void clickLogin(){
        driver.findElement(loginBtn).click();


        return null;
    }

}
