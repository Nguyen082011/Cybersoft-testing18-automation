package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MyInfoPage;

public class MyInfoTest extends BaseTest{
    @BeforeMethod
    public void PreCondition() throws InterruptedException{
        loginAsAdmin();
    }
    @Test(description = "uploadAvatar")
    public void uploadAvatar() throws InterruptedException {
        MyInfoPage myInfoPage=new MyInfoPage(driver,wait);
        myInfoPage.open();
        myInfoPage.uploadAvatar("Logo.png");
        Assert.assertTrue(myInfoPage.isSuccessUpload());
    }
}
