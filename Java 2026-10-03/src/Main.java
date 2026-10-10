import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    ôn mô hình 3 khối
//    bài 1: tìm chu vi và dện tích hình chữ nhật
    public static void chuViDienTich(float dai, float rong) {
//        fail first
//        th1: dai,rong > 0
        if (dai < 0 || rong < 0) {
            System.out.println("Chieu dai, chieu rong khong am");
            return;
        }
        float chuVi = 2*(dai + rong);
        float dienTich = dai * rong;
//        output: in chuvi và dientich
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }

    //    bài 2: tìm số lớn nhất trong 3 số
//        input: 3 số nguyên
//        output: số lớn nhất
//        -int num1, int num2, int num3
//        - int maximum
//        process: dùng flag
//        chọn 1 số bất kỳ làm số lớn nhất, thường là số đầu tiên
//        so sánh các số sau đó với số đầu tiên
//        nêu lớn hơn thì lớn nhất, còn không thì đi
    public static void soLonNHat() {
        int num1 = 4;
        int num2 = 5;
        int num3 = 2;
        int maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > num2) {
            maximum = num3;
        }
        System.out.println("So lon nhat:" + maximum);

    }
    //    bài 3: kiểm tra học lực của học sinh dựa vào điểm trung bình
//    input: diem trung binh
//    output: hoc luc
//    process:
    public static void hocLuc(float diemTrungBinh) {
//        float diemTrungBinh = 6;
        if (diemTrungBinh < 0 || diemTrungBinh > 10){
            System.out.println("Diem khong hop le");
            return;
        }
        if (9<=diemTrungBinh && diemTrungBinh<=10){
            System.out.println("Gioi");
        } else if (6.5<=diemTrungBinh && diemTrungBinh<8) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
        System.out.println("Bai 3: danh gia hoc luc");
    }
    //    bài 4: tính tiền điện
//    bậc 1: 1-50kWh -> 1000
//    bậc 2: 51-100 -> 2000
//    bậc 3: 101-200 -> 2500
//    bậc 4: 3000
    public static void tinhTienDien(float soKWh){
        if (soKWh <0){
            System.out.println("Khong hop le");
            return;
        }
        int tienDien=0;
        double roundsoKWh = Math.ceil(soKWh);
        if (soKWh<=50){
            tienDien = (int) (1000*roundsoKWh);
        } else if (51<= roundsoKWh && roundsoKWh<=100) {
            tienDien = (1000*50) + (int)(2000*(soKWh-50));
        } else if (101<=roundsoKWh && roundsoKWh<=200) {
            tienDien = (1000*50) + (2000*50) + (int)(2500*(roundsoKWh-100));
        } else {
            tienDien = (1000*50) + (2000*50) + (2500*100) + (int)(3000*(roundsoKWh-200));
        }
        System.out.println("Tien dien:" + tienDien);
    }

//    loop
//    bài 1: in số từ 1->100
    public static void inSo(){
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }
    }
//    bài 2: in số chẵn từ 1->100
    public static void inSoChan(){
        for (int i=1; i<=100; i+=2){
            System.out.println(i);
        }
    }
//    bài 3: tính tổng từ 1->300
    public static void sum1To300() {
        int sum = 0;
        for (int i = 1; i <= 300; i++) {
            sum += 1;
        }
        System.out.println("Tong tu 1 den 300:" + sum);
    }
//    bài 4: in bảng cửu chương 5
    public static void cuuChuong5(){
//        bắt đầu vòng lặp: i = 1
//        dừng: i <= 10
//        bước nhảy: i++
        for (int i=1; i<=10; i++) {
            System.out.println("5 x " + i + "=" + (5*i));
        }
    }
//    bài 5: tính giai thừa của n
//    n! = n * (n-1) * (n-2) * ... * 2 * 1
    public static void giaiThua(int n) {
//        bắt đầu: i=1
//        dừng: i<=n
//        bước nhảy: i++
        if (n <= 1){
            System.out.println("n khong hop le");
            return;
        }
        int result = 1;
        for (int i=1; i<=n; i++){
            result *= i;
        }
        System.out.println("Giai thua cua n:" + result);
    }
//    bài 6: in n số fibonaci. n=5 (1 1 2 3 5)
//    bắt đầu lặp: i=1
//    dừng: i <= n
//    bước nhảy: i++
    public static void fibonaci(int n){
        int pre1 = 0;
        int pre2 = 1;
        for (int i=1; i<=n; i++){
            System.out.println(pre1 + " ");
            int next = pre1+pre2;
            pre1 = pre2;
            pre2 = next;
        }
    }



    public static void main(String[] args) {
//        bài 1: tinh chu vi, diện tích
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1: Tinh chu vi, dien tich hinh chu nhât");
        System.out.println("Nhap chieu dai:");
//        phai parse tu string -> number vi sau nay se nhan ca so va chu
        float dai = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap chieu rong:");
        float rong = Float.parseFloat(sc.nextLine());
//        goi ham chuViDienTich
        chuViDienTich(dai, rong);
        soLonNHat();
        hocLuc(6);
        System.out.println("Nhap so dien tieu thu:");
        tinhTienDien(113);
    }

}