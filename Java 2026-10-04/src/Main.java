//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    input: 1 số nguyên
//    output: số nguyên tố -> true/false
//    bắt đầu: i=2
//    dừng: i <= n-1; bước nhảy: i++
//    TH1: n < 2 => not số nguyên tố
//    TH2: n == 2 => số nguyên tố
//    TH3: normal
//    nếu n / 1 == 0 => not nguyên tố -> dừng
//    ngợc lại -> đi tiếp
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        if (number == 2){
            return true;
        }
//        for (int i=2; i <= number - 1; i++){
//            if (number % i == 0){
//                return false;
//            }
//        }

        int i=2;
        while(i <= number - 1){
            if (number % i == 0){
                return false;
            }
            i++;
        }

//        duyệt tới number-1 mà vẫn ko chia hết->là số nguyên tố
        return true;
    }

//    input: int number
//    output: tổng các chữ số của 1 số -> int
//    process
//    lấy 1234 % 10 = 4, xóa 4 ra khỏi 1234 -> 1234/10 = 123
//    dừng: number > 0.
    public static int sumDigits(int number){
        int sum = 0;
//        th1: if number<0 -> abs để convert sang số dương
        int numberAbs = Math.abs(number);
        while (numberAbs>0){
            sum += numberAbs % 10;
            numberAbs /=10;
        }
        return sum;
    }

    public static void printArray(int[] listNumber){
        for (int i=0; i < listNumber.length; i++){
            System.out.println(listNumber[i]);
        }
    }
    public static void printChan(int[] listNumber){
//        for truyen thong - duyet theo index
        for (int i=0; i<listNumber.length; i++){
            if (listNumber[i] % 2 == 0){
                System.out.println(listNumber[i]);
            }
        }
//        for cai tien - duyet theo item
        for (int number: listNumber){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }
    public static void printLe(int[] listNumber){
        for (int i=0; i<listNumber.length; i++){
            if (listNumber[i] % 2 != 0){
                System.out.println(listNumber[i]);
            }
        }
    }
    public static void printPrime(int[] listNumber){
        for (int number: listNumber){
            if (isPrime(number)){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
//        bài 1: kiểm tra số có phải là nguyên tố hay không
//        Note: số 2 là số nguyên tố nhỏ nhất
//        kết quả của hàm phải là boolean
        int number= 3;
        boolean check = isPrime(number);
        if (check){ //java tự hiểu check == true
            System.out.println("So " + number + " la so nguyen to");
        } else {
            System.out.println("So " + number + " khong la so nguyen to");
        }
//        bài 2: tính tổng các chữ số của 1 số. Vd: 1234 => 10
//        cách 1: hàm for -> convert number sang string -> dùng function có sẵn của string để đếm số lượng chữ số của 1 số
//        cách 2: hảm while xử lý trực tiếp number
        int number2 = -1234;
        int sum = sumDigits(number2);
        System.out.println("Tong chu so cua " + number2 + " la " + sum);

        int[] listNumber = {5,3,6,8,32,19};
//        bài 3: in các số trong mảng
//        bài 4: in các số chẵn, sổ lẻ trong mảng
//        bài 5: in các số nguyên tố trong mảng
//        function dùng void
//        tham số int[]
        System.out.println("Cac so trong mang ");
        printArray(listNumber);
        System.out.println("Cac so chan trong mang ");
        printChan(listNumber);
        System.out.println("Cac so le trong mang ");
        printLe(listNumber);
        System.out.println("Cac so nguyen to trong mang ");
        printPrime(listNumber);
    }
}