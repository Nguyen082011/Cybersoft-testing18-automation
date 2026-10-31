package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage{
//    <a data-v-6475d26d="" class="oxd-main-menu-item active" href="/web/index.php/admin/viewAdminModule">
    private static final By MenuAdmin= By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");

//    //span[text()='Admin']
//    //a[.//span[text()='Admin']] -> tìm tất cả thẻ a có trong page
//    . -> chính thẻ a đang xét
//    .//span -> tìm tất cả các thẻ span trong a
    private static final By AdminHeader=By.xpath("//h6[text()='Admin']");

    private static final By UserDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private static final By LogOutBtn = By.xpath("//a[@href='web/index.php/auth/logout']");
    public DashboardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent()throws InterruptedException{
        boolean checkLocator=true;
        WebElement menuAdmin=driver.findElement(MenuAdmin);
        if (!menuAdmin.isDisplayed()){
            checkLocator = false;
            System.out.println("Không thấy menu Admin");
            return checkLocator;
        }

        menuAdmin.click();
        WebElement adminHeader=wait.until(ExpectedConditions.visibilityOfElementLocated(AdminHeader));
        if (!adminHeader.isDisplayed()){
            checkLocator=false;
            System.out.println("Không tìm thấy Admin Header");
        }
        Thread.sleep(2000);
        return checkLocator;

//        return menuAdmin.isDisplayed();
    }

    public void logout(){
        WebElement userDropDown=wait.until(ExpectedConditions.visibilityOfElementLocated(UserDropDown));
        userDropDown.click();
        WebElement logoutBtn=wait.until(ExpectedConditions.elementToBeClickable(LogOutBtn));
        logoutBtn.click();
    }
}
