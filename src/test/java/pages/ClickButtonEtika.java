package pages;

import org.openqa.selenium.By;

public class ClickButtonEtika {
    public static void clickButtonEtika() {
        By locator = By.xpath("//a[contains(text(), 'Etika')]");
        Common.clickElement(locator);
    }
    public static String getResult() {
        By locator = By.xpath("//h1[contains(text(), 'Etika')]");
        return Common.getText(locator);
    }
}



