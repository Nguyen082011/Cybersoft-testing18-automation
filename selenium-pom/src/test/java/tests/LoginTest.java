package tests;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.config.ConfigReader;

import java.io.InputStreamReader;
import java.util.Objects;

public class LoginTest extends BaseTest{
    record LoginData(String username, String password, boolean success){}
//    @dataProvider: Testng lấy thông tin data rồi chạy test data đó
//    b1: viết function đọc data.json
//    Object[][] là data type mà testng hiểu được
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider(){
//        đọc json
        InputStreamReader reader=new InputStreamReader(
                LoginTest.class.getResourceAsStream("/LoginData.json")
        );
//        Gson biến json => object LoginData
        LoginData[] list=new Gson().fromJson(reader,LoginData[].class);
        Object[][] dataLogin=new Object[list.length][1];
        for (int i=0; i<list.length; i++)
            dataLogin[i][0]=list[i];
        return dataLogin;
    }
//    b2: load data vào test case
    @Test(dataProvider = "loginData")
    public void testLoginData(LoginData data)throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(data.username(), data.password());
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), data.success());
    }
    @Test(description = "Test Login Success")
    public void testLoginSuccess() throws InterruptedException {
//        tạo object LoginPage
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.open();
        loginPage.login(ConfigReader.get("username"),ConfigReader.get("password"));
//        so sánh expected với actual
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
    }
}
