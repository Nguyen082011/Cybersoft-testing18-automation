package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test(description = "Test Login Success")
    public void testLoginSuccess() throws InterruptedException {
//        tạo object LoginPage
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login("admin", "admin123");
//        so sánh expected với actual
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
    }
}
