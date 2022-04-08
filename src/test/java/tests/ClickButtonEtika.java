package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickButtonEtika extends BaseTest{

    @BeforeClass
    public void setup() {
        pages.Common.openLink("http://www.filmproducers.lt/");
    }
    @Test
    public void testCheckButtonEtika() {
        String expectedResult = "ETIKA";
        String actualResult;

        pages.ClickButtonEtika.clickButtonEtika();
        actualResult = pages.ClickButtonEtika.getResult();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
