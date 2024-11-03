package by.pizzatempo.basket;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;


public class BasketTest extends BaseTest {

    @Test
    //@DisplayName("Test pizza margherita is in basket")
    public void testPizzaMargheritaIsInBasket() {
        basketPage.clickPizzaMenuItem();
        basketPage.clickOrderButtonPizzaMargherita();
        basketPage.clickConfirmOrderButton();
        basketPage.clickBasketButton();
        String expected = "Пицца \"Маргарита\"";
        Assert.assertEquals(basketPage.getProductNameInBasket(), expected);
    }
}
