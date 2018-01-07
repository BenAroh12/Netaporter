package Steps;

import Pages.RegisterPage;
import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Register extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @When("^I see Register now displayed$")
    public void i_see_Register_now_displayed() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_register_now();
    }

    @When("^I enter First name in the first name input field$")
    public void i_enter_First_name_in_the_first_name_input_field() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_firstname();
    }

    @When("^I enter Surname in the last name input field$")
    public void i_enter_Surname_in_the_last_name_input_field() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_lastname();
    }

    @When("^I enter user email \"([^\"]*)\" details$")
    public void i_enter_user_email_details(String email) throws Throwable {
        random = 100 + (int) (Math.random() * ((1000-1)+1));
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_email("lotamusomebi"+random+"@gmail.com");
    }

    @When("^I enter user confirm email \"([^\"]*)\" details$")
    public void i_enter_user_confirm_email_details(String email) throws Throwable {
        random = 100 + (int) (Math.random() * ((1000-1)+1));
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.retype_email("lotamusomebi"+random+"@gmail.com");
    }

    @When("^I enter user password \"([^\"]*)\" details$")
    public void i_enter_user_password_details(String arg1) throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_password("benedith12");
    }

    @When("^I select country$")
    public void i_select_country() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.select_country();
    }

    @When("^I select Day of birth$")
    public void i_select_Day_of_birth() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.select_day_of_birth();

    }

    @When("^I select Month of birth$")
    public void i_select_Month_of_birth() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.select_month_of_birth();
           }

    @When("^I click to receive Net-a-Porter offers updates via email$")
    public void i_click_to_receive_Net_a_Porter_offers_updates_via_email() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_Netaporter_updates();
    }

    @When("^I click I am not a robot$")
    public void i_click_I_am_not_a_robot() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_catcha();
    }

    @And("^I click the Register Button$")
    public void iClickTheRegisterButton() throws Throwable {
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.click_register();
    }

    @Then("^I should be register successfully$")
    public void i_should_be_register_successfully() throws Throwable {

    }

    @Then("^I see user account name displayed$")
    public void i_see_user_account_name_displayed() throws Throwable {

    }


}
