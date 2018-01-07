package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {

    @FindBy(how = How.NAME, using = "j_username")
    public static WebElement myemailaddress;

    @FindBy(how = How.NAME, using = "j_password")
    public static WebElement mypasswd;

    @FindBy(how = How.XPATH, using = "//*[@id=\'content-container\']/div/div[2]/main/div[3]/form/div[3]/input")
    public static WebElement signbutton;

    public void type_email_address (String email) {
        myemailaddress.sendKeys(email);
    }

    public void type_password (String password) {
       mypasswd.sendKeys(password);
    }

    public void click_sign_in() {
        signbutton.click();
    }

}
