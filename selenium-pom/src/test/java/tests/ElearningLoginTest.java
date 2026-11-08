package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElearningLoginPage;

public class ElearningLoginTest extends ParallelBaseTest{
    @Test(description = "Login success")
    public void elearningLoginTest() throws InterruptedException {
        ElearningLoginPage loginPage=new ElearningLoginPage(getDriver(),getWait());
        loginPage.open();
        loginPage.login("admin","123456");
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }
}
