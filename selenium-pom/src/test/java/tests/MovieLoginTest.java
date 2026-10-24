package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MovieLoginPage;

public class MovieLoginTest extends BaseTest{
    @Test(description = "Test Login Success")
    public void testLoginSuccess() throws InterruptedException {
        MovieLoginPage MovieLoginPage = new MovieLoginPage(driver,wait);
        MovieLoginPage.open();
        MovieLoginPage.login("testing20", "123456");
        }
}
