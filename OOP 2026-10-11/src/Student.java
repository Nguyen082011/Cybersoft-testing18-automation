import java.util.Scanner;

//public thể hiện phạm vi truy cập của đối tượng
//private những nơi khác sẽ không thể truy cập được
//protected
public class Student {
//    liệt kệ các thuôc tính(biến) của object
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;
//    hàm khởi tạo object
//    Note: nếu không có hàm khởi tạo => java tự tạo hàm khởi tạo mặc định-> dừng từ khóa new để tạo object
//    nếu hàm khởi tạo không có tham số.
    public Student(){
//        trong hàm không có logic code => gán giá trị mặc định cho từng thuộc tính

    }
//Note: nếu tạo hàm khởi tạo có tham số => bắt buộc phải truyền
    public Student(String id,
                   String name,
                   int age,
                   String address,
                   String phone,
                   String email,
                   String gender){
//        phân biệt tên của các thuộc tính và tên của tham số => this để phân biệt
//        nếu khác tên => không cần this
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }
//    liệt kệ các phương thức(function)
//    hàm nhập giá trị của object
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ma hs: ");
//        id = sc.nextLine();
//        System.out.println("Nhap ten hs: ");
//        name = sc.nextLine();
//        System.out.println("Nhap tuoi hs: ");
//        age = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhap dia chi: ");
//        address = sc.nextLine();
//        System.out.println("Nhap so dien thoai: ");
//        phone = sc.nextLine();
//        System.out.println("Nhap email: ");
//        email = sc.nextLine();
//        System.out.println("Nhap gioi tinh: ");
//        gender = sc.nextLine();
//    }
//    public void display(){
//        System.out.println("Mã hs: " + id);
//        System.out.println("Tên học sinh: " + name);
//        System.out.println("Tuổi học sinh: " + age);
//        System.out.println("Email: " + email);
//        System.out.println("Địa chỉ học sinh: " + address);
//        System.out.println("Số điện thoại: " + phone);
//        System.out.println("Giới tinh: " + gender);
//    }
}
