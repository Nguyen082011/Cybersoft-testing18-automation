import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Trong Selenium
//POM-page object module pattern
//Vd: LoginPage: -locator(thẻ HTML trên page đó); -loginBtn, usernameInout, passwordInput, logo, label,...
//-thuộc tính (clickLoginBtn(), fillUsername(), fillPassword()
//viết test case => tạo class để chứa các test case page đó(Login Test)
//tửng test case tương ứng với từng function của class LoginTest
//class để tương tác với page đó
public class Main {
    public static void main(String[] args) {
//        tạo object Student
       Student hs1 = new Student();
//        hs1.id = "123456";
//        hs1.age = 20;
//        hs1.email = "@gmail.com";
//        hs1.name = "Nhan";
//        hs1.gender = "Nam";
//        System.out.println(hs1.id);
//        System.out.println(hs1.age);
//        System.out.println(hs1.email);
//        System.out.println(hs1.name);
//        hs1.input();
//        hs1.display();
        System.out.println("=======");
        Student hs2 = new Student();
//        hs2.input();
//        hs2.display();
        Student hs3 = new Student("3", "C", 20, "HCM", "789", "C", "Nu");

//        tạo mảng học sinh
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(hs1);
        listStudent.add(hs2);
        listStudent.add(hs3);
//        for (Student student: listStudent){
//            student.display();
//            System.out.println("======");
//        }

        System.out.println("Ví dụ automation test");
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "123456");
//        TODO: function để kiểm tra result thực tế với result mong đợi
        if (loginPage.isLoginSucess()){
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }

//        Note: 1.không được dùng class cha vì class cha CHỈ ĐỂ KẾ THỪA
        Car mec = new Car("1", "Maybach", "2025", "black", 4, "gasoline");
        mec.display();

//       vehicle vehicle=new Vehicle(); -> vehicle không dùng được do dang dùng class cha
    }
}