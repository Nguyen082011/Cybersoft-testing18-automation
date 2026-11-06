package pages;

import org.openqa.selenium.By;

public class amazonSearchResultPage {

    // 1 Ảnh sản phẩm thứ 3 (Mens Runfalcon 6 - giày đen 3 sọc)
    public static By imgProduct3 = By.xpath("(//div[@data-component-type='s-search-result'])[3]//img[contains(@class,'s-image')]");

    // 2 Giá tiền sản phẩm thứ 4 ($53.00 - Men's Tricot Track Suit)
    public static By txtPriceProduct4 = By.xpath("(//div[@data-component-type='s-search-result'])[4]//span[@class='a-price']");

    // 3 Giá tiền sản phẩm thứ 2 ($79.95 - Women's VL Court)
    public static By txtPriceProduct2 = By.xpath("(//div[@data-component-type='s-search-result'])[2]//span[@class='a-price']");

    // 4 Ô input tìm kiếm chính đang chứa chữ "adidas"
    public static By txtSearchInput = By.id("twotabsearchtextbox");

    // 5 Icon Giỏ hàng (Cart) trên Header Amazon
    public static By btnCartHeader = By.id("nav-cart");

    // 6 Menu điều hướng "Today's Deals"
    public static By menuTodaysDeals = By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_gb') or text()=\"Today's Deals\"]");

    // 7 Nút "Add to cart" của sản phẩm đầu tiên
    public static By btnAddToCartProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//button[text()='Add to cart']");

    // 8 Tên sản phẩm 2 "Women's VL Court 3.0 Sneakers"
    public static By txtProductTitle2 = By.xpath("(//div[@data-component-type='s-search-result'])[2]//h2//span");

    // 9 Dòng "1K+ bought in past month" của sản phẩm 1
    public static By txtBoughtPastMonthProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[contains(text(),'bought in past month')]");

    // 10 Nhãn thương hiệu "adidas" của sản phẩm đầu tiên
    public static By txtBrandProduct1 = By.xpath("(//div[@data-component-type='s-search-result'])[1]//span[contains(@class,'s-label-text') and text()='adidas']");

    // 11 Khu vực "Results" (header section kết quả tìm kiếm)
    public static By sectionResultsHeader = By.xpath("//span[text()='Results'] | //div[contains(@class,'s-result-list-placeholder')]");

    // 12 Checkbox lọc "Men" trong nhóm Gender (sidebar trái)
    public static By chkGenderMen = By.xpath("//span[text()='Gender']/ancestor::div[contains(@class,'s-navigation-group')]//span[text()='Men']/preceding-sibling::div//input | //span[text()='Men']/ancestor::a");

    // 13 Thanh kết quả "1-48 of over 10,000 results for 'adidas'"
    public static By txtResultBar = By.xpath("//span[contains(text(),'results for') or contains(@class,'s-breadcrumb')]");

    // 14 Link "See more" trong sidebar lọc
    public static By linkSeeMoreSidebar = By.xpath("//span[text()='Brands']/ancestor::div[contains(@class,'s-navigation-group')]//span[text()='See more']");

}
