package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BeautyPage {

    @FindBy(how = How.CSS, using = "#subnav > li.Haircare > a > span")
    public static WebElement hair;

    @FindBy(how = How.CSS, using = "#navLevel3-filter > li.selected > a > span.filter-checkbox")
    public static WebElement shampoo;

    @FindBy(how = How.CSS, using = "#product-list > ul > li:nth-child(1) > div.product-image > a > img")
    public static WebElement perfect;

    @FindBy(how = How.CSS, using = "#button > div > div")
    public static WebElement addcart;

    @FindBy(how = How.ID, using = "#product-form")
    public static WebElement checkout;

    @FindBy(how = How.CSS, using = "#content-container > div > div.main-content-container > main > section > div.basket-buttons.basket-upper-buttons > a.primary-button-medium-wide.proceed-to-purchase.position-top")
    public static WebElement proceedpurchase;

    public void click_haircare () {
        hair.click();
    }

    public void click_shampoo_haircare () {
        shampoo.click();
    }

    public void click_purly_perfect () {
        perfect.click();
    }

    public void click_add_to_cart () {
        addcart.click();
    }

    public void click_checkout_now () {
        checkout.click();
    }

    public void click_proceed_to_purchase () {
        proceedpurchase.click();
    }
}
