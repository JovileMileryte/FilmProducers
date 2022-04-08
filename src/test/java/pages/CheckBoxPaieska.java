package pages;

import org.openqa.selenium.By;

public class CheckBoxPaieska {

    public static void enterMessageToInputField(String message) {
        By locator = By.xpath("//input[@id=\"s\"]");
        Common.sendKeys(locator, message);
    }
    public static void clickShowMessageButton() {
        By locator = By.xpath("//*[@id='searchsubmit']");
        Common.clickElement(locator);
    }

    public static String getResultText() {
        By locator = By.xpath("//div[@id='pageHead']/h1");
        return Common.getText(locator);
    }
}