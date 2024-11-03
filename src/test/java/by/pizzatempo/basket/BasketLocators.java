package by.pizzatempo.basket;

public class BasketLocators {
    public static final String PIZZA_MENU_ITEM_LOCATOR = "//a[@href='https://www.pizzatempo.by/menu/pizza.html']";
    public static final String ORDER_BUTTON_PIZZA_MARGHERITA_LOCATOR = "//div[contains(@class,'item') and child::h3/span[.='Пицца \"Маргарита\"']]//span[.='Заказ']";
    public static final String CONFIRM_ORDER_BUTTON_LOCATOR = "//div[@class='popupContent']//div[@class='order-btn']";
    public static final String BASKET_BUTTON_LOCATOR = "//div[@class='basket-top']//a[@href='https://www.pizzatempo.by/menu/order/']";
    //public static final String BASKET_PRODUCT_NAME_TEXT_LOCATOR = "//table[@class='basket']//div[@class='cart-product-name title']";
    public static final String BASKET_PRODUCT_NAME_TEXT_LOCATOR = "/html/body/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]/div[1]";
}
