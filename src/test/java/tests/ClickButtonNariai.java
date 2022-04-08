package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickButtonNariai extends BaseTest{
    @BeforeClass
    public void setup() {
        pages.Common.openLink("http://www.filmproducers.lt/");
    }
    @Test
    public void testCheckButtonNariai() {
        String expectedResult = "NARIAI";
        String actualResult;

        pages.ClickButtonNariai.clickButtonNariai();
        actualResult = pages.ClickButtonNariai.getResult();

        Assert.assertEquals(actualResult, expectedResult);
    }
}


