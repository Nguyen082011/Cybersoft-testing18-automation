package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class MyInfoPage extends BasePage{
    private static final By AvatarImg= By.xpath("//img[@class='employee-image']");
    private static final By UploadBtn=By.xpath("//button[contains(@class,'employee-image')]");
    private static final By FileInput=By.xpath("//button[contains(@class,'employee-image')]");
    private static final By SaveBtn=By.xpath("//button[@type='submit']");
    private static final By SuccessToast=By.id("oxd-toaster_1");

    public MyInfoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
//có 2 cách vo MyInfo page
//    truy cập vào page với đường dẫn trong page đó
//    click vào nút MyInfo trong menu
    public void open() throws InterruptedException {
        By myInfoLocator = By.xpath("//span[text()='My Info']");
        WebElement myInfoMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(myInfoLocator));
        myInfoMenu.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AvatarImg));
    }
    public void uploadAvatar(String imageName) throws InterruptedException {
//        sau khi click xong menu -> đợi xuất hiện AvatarImg
//        elementToBeClickable vì avatarImg có thể click được
        WebElement avatarImg =wait.until(ExpectedConditions.elementToBeClickable(AvatarImg));
        avatarImg.click();

        WebElement uploadBtn=wait.until(ExpectedConditions.elementToBeClickable(UploadBtn));
        uploadBtn.click();
//        WebElement fileInput=wait.until(ExpectedConditions.visibilityOfElementLocated(FileInput));
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(FileInput));
//        Note: vì fileInput Selenium không thể thao tác trực tiếp để tìm file hình
//        sendkey đê truyền đường dẫn tuyệt dôi của hình cần upload
//        lưu hình vào
        String filePath= new File("src/test/resources/image/logo.png").getAbsolutePath();
//        System.out.println(filePath);
        fileInput.sendKeys(filePath);

        Thread.sleep(5000);
        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(SaveBtn));
        saveBtn.click();
    }
    public boolean isSuccessUpload(){
        WebElement successToast=wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessToast));
        return successToast.isDisplayed();
    }
}
