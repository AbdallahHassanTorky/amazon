package Steps;

import Pages.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    login login=new login();

   @Given("Navigate to login page")
    public void Navigate_to_login_page(){
       login.LoginButton().click();

    }


@When("Enter email")
    public void Enter_email(){
        login.UserName().sendKeys("abdallahhassantorky@gmail.com");

    }


@And("Click on continue button")
    public void Click_on_continue_button(){
        login.ContinueButton().click();

    }


@And("Enter password")
    public void Enter_password(){
        login.Password().sendKeys("5396Alex!@#");

    }


    @And("Click on sign in button")
    public void Click_on_sign_in_button(){
        login.LoginButtonInter().click();

    }



    @Then("user get home page")
    public void user_get_home_page(){
        login.LoginButton().click();
       String Expected=login.MYHomepage();
       String Actual=Hooks.driver.getCurrentUrl();
        System.out.println(Expected+"\n"+Actual);
        Assert.assertEquals(Expected,Actual);

    }




}
