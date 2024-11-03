package by.pizzatempo.basket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage {
    private WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPizzaMenuItem() {
        By menuItemPizzaBy = By.xpath(BasketLocators.PIZZA_MENU_ITEM_LOCATOR);
        WebElement menuItemPizzaWebElement = driver.findElement(menuItemPizzaBy);
        menuItemPizzaWebElement.click();
    }

    public void clickOrderButtonPizzaMargherita() {
        By orderButtonPizzaMargheritaBy = By.xpath(BasketLocators.ORDER_BUTTON_PIZZA_MARGHERITA_LOCATOR);
        WebElement orderButtonPizzaMargheritaWebElement = driver.findElement(orderButtonPizzaMargheritaBy);
        orderButtonPizzaMargheritaWebElement.click();
    }

    public void clickConfirmOrderButton() {
        By confirmOrderButtonBy = By.xpath(BasketLocators.CONFIRM_ORDER_BUTTON_LOCATOR);
        WebElement confirmOrderButtonWebElement = driver.findElement(confirmOrderButtonBy);
        confirmOrderButtonWebElement.click();
    }

    public void clickBasketButton() {
        By basketButtonBy = By.xpath(BasketLocators.BASKET_BUTTON_LOCATOR);
        WebElement basketButtonWebElement = driver.findElement(basketButtonBy);
        basketButtonWebElement.click();
    }

    public String getProductNameInBasket() {
        By productNameInBasketBy = By.xpath(BasketLocators.BASKET_PRODUCT_NAME_TEXT_LOCATOR);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(productNameInBasketBy));
        WebElement productNameInBasketWebElement = driver.findElement(productNameInBasketBy);
        return productNameInBasketWebElement.getText();
    }
}
