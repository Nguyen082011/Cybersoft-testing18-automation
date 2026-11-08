package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ParallelBaseTest {
//   để chạy song song test case dùng object ThreadLocal
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();

    protected WebDriver getDriver() {
        return driver.get();
    }
    protected WebDriverWait getWait() {
        return wait.get();
    }

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver d = new ChromeDriver(options);
        driver.set(d);
        WebDriverWait w= new WebDriverWait(d, Duration.ofSeconds(30));
        wait.set(w);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
            wait.remove();
        }
    }
}
