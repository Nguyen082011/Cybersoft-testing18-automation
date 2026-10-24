package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieLoginPage extends BasePage {
    private static final By Input_Taikhoan=By.xpath("//input[@id='taiKhoan']");
    private static final By Input_MatKhau=By.xpath("//input[@id='matKhau']");
    private static final By DangNhap=By.xpath("//button[@type='submit']");

    public MovieLoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
//    truy cập trang đăng nhập
    public void open(){
        driver.get("https://demo1.cybersoft.edu.vn/sign-in");
//        fix thêm cho case web hiển thị lâu
//        đợi xuất hiện thẻ
        wait.until(ExpectedConditions.visibilityOfElementLocated(Input_Taikhoan));
    }

    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput= driver.findElement(Input_Taikhoan);
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        WebElement passwordInput=driver.findElement(Input_MatKhau);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginButton=driver.findElement(DangNhap);
        loginButton.click();
    }

}