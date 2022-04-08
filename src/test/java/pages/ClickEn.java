package pages;

import org.openqa.selenium.By;

public class ClickEn {
    public static void clickEn() {
        By locator = By.xpath("//a[contains(text(), 'EN')]");
        Common.clickElement(locator);
    }
    public static String getResult() {
        By locator = By.xpath("//h1[contains(text(), 'MEMBERS')]");
        return Common.getText(locator);
    }
}
