package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickEn extends BaseTest{
    @BeforeClass
    public void setup() {
        pages.Common.openLink("http://www.filmproducers.lt/nariai/");
    }
    @Test
    public void testClickEn() {
        String expectedResult = "MEMBERS";
        String actualResult;

        pages.ClickEn.clickEn();
        actualResult = pages.ClickEn.getResult();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
