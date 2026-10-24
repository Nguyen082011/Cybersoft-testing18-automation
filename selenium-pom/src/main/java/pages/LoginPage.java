package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
//    <input data-v-1f99f73c="" class="oxd-input oxd-input--active"
//    name="username" placeholder="Username" autofocus="">
//    xpath: rule để tìm locator trên web
//    //input => tìm tất cả các thẻ input trong page
//    //input[@name='username'] => tìm tất cả thẻ input có thuộc tính name với value là username
    private static final By Input_Username=By.xpath("//input[@name='username']");
    private static final By Input_Password=By.xpath("//input[@name='password']");
    private static final By LoginButton=By.xpath("//button[@type='submit']");
//    nếu muốn tìm 1 class trong nhiều class name By.xpath("//button[contain@class='ord button']")
//    css selector => By.cssSelector("button.oxd-button")

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
//    b1: truy cập page login
    public void open(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        fix thêm cho case web hiển thị lâu
//        đợi xuất hiện thẻ
        wait.until(ExpectedConditions.visibilityOfElementLocated(Input_Username));
    }
//    b2:login
//    enterUsername, enterPassword, enterLoginBtn
//    có 2 cách viết
//    c1: tách từng step thành từng function(ưu diểm: dễ thêm log kiểm tra, dễ sửa
//    c2: gom các step chung 1 function
    public void login(String username, String password) throws InterruptedException {
        WebElement usernameInput=driver.findElement(Input_Username);
        usernameInput.sendKeys(username);
        Thread.sleep(2000);
        WebElement passwordInput=driver.findElement(Input_Password);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginButton=driver.findElement(LoginButton);
        loginButton.click();
    }
}
