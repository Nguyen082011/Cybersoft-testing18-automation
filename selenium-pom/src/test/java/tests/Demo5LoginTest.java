package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Demo5LoginPage;

public class Demo5LoginTest extends BaseTest{
    @Test
    public void loginTest() throws InterruptedException {
        Demo5LoginPage loginPage=new Demo5LoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin@gmail.com","123456");
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.isSuccessLogin());
    }
}
