package Oz;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OzTest {
    private OzPage ozPage;

    @BeforeClass
    public void before() {
        ozPage = new OzPage();
        ozPage.navigateToOzPage("https://oz.by/");
        ozPage.waitForLoading();
    }

    @Test
    public void myTest(){
//        ozPage.checkSearchField();
//        ozPage.checkEnterButton();
//        ozPage.checkBucketButoon();
//        ozPage.checkSomeFilter();
//        System.out.println(ozPage.checkSearchField()&&ozPage.checkEnterButton()&&ozPage.checkBucketButoon()&&ozPage.checkSomeFilter());
        Assert.assertTrue(ozPage.checkSearchField(), "Element is not shown");
        Assert.assertTrue(ozPage.checkEnterButton(), "Element is not shown");
        Assert.assertTrue(ozPage.checkBucketButoon(), "Element is not shown");
        Assert.assertTrue(ozPage.checkSomeFilter(), "Element is not shown");

    }

    @AfterClass
    public void tearDown() {
        ozPage.getDriver().quit();
    }
}
