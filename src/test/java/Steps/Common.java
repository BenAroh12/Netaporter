package Steps;

import Pages.HomePage;
import Pages.RegisterPage;
import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Common extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

        @Given("^I am on the Home Page$")
        public void i_am_on_the_Home_Page () throws Throwable {
            driver.manage().deleteAllCookies();
            driver.navigate().to("https://www.net-a-porter.com");
        }

        @And("^I see a Net-A-Porter Logo$")
        public void i_see_a_Net_A_Porter_Logo () throws Throwable {
            HomePage homepage = PageFactory.initElements(driver, HomePage.class);
            homepage.verify_Net_A_Porter();
    }

    @When("^I click Beauty Button$")
    public void iClickBeautyButton() throws Throwable {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.click_beauty();

        }

    }

