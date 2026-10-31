package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseTest{
    @BeforeMethod
    public void PreCondition() throws InterruptedException{
        loginAsAdmin();
    }
    @Test(description = "Find locator")
    public void findLocator() throws InterruptedException{
//        LoginPage loginPage=new LoginPage(driver, wait);
//        loginPage.open();
//        loginPage.login("Admin", "admin123");
//        vì từ login đến dashboard mất thời gian load trang dashboard
//        thêm delay
//        Thread.sleep(10_000);
//        wait.until(ExpectedConditions.urlContains(("dashboard")));
//        wait 1 trong các element
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));
        DashboardPage dashboardPage=new DashboardPage(driver, wait);
        Assert.assertTrue(dashboardPage.isElementPresent());
    }

    @Test(description = "Logout")
    public void logout(){
        DashboardPage dashboardPage=new DashboardPage(driver,wait);
        dashboardPage.logout();
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}
