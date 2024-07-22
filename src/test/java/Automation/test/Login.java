package Automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base{


    public Login(WebDriver driver){

        this.driver = driver;
    }

    By username = new By.ById("username");
    By password = new By.ById("password");
    By loginBtn = new By.ById("login");

    public void login(String uname, String pass){
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
