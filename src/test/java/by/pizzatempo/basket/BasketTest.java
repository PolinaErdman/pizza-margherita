package by.pizzatempo.basket;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasketTest extends BaseTest {

    @Test(testName = "Test pizza margherita is in basket")
    public void testPizzaMargheritaIsInBasket() {
        basketPage.clickPizzaMenuItem();
        basketPage.clickOrderButtonPizzaMargherita();
        basketPage.clickConfirmOrderButton();
        basketPage.clickBasketButton();
        Assert.assertEquals(basketPage.getProductNameInBasket(), BasketMessage.TEXT_PIZZA_IN_BASKET_LOCATOR);
    }
}
