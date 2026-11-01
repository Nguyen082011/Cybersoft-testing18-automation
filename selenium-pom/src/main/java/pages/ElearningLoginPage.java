package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElearningLoginPage extends BasePage{
    private static final By TaiKhoanInput = By.xpath("//div[contains(@class,'sign-in-container')]//input[@name='taiKhoan']");
    private static final By MatKhauInput = By.xpath("//div[contains(@class,'sign-in-container')]//input[@name='matKhau']");
    private static final By DangNhapBTN = By.xpath("//div[contains(@class,'sign-in-container')]//button[text()='Đăng nhập']");

    public  ElearningLoginPage(WebDriver driver, WebDriverWait wait) {super( driver,wait);}

    public void open(){
        driver.get("https://demo2.cybersoft.edu.vn/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(TaiKhoanInput));
    }
    public void login(String username, String password) {
        WebElement taiKhoanInput=driver.findElement(TaiKhoanInput);
        taiKhoanInput.sendKeys(username);
        WebElement matKhauInput=driver.findElement(MatKhauInput);
        matKhauInput.sendKeys(password);
        WebElement dangNhapBTN=driver.findElement(DangNhapBTN);
        dangNhapBTN.click();
    }
}
