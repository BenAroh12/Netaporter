package Steps;

import Pages.BeautyPage;
import Pages.SignInPage;
import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Beauty extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @And("^I select haircare$")
    public void iSelectHaircare() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_haircare();
    }

    @And("^I click on Shampoo$")
    public void iClickOnShampoo() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_shampoo_haircare();
    }

    @And("^I click purly perfect$")
    public void iClickPurlyPerfect() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_purly_perfect();
    }


    @When("^I click add to shopping bag$")
    public void i_click_add_to_shopping_bag() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_add_to_cart();
    }

    @When("^I click checkout$")
    public void i_click_checkout() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_checkout_now();
    }

    @When("^I click on proceed to purchase$")
    public void i_click_on_proceed_to_purchase() throws Throwable {
        BeautyPage clothingpage = PageFactory.initElements(driver, BeautyPage.class);
        clothingpage.click_proceed_to_purchase();

    }

        @When("^I click on Sign in now$")
        public void i_click_on_Sign_in_now () throws Throwable {
            SignInPage signinpage = PageFactory.initElements(driver, SignInPage.class);
            signinpage.click_sign_in();
        }

        @Then("^I should successfully sign in to my account$")
        public void i_should_successfully_sign_in_to_my_account () throws Throwable {

        }

        @Then("^I click sign out$")
        public void i_click_sign_out () throws Throwable {

        }



}
