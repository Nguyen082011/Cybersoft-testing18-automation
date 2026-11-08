package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CyberbnbResisterPage extends BasePage {
    private static final By USER_IMG = By.xpath("//img[@class='h-10']");
    private static final By REGISTER_BTN = By.xpath("(//button[text()='Đăng ký'])[1]");
    private static final By NAME_INPUT = By.id("name");
    private static final By EMAIL_INPUT = By.id("email");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By PHONE_INPUT = By.id("phone");
    private static final By DOB_INPUT = By.id("birthday");
    // Ý tưởng viết xpath cho date picker (ant-design):
    // - Input #birthday là readonly nên chỉ click để mở lịch, không gõ được.
    // - Lịch chỉ hiện 1 popup duy nhất, nên chỉ cần bám vào class riêng của từng nút
    //   (class có tên rõ nghĩa: "year-btn" = nút năm, "super-prev-btn" = nút lùi 10 năm),
    //   không cần đi từ thẻ cha dài dòng xuống.
    // - Dùng contains(@class, ...) với phần tên ngắn thay vì chép cả chuỗi class dài.
    private static final By DOB_YEAR_BTN = By.xpath("//button[contains(@class,'year-btn')]");
    private static final By DOB_DECADE_PREV_BTN = By.xpath("//button[contains(@class,'super-prev-btn')]");
    private static final By GENDER_SELECT = By.xpath("//div[@class='ant-select-selector']");

    public CyberbnbResisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void open() {
        driver.get("https://demo5.cybersoft.edu.vn");

        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_IMG));
    }

    public void register(String name,
                         String email,
                         String phone,
                         String password,
                         String dob,
                         String gender) throws InterruptedException {
        WebElement userImg = driver.findElement(USER_IMG);
        userImg.click();

        WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(REGISTER_BTN));
        registerBtn.click();

        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(NAME_INPUT));
        nameInput.sendKeys(name);

        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_INPUT));
        emailInput.sendKeys(email);

        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(PHONE_INPUT));
        phoneInput.sendKeys(phone);

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_INPUT));
        passwordInput.sendKeys(password);

        selectDateOfBirth(dob);

        WebElement genderSelect = driver.findElement(GENDER_SELECT);
        genderSelect.click();

        By genderOptionLocator = By.xpath("//div[@class='ant-select-item-option-content' and text()='" + gender + "']");
        WebElement genderOption = wait.until(ExpectedConditions.elementToBeClickable(genderOptionLocator));
        genderOption.click();
        Thread.sleep(3000);
    }

    /**
     * Chọn ngày sinh trên ant-design date picker (input readonly nên không sendKeys được).
     * @param dob định dạng dd/MM/yyyy, ví dụ 15/05/1999
     */
    public void selectDateOfBirth(String dob) {
        String[] parts = dob.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        wait.until(ExpectedConditions.elementToBeClickable(DOB_INPUT)).click();

        // Mở bảng chọn năm, lùi từng thập kỷ cho tới khi thấy năm cần chọn
        wait.until(ExpectedConditions.elementToBeClickable(DOB_YEAR_BTN)).click();
        By yearCell = By.xpath("//td[@title='" + year + "']");
        while (driver.findElements(yearCell).isEmpty()) {
            wait.until(ExpectedConditions.elementToBeClickable(DOB_DECADE_PREV_BTN)).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(yearCell)).click();

        // Ô năm/tháng/ngày đều là <td> có thuộc tính title duy nhất:
        // năm = "1999", tháng = "1999-05", ngày = "1999-05-15"
        // => chỉ cần //td[@title='...'] là trỏ thẳng đúng ô, không cần đếm vị trí hay đọc text.
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@title='" + year + "-" + month + "']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@title='" + year + "-" + month + "-" + day + "']"))).click();
    }
}