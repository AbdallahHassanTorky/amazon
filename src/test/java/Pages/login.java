package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
    WebDriver driver= Hooks.driver;

    public WebElement LoginButton() {
return driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    }

    public WebElement UserName() {
        return driver.findElement(By.xpath("//input[@id='ap_email']"));
    }

    public WebElement ContinueButton() {
        return driver.findElement(By.xpath("//input[@id='continue']"));
    }

    public WebElement Password() {
        return driver.findElement(By.xpath("//input[@id='ap_password']"));
    }

    public WebElement LoginButtonInter() {
        return driver.findElement(By.xpath("//input[@id='signInSubmit']"));
    }

    public String MYHomepage() {
        return "https://www.amazon.com/gp/css/homepage.html?ref_=nav_youraccount_btn";
    }

}
