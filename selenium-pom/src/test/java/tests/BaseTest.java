package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.config.ConfigReader;

import java.time.Duration;

//BaseTest là môi trường để thiết lập môi trường chạy test
public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
//    hàm setUp môi trường test
    @BeforeMethod(alwaysRun =true)
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        cấu hình giao diện chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-start maximized");
        driver=new ChromeDriver(options);
        int timeout= Integer.parseInt(ConfigReader.get("timeout"));
        wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

//    hàm tearDown môi trường sau khi chạy test
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver !=null){
            driver.quit();
        }
    }
//    vì các page con đều cần login nên define login trong class cha
    protected void loginAsAdmin()throws InterruptedException{
        LoginPage loginPage=new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }
}
