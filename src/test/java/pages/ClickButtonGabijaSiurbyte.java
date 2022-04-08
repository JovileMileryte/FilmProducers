package pages;

import org.openqa.selenium.By;

public class ClickButtonGabijaSiurbyte {
    public static void clickButtonGabijaSiurbyte() {
        By locator = By.xpath("//a[contains(text(), 'Gabija Siurbytė')]");
        Common.clickElement(locator);
    }
    public static String getResult() {
        By locator = By.xpath("//h1[contains(text(), 'Gabija Siurbytė')]");
        return Common.getText(locator);
    }
}
