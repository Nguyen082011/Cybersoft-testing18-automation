package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
//    <a data-v-6475d26d="" class="oxd-main-menu-item active" href="/web/index.php/admin/viewAdminModule">
    private static final By MenuAdmin= By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
//    //span[text()='Admin']
//    //a[.//span[text()='Admin']] -> tìm tất cả thẻ a có trong page
//    . -> chính thẻ a đang xét
//    .//span -> tìm tất cả các thẻ span trong a
    public DashboardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent(){
        WebElement menuAdmin=driver.findElement(MenuAdmin);
        return menuAdmin.isDisplayed();
    }
}
