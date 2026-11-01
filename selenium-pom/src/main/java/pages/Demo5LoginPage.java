package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5LoginPage extends BasePage{
    private static final By UserIcon=By.xpath("//img[@class='h-10']");
    private static final By LoginIcon =By.xpath("(//button[text()='Đăng nhập'])[1]");
    private static final By EmailInput=By.id("email");
    private static final By PasswordInput=By.id("password");
    private static final By LoginButton=By.xpath("//button[@type='submit' and text() ='Đăng nhập']");
    private static final By SuccessToast=By.xpath("//div[@class='ant-message-notice-content']");

    public Demo5LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void open(){
        driver.get("https://demo5.cybersoft.edu.vn/");
//        vì truy cập page cần test cần có thời gian nên cần delay
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserIcon));
    }
    public void login(String email, String password){
        WebElement userIcon= driver.findElement(UserIcon);
        userIcon.click();
        WebElement loginIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginIcon));
        loginIcon.click();
        WebElement emailInput= wait.until(ExpectedConditions.visibilityOfElementLocated(EmailInput));
        emailInput.sendKeys(email);
        WebElement passwordInput= driver.findElement(PasswordInput);
        passwordInput.sendKeys(password);
        WebElement loginButton= driver.findElement(LoginButton);
        loginButton.click();
    }

    public boolean isSuccessLogin(){
        WebElement successToast=wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessToast));
        return successToast.isDisplayed();
    }
}
