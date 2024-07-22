package Automation.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends Base{
    Login login;

    @Test(priority = 1)
    public void LoginWithValidUsernameValidPassword(){
        login = new Login(driver);
        login.login("naeemtester","naeemtester");
        //Verification
        String text = driver.findElement(By.className("welcome_menu")).getText();
        Assert.assertEquals(text,"Welcome to Adactin Group of Hotels");

    }

    @Test(priority = 2)
    public void LoginWithInvalidUsernameInvalidPassword(){
        login = new Login(driver);
        login.login("alikahna","aasds");
        //verification
        String text = driver.findElement(By.className("auth_error")).getText();
        Assert.assertEquals(text,"Invalid Login details or Your Password might have expired. Click here to reset your password");
    }

    @Test(priority = 3)
    public void LoginWithvalidUsernameInvalidPassword(){
        login = new Login(driver);
        login.login("naeemtester","aasds");
        //verification
        String text = driver.findElement(By.className("auth_error")).getText();
        Assert.assertEquals(text,"Invalid Login details or Your Password might have expired. Click here to reset your password");
    }

    @Test(priority = 4)
    public void LoginWithInvalidUsernamevalidPassword(){
        login = new Login(driver);
        login.login("11221","naeemtester");
        //verification
        String text = driver.findElement(By.className("auth_error")).getText();
        Assert.assertEquals(text,"Invalid Login details or Your Password might have expired. Click here to reset your password");
    }
}
