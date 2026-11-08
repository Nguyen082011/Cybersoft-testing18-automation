package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CyberbnbResisterPage;

public class CyberbnbResisterTest extends ParallelBaseTest{
//    todo: create function for loading data
    @Test(description = "Resister success")
    public void CyberbnbResisterTest() throws InterruptedException {
        CyberbnbResisterPage resisterPage=new CyberbnbResisterPage(getDriver(), getWait());
        resisterPage.open();
        resisterPage.register("Phuong", "phuong@gmail.com","123456","0987645243","07/11/2026","Nam");
        Assert.assertTrue(true);
    }
}
