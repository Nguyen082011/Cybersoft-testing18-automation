import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ctrl+/
//        1.câu lệnh nhập xuất dữ liệu
//        xuất
        System.out.println("Hello world");
//        biến(variable)
//        <kiểu dữ liệu><tên biến> = <giá trị mặc định>;
//        quy tắc đặt tên biến: camel case
//        Vd: soNguyen, hocSinh, ...
        int num1 = 10;
        System.out.println(num1);
        float num2 = 10.5f;
        boolean isActive = true;
        System.out.println(isActive);
        char ch = 'a';
        String str = "Hello world";
        System.out.println(str);

//        2.các toán tử
//        2.1. phép toán: + - * /(chia lấy nguyên), %(lấy dư)
        int number1 =10;
        int number2 =20;
        int result = number1 + number2;
        System.out.println("Tổng 2 số nguyên =" +result);
//        ++ là tăng thêm 1 đơn vị (number1 = number1 + 1)
        int number3 = number1++; //gán number1 vào number3, sau tăng number1 lên 1 đơn vị
        System.out.println("number3=" + number3);
        System.out.println("number1=" + number1);
        int number4 = ++number2; //tăng number2 thêm 1 đơn vị, sau gán giá trị number2 vào number4
        System.out.println("number4=" + number4);
        System.out.println("number2=" + number2);
//        phép - giống phép +
        number1 +=10; //number1=number1+10
        number1 -=10; //number1=number1-10
        number1 = number2 + 10; //ghi đầy đủ
//        phép * không có number1** và **number1
        number1 *=10;
//        phép / không có number1// và //number1
        number1 /=10;
        number1 %=10;
//        hằng số(constant) -> biến lưu giá trị không đổi
        final int timeout = 1000; //timeout=10 -> sai => địa chỉ web, locator, timeout
//        2.2. so sánh: > >= < <= == != !(phủ định)
//        kết quả trả về -> boolean
        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;
//        đi kèm condition statement, loop statement
//        2.3. nối nhiểu điểu kiện: &&, ||
//        kết quả trả về -> boolean
        boolean isCheck = (10 > 5) && (10 < 20);
//        true khi cả 2 hoặc nhiều điều kiện đều true
        boolean isCheck2 = (10 > 5) || (10 < 20);
//        chỉ false khi 2 hoặc nhiều điều kiện cùng false

//        3.nhập dữ liệu -> nhập dữ liệu từ bàn phím
//        scanner
        Scanner sc = new Scanner(System.in);
//        nhập số nguyên
//        next ...=> hàm bất dồng bộ, bắt user nhập giá trị từ bàn phím và enter rồi mới xử lý
//        gọi API -> bất dồng bộ
//        System.out.println("Nhập số nguyên:");
//        int number5 = sc.nextInt();
//        System.out.println("So nguyen ban nhap:" + number5);
//
//        System.out.println("Nhập số thực:");
//        float number6 = sc.nextFloat();
//        System.out.println("So thuc ban nhap:" + number6);
//
//        sc.nextLine(); //bypass buffer
//        System.out.println("Nhập chuỗi:");
//        String str1 = sc.nextLine();
//        System.out.println("Chuoi ban nhap:" + str1);

//        vừa nhập số nguyên, vừa nhập chữ
//        nhập chữ rồi convert số kiểu tương ứng
        System.out.println("Nhập số nguyên:");
        int number5 = Integer.parseInt(sc.nextLine());
        System.out.println("So ban nhap la:" + number5);

        System.out.println("Nhập số thực:");
        float number6 = Float.parseFloat(sc.nextLine());
        System.out.println("So ban nhap la:" + number6);

        System.out.println("Nhập chuỗi:");
        String str1 = sc.nextLine();
        System.out.println("Chuoi ban nhap la:" + str1);

//        khai báo mảng
//        mảng số nguyên
//        <kiểu dữ liệu>[] <tên biến> = new <kiểu dữ liêu>[<số lượng phẩn tử>];
//        <kiểu dữ liệu>[] <tên biến> = {ele1, ele2,...};
//        int[] arr = new int[s];
//        int[] arr = {1, 2, 3, 4, 5, 6};
        String[] danhSachTen = {"Nguyen", "HIeu", "Tran"};
        System.out.println(danhSachTen[0]);
        System.out.println(danhSachTen[2]);
        int lengthDSTEN = danhSachTen.length;
        System.out.println(danhSachTen[lengthDSTEN - 1]);

//        condition statement
//        comdition thiếu
//        if (<điều kiện>) {
//            logic code
//        }
//        condition đủ (if-else)
//        if (<điều kiện>) {
//          logic code
//        } else {
//          logic code
//        }

//        gọi hàm kiểm tra điểm thi
        kiemTraDiemThi();
//
//        bài 2: tìm số lớn nhất trong 3 số 4, 8, 2.
    }

//    tạo hàm xử lý code liên quan tới kiểm tra diểm thi
//    <phạm vi truy cập hàm> static <kiểu dữ liệu> <ten ham>(<các tham số>){
//      code trong đây
//    }
    public static void kiemTraDiemThi() {
        Scanner sc = new Scanner(System.in);
        //        bài 1: kiểm tra điểm thi đại học. Nếu dưới điểm chuẩn là fail
//        mô hình 3 khối: input(điểm thi, điểm chuẩn), output(pass/fail), process
        System.out.println("Nhập diểm thi:");
        int diemThi = Integer.parseInt(sc.nextLine());
//        tam thoi skip
//        kiểm tra điều kiện fail trước
//        0 <= diemThi <= 10
//        (0 <= diemThi) && (diemThi <= 10)
        if (diemThi < 0 || diemThi > 10) {
            System.out.println("Diem khong hop le");
        }

        System.out.println("Nhập điểm chuẩn:");
        int diemChuan = Integer.parseInt(sc.nextLine());
        if (diemChuan < 0 || diemChuan > 10) {
            System.out.println("Diem khong hop le");
        }

        if (diemThi >= diemChuan) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}