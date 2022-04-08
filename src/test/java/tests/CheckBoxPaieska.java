package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Common;

public class CheckBoxPaieska extends BaseTest {
    @Test
    public void testSingleInputField() {

        Common.openLink("http://www.filmproducers.lt/");

        String actualInput = "Labas";
        String actualOutput;

        pages.CheckBoxPaieska.enterMessageToInputField(actualInput);
        pages.CheckBoxPaieska.clickShowMessageButton();
        actualOutput = pages.CheckBoxPaieska.getResultText();

        Assert.assertEquals(actualOutput, actualOutput);
    }
}