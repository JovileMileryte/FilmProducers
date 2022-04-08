package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClickButtonGabijaSiurbyte extends BaseTest{
    @BeforeClass
    public void setup() {
        pages.Common.openLink("http://www.filmproducers.lt/nariai/");
    }
    @Test
    public void testCheckButtonGabijaSiurbyte() {
        String expectedResult = "GABIJA SIURBYTĖ";
        String actualResult;

        pages.ClickButtonGabijaSiurbyte.clickButtonGabijaSiurbyte();
        actualResult = pages.ClickButtonGabijaSiurbyte.getResult();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
