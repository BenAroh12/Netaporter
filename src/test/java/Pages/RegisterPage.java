package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    @FindBy(how = How.CSS, using = "#content-container > div > div.main-content-container > main > h1")
    public static WebElement registernow;

    @FindBy(how = How.ID, using = "input")
    public static WebElement myfirstname;

    @FindBy(how = How.NAME, using = "lastName")
    public static WebElement mylastname;

    @FindBy(how = How.NAME, using = "email")
    public static WebElement myemail;

    @FindBy(how = How.NAME, using = "confirmEmail")
    public static WebElement myconfirmemail;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement mypassword;

    @FindBy(how = How.ID, using = "country")
    public static WebElement mycountry;

    @FindBy(how = How.NAME, using = "birthDay")
    public static WebElement mydayofbirth;

    @FindBy(how = How.NAME, using = "birthMonth")
    public static WebElement mymonthofbirth;

    @FindBy(how = How.ID, using = "checkbox")
    public static WebElement checkbox;

    @FindBy(how = How.ID, using = "captchaToken")
    public static WebElement robot;

    @FindBy(how = How.CSS, using = "#button")
    public static WebElement registerbutton;

    public void verify_register_now () {
        Assert.assertEquals("REGISTER NOW", registernow.getText());
        System.out.println(registernow.getText());
    }

    public void type_firstname() {
        myfirstname.sendKeys("James");
    }

    public void type_lastname() {
        mylastname.sendKeys("John");
    }

    public void type_email(String email) {
        myemail.sendKeys(email);
    }

    public void retype_email(String email) {
        myconfirmemail.sendKeys(email);
    }

    public void type_password(String password) {
        mypassword.sendKeys(password);
    }

    public void select_country() {
        Select ElementSelect = new Select(mycountry);
        ElementSelect.selectByValue("GB");
    }

    public void select_day_of_birth () {
        Select ElementSelect = new Select(mydayofbirth);
        ElementSelect.selectByValue("1");
    }


    public void select_month_of_birth () {
    Select ElementSelect = new Select(mymonthofbirth);
    ElementSelect.selectByValue("9");
}

    public void verify_Netaporter_updates () {
        checkbox.isEnabled();
    }

    public void verify_catcha () {
        robot.click();
    }
    public void click_register () {
        registerbutton.click();
    }

}
