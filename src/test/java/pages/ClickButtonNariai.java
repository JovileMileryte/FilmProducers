package pages;

import org.openqa.selenium.By;

    public class ClickButtonNariai {
        public static void clickButtonNariai() {
            By locator = By.xpath("//*[@class=\"sf-sub-indicator\"]");
            Common.clickElement(locator);
        }
        public static String getResult() {
            By locator = By.xpath("//h1[contains(text(), 'NARIAI')]");
            return Common.getText(locator);
        }
    }

