package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = "body > div.sf-wrapper > div > header > a > h1")
    public static WebElement porterlogo;

    @FindBy(how = How.LINK_TEXT, using = "Register")
    public static WebElement reg;

    @FindBy(how = How.CSS,  using = "body > div.sf-wrapper > div > nav > ul > li:nth-child(10) > a")
    public static WebElement beauty;

    public void verify_Net_A_Porter() {
        porterlogo.isDisplayed();
    }

    public void click_register() {
        reg.click();
    }

    public void click_beauty() {
        beauty.click();

    }

}
