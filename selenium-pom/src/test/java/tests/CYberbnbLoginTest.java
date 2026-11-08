package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CyberbnbLoginPage;

public class CYberbnbLoginTest extends ParallelBaseTest{
    @Test
    public void loginTest() throws InterruptedException {
        CyberbnbLoginPage loginPage=new CyberbnbLoginPage(getDriver(),getWait());
        loginPage.open();
        loginPage.login("admin@gmail.com","123456");
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.isSuccessLogin());
    }
}
