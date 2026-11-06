package pages;

import org.openqa.selenium.By;

public class hrmAdminPage {

    // 1 Menu "Admin" (Sidebar bên trái)
    public static By menuAdmin = By.xpath("//span[text()='Admin']/parent::a");

    // 2 Menu "PIM" (Sidebar bên trái)
    public static By menuPim = By.xpath("//span[text()='PIM']/parent::a");

    // 3 Menu "Leave" (Sidebar bên trái)
    public static By menuLeave = By.xpath("//span[text()='Leave']/parent::a");

    // 4 Ô input nhập "Username" (Form tìm kiếm)
    public static By txtUsername = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");

    // 5 Dropdown "User Role" (Form tìm kiếm)
    public static By dropdownUserRole = By.xpath("//label[text()='User Role']/ancestor::div[contains(@class,'oxd-input-group')]//div[@class='oxd-select-wrapper']");

    // 6 Option "Admin" trong dropdown User Role
    public static By optUserRoleAdmin = By.xpath("//div[@role='listbox']//span[text()='Admin']");

    // 7 Option "ESS" trong dropdown User Role
    public static By optUserRoleEss = By.xpath("//div[@role='listbox']//span[text()='ESS']");

    // 8 Ô input nhập "Employee Name"
    public static By txtEmployeeName = By.xpath("//label[text()='Employee Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");

    // 9 Nút "Reset" (Form tìm kiếm)
    public static By btnReset = By.xpath("//button[text()=' Reset ']");

    // 10 Nút "Search" (Form tìm kiếm)
    public static By btnSearch = By.xpath("//button[text()=' Search ']");

    // 11 Menu Top tab "User Management"
    public static By menuTopTabUserManagement = By.xpath("//span[contains(@class, 'oxd-topbar-body-nav-tab-item') and contains(., 'User Management')]");

    // 12 Checkbox dòng thứ 2 (User "bala22")
    public static By chkRow2 = By.xpath("(//div[@class='oxd-table-card'])//div[contains(@class, 'oxd-table-card-cell-checkbox')]//span");

    // 13 Ô giá trị User Role ("ESS") ở dòng thứ 2
    public static By cellUserRoleRow2 = By.xpath("(//div[@class='oxd-table-card'])/div[@role='row']/div[@role='cell']");

    // 14 Nút icon Xóa (Thùng rác) ở dòng thứ 2
    public static By btnDeleteRow2 = By.xpath("(//div[@class='oxd-table-card'])//button[contains(@class, 'oxd-icon-button') and .//i[contains(@class, 'bi-trash')]]");

    // 15 Nút icon Sửa (Bút chì) ở dòng thứ 2
    public static By btnEditRow2 = By.xpath("(//div[@class='oxd-table-card'])//button[contains(@class, 'oxd-icon-button') and .//i[contains(@class, 'bi-pencil')]]");

    // 16 Tiêu đề cột "User Role" trên header bảng
    public static By colHeaderUserRole = By.xpath("//div[@role='columnheader' and text()='User Role ']");

    // 17 Tiêu đề cột "Employee Name" trên header
    public static By colHeaderEmployeeName = By.xpath("//div[@role='columnheader' and text()='Employee Name ']");

    // 18 Breadcrumb "Admin / User Management"
    public static By breadcrumbAdminUserManagement = By.xpath("//h6[text()='Admin']/following-sibling::span[text()='User Management']");

    // 19 Nút mũi tên tròn thu gọn Sidebar(<)
    public static By btnToggleSidebar = By.xpath("//button[contains(@class, 'oxd-main-menu-button')]");

    // 20 Nút icon chevron thu gọn panel System Users
    public static By btnToggleFilterPanel = By.xpath("//div[contains(@class, 'oxd-table-filter-header')]//button[contains(@class, 'oxd-icon-button')]");

    // 21 Nút "+ Add" thêm người dùng mới
    public static By btnAddUser = By.xpath("//button[text()=' Add ']");

}
