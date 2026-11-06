package pages;

import org.openqa.selenium.By;

class airbnbHomePage {

    // 1 Logo CyberSoftbnb (Airbnb) góc trên bên trái
    public static By logoAirbnb = By.xpath("//a[@id='logo' or contains(@class,'logo')]//span[contains(text(),'airbnb')] | //a[contains(@href,'/')]/*[local-name()='svg']");

    // 2 Link menu điều hướng "Home" trên Header
    public static By menuHome = By.xpath("//a[contains(@class,'nav-link') and text()='Home'] | //ul[contains(@class,'navbar')]//a[text()='Home']");

    // 3 Link menu điều hướng "About" trên Header
    public static By menuAbout = By.xpath("//a[contains(@class,'nav-link') and text()='About'] | //ul[contains(@class,'navbar')]//a[text()='About']");

    // 4 Icon User profile ở góc trên bên phải
    public static By iconUserProfile = By.xpath("//button[contains(@class,'user-profile')] | //div[contains(@class,'header__right')]//i[contains(@class,'user')] | //div[@id='dropdownMenuButton']");

    // 5 Ô chọn "Địa điểm / Bạn sắp đi đâu?"
    public static By blockSearchLocation = By.xpath("//div[contains(text(),'Địa điểm') or contains(text(),'Bạn sắp đi đâu')]//ancestor::div[contains(@class,'search')]");

    // 6 Ô chọn ngày "07/12/2024 - 14/12/2024"
    public static By blockSearchDate = By.xpath("//div[contains(text(),'07/12/2024') or contains(@class,'date')]//ancestor::div[contains(@class,'search')]");

    // 7 Nút Tìm kiếm (Icon kính lúp màu hồng)
    public static By btnSearchPink = By.xpath("//button[contains(@class,'search-btn') or .//*[local-name()='svg']]");

    // 8 Nút tăng số lượng khách (+) trong popup
    public static By btnIncreaseGuest = By.xpath("//button[text()='+'] | //span[text()='+']/parent::button");

    // 9 Nút giảm số lượng khách (-) trong popup
    public static By btnDecreaseGuest = By.xpath("//button[text()='-'] | //span[text()='-']/parent::button");

    // 10 Card điểm đến nổi bật "Hồ Chí Minh"
    public static By cardLocationHoChiMinh = By.xpath("//div[contains(@class,'location-item') and .//span[text()='Hồ Chí Minh']] | //a[.//h3[text()='Hồ Chí Minh']]");

    // 11 Tiêu đề "Cần Thơ" trong thẻ điểm đến Cần Thơ
    public static By txtTitleCanTho = By.xpath("//span[text()='Cần Thơ'] | //h3[text()='Cần Thơ']");

    // 12 Nút lọc "Loại nơi ở" (Filter button)
    public static By btnFilterRoomType = By.xpath("//button[text()='Loại nơi ở'] | //span[text()='Loại nơi ở']/parent::button");

    // 13 Nút lọc "Giá" (Filter button)
    public static By btnFilterPrice = By.xpath("//button[text()='Giá'] | //span[text()='Giá']/parent::button");

    // 14 Đoạn text "6.5 giờ lái xe" trong thẻ Nha Trang
    public static By txtNhaTrangDriveTime = By.xpath("//div[.//span[text()='Nha Trang']]//span[contains(text(),'6.5 giờ lái xe')] | //span[text()='6.5 giờ lái xe']");

}
