package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//  bài 1: xóa nguyên âm trong chuỗi
//    xử lý nguyên âm
    public static String xoaNguyenAm(String str){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
//            kiểm tra có phải chữ nguyên âm không(cả chữ hoa lẫn thường)
            if (ch != 'a'&& ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                result.append(ch);
            }
        }
        return result.toString();
    }

//    ==========
//    bài 2: tìm giá trị lớn thứ 2 trong mảng
public static int timLonThuHai(int[] arr) {
    // Nếu mảng có ít hơn 2 phần tử, trả về Integer.MIN_VALUE
    if (arr == null || arr.length < 2) {
        return Integer.MIN_VALUE;
    }

    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > max1) {
            max2 = max1; // Giá trị lớn nhất cũ hạ xuống làm lớn thứ hai
            max1 = num;  // Cập nhật giá trị lớn nhất mới
        } else if (num < max1 && num > max2) {
            max2 = num;  // Cập nhật giá trị lớn thứ hai mới
        }
    }
    return max2;
}

// ==========
//    bài 3: tin tổng các số chẵn
public static int tinhTongSoChan(int n) {
    int tong = 0;
    // Duyệt bước nhảy i += 2 để lấy trực tiếp các số chẵn, tối ưu hơn kiểm tra i % 2 == 0
    for (int i = 0; i <= n; i += 2) {
        tong += i;
    }
    return tong;
}

// ==========
//    bài 4: đếm số từ trong 1 chuỗi
public static int demSoTu(String str) {
    // Kiểm tra nếu chuỗi rỗng hoặc null
    if (str == null || str.trim().isEmpty()) {
        return 0;
    }
    // Loại bỏ khoảng trắng thừa ở đầu/cuối và cắt chuỗi theo các nhóm khoảng trắng
    String[] words = str.trim().split("\\s+");
    // Số lượng từ bằng độ dài mảng các từ đã cắt
    return words.length;
}

// ==========
//    bài 5: In chữ cái đầu của mỗi từ
public static String layChuCaiDau(String str) {
    if (str == null || str.trim().isEmpty()) {
        return "";
    }

    // Tách chuỗi thành các từ
    String[] words = str.trim().split("\\s+");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        // Lấy ký tự đầu tiên và chuyển thành chữ in hoa
        char firstChar = Character.toUpperCase(word.charAt(0));
        result.append(firstChar).append(" ");
    }
    // Trả về chuỗi kết quả (dùng trim() để bỏ khoảng trắng thừa ở cuối cùng)
    return result.toString().trim();
}

// ==========
//    bài 6: tin thuế thu nhập
public static double tinhThueThuNhap(double thuNhap) {
    if (thuNhap <= 0) return 0;
    double thue = 0;

    // Bậc 1: Từ 0 đến 5 triệu (5%)
    if (thuNhap <= 5) {
        thue += thuNhap * 0.05;
        return thue;
    } else {
        thue += 5 * 0.05;
    }
    // Bậc 2: Từ 5 đến 10 triệu (10%)
    if (thuNhap <= 10) {
        thue += (thuNhap - 5) * 0.10;
        return thue;
    } else {
        thue += (10 - 5) * 0.10;
    }
    // Bậc 3: Từ 10 đến 18 triệu (15%)
    if (thuNhap <= 18) {
        thue += (thuNhap - 10) * 0.15;
        return thue;
    } else {
        thue += (18 - 10) * 0.15;
    }
    // Bậc 4: Từ 18 đến 32 triệu (20%)
    if (thuNhap <= 32) {
        thue += (thuNhap - 18) * 0.20;
        return thue;
    } else {
        thue += (32 - 18) * 0.20;
    }
    // Bậc 5: Từ 32 đến 52 triệu (25%)
    if (thuNhap <= 52) {
        thue += (thuNhap - 32) * 0.25;
        return thue;
    } else {
        thue += (52 - 32) * 0.25;
    }
    // Bậc 6: Từ 52 đến 80 triệu (30%)
    if (thuNhap <= 80) {
        thue += (thuNhap - 52) * 0.30;
        return thue;
    } else {
        thue += (80 - 52) * 0.30;
        thue += (thuNhap - 80) * 0.35; // Bậc 7: Trên 80 triệu (35%)
    }
    return thue;
}

// ==========
//    bài 7: kiểm tra chuỗi đối xưng
// Hàm kiểm tra chuỗi đối xứng (Palindrome)
public static boolean isPalindrome(String str) {
    // Trường hợp đặc biệt: chuỗi rỗng hoặc chỉ có 1 ký tự luôn là đối xứng
    if (str == null || str.length() <= 1) {
        return true;
    }
    int left = 0;
    int right = str.length() - 1;
    // Chạy con trỏ từ 2 đầu vào giữa để so sánh từng cặp ký tự
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; // Chỉ cần 1 cặp ký tự khác nhau -> Không đối xứng
        }
        left++;
        right--;
    }
    return true; // Tất cả các cặp ký tự đều trùng khớp
}

// ========
//    bài 8: xóa ký tự lặp lại trong chuỗi
public static String removeDuplicates(String str) {
    // Trường hợp chuỗi rỗng hoặc null thì trả về chính nó
    if (str == null || str.length() <= 1) {
        return str;
    }
    StringBuilder result = new StringBuilder();
    // Duyệt qua từng ký tự của chuỗi đầu vào
    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);

        // Kiểm tra xem ký tự hiện tại đã tồn tại trong kết quả chưa
        // Nếu indexOf trả về -1 nghĩa là ký tự này chưa từng xuất hiện
        if (result.indexOf(String.valueOf(currentChar)) == -1) {
            result.append(currentChar); // Thêm ký tự vào kết quả
        }
    }
    return result.toString();
}

// bài 9: Two sum 2-Input array is sorted
// Hàm tìm hai chỉ số có tổng bằng target (chỉ số bắt đầu từ 1)
public static int[] twoSum(int[] numbers, int target) {
    // Khởi tạo hai con trỏ ở hai đầu mảng
    int left = 0;
    int right = numbers.length - 1;

    while (left < right) {
        int currentSum = numbers[left] + numbers[right];
        // Nếu tổng bằng target, trả về mảng kết quả (cộng thêm 1 do đề yêu cầu 1-based index)
        if (currentSum == target) {
            return new int[]{left + 1, right + 1};
        }
        // Nếu tổng nhỏ hơn target, cần tăng số nhỏ hơn lên (dịch con trỏ trái sang phải)
        if (currentSum < target) {
            left++;
        }
        // Nếu tổng lớn hơn target, cần giảm số lớn hơn xuống (dịch con trỏ phải sang trái)
        else {
            right--;
        }
    }
    // Trường hợp không tìm thấy (theo lý thuyết đề bài Two Sum II luôn đảm bảo có 1 đáp án)
    return new int[]{-1, -1};
}

// bài 10: tìm chuỗi con đối xứng dài nhất(Longest Palindromic Substring)
public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) {
        return "";
    }

    int start = 0; // Vị trí bắt đầu của chuỗi con dài nhất tìm được
    int end = 0;   // Vị trí kết thúc của chuỗi con dài nhất tìm được

    for (int i = 0; i < s.length(); i++) {
        // Trường hợp 1: Tâm là 1 ký tự (Chuỗi đối xứng có độ dài lẻ, ví dụ: "aba")
        int len1 = expandAroundCenter(s, i, i);
        // Trường hợp 2: Tâm ở giữa 2 ký tự (Chuỗi đối xứng có độ dài chẵn, ví dụ: "abba")
        int len2 = expandAroundCenter(s, i, i + 1);
        // Lấy độ dài lớn nhất giữa 2 trường hợp
        int maxLen = Math.max(len1, len2);
        // Nếu tìm thấy chuỗi con dài hơn chuỗi hiện tại, cập nhật lại tọa độ start và end
        if (maxLen > end - start) {
            start = i - (maxLen - 1) / 2;
            end = i + maxLen / 2;
        }
    }
    // Cắt và trả về chuỗi con dài nhất (end + 1 vì hàm substring không lấy phần tử cuối)
    return s.substring(start, end + 1);
}
    // Hàm bổ trợ: Mở rộng từ tâm sang hai bên để kiểm tra tính đối xứng
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Trả về độ dài của chuỗi đối xứng tìm được
        return right - left - 1;
    }
//    bài 11:Minimum Window Substring
public static String minWindow(String s, String t) {
    // Trường hợp đặc biệt nếu chuỗi s ngắn hơn chuỗi t thì không thể chứa đủ ký tự
    if (s == null || t == null || s.length() < t.length()) {
        return "";
    }

    // Mảng lưu tần suất xuất hiện các ký tự trong chuỗi t (áp dụng cho bảng mã ASCII mở rộng)
    int[] tCount = new int[256];
    for (int i = 0; i < t.length(); i++) {
        tCount[t.charAt(i)]++;
    }

    // Mảng lưu tần suất ký tự hiện tại trong cửa sổ trượt
    int[] windowCount = new int[256];

    int left = 0; // Con trỏ trái của cửa sổ
    int count = 0; // Đếm số lượng ký tự của t đã được thỏa mãn trong cửa sổ hiện tại

    int minLen = Integer.MAX_VALUE; // Độ dài nhỏ nhất của cửa sổ thỏa mãn
    int minStart = 0; // Vị trí bắt đầu của cửa sổ nhỏ nhất đó

    // Duyệt con trỏ phải để mở rộng cửa sổ
    for (int right = 0; right < s.length(); right++) {
        char rightChar = s.charAt(right);
        windowCount[rightChar]++;
        // Nếu ký tự này có trong t và số lượng trong cửa sổ chưa vượt quá nhu cầu của t
        if (tCount[rightChar] > 0 && windowCount[rightChar] <= tCount[rightChar]) {
            count++;
        }
        // Khi cửa sổ đã chứa đầy đủ tất cả ký tự của t
        while (count == t.length()) {
            int currentWindowLen = right - left + 1;
            // Cập nhật lại cửa sổ nhỏ nhất nếu tìm thấy phương án tốt hơn
            if (currentWindowLen < minLen) {
                minLen = currentWindowLen;
                minStart = left;
            }
            // Thu hẹp cửa sổ bằng cách dịch con trỏ trái sang phải
            char leftChar = s.charAt(left);
            windowCount[leftChar]--;
            // Nếu việc bỏ ký tự bên trái làm mất đi một ký tự cần thiết của t
            if (tCount[leftChar] > 0 && windowCount[leftChar] < tCount[leftChar]) {
                count--; // Cửa sổ không còn hợp lệ, vòng lặp while sẽ dừng lại để mở rộng right tiếp
            }
            left++;
        }
    }
    // Nếu minLen không thay đổi nghĩa là không tìm thấy cửa sổ nào thỏa mãn
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
}

// hàm chạy chương trình
    public static void main(String[] args){
//        Bài 1
        System.out.println("Bài 1");
        String input1="Cybersoft";
        String output1=xoaNguyenAm(input1);
        System.out.println("Input: "+input1+"Output: "+output1);
        String input2 = "hello";
        String output2 = xoaNguyenAm(input2);
        System.out.println("Input: " + input2 + " -> Output: " + output2);
//        Bài 2
        System.out.println("Bài 2");
        int[] ex1={1,3,4,5,0,2};
        System.out.println("Output: "+timLonThuHai(ex1));
        int[] ex2={10,5,10};
        System.out.println("Output: "+timLonThuHai(ex2));
        int[] ex3={3};
        int result3=timLonThuHai(ex3);
        if (result3==Integer.MIN_VALUE){
            System.out.println("Output: Interger.MIN_VALUE");
        } else {
            System.out.println("Output: "+result3);
        }
//        bài 3
        System.out.println("Bài 3");
        int n1 = 10;
        System.out.println("Input: " + n1 + " -> Output: " + tinhTongSoChan(n1));
        int n2 = 5;
        System.out.println("Input: " + n2 + "  -> Output: " + tinhTongSoChan(n2));
//        bài 4
        System.out.println("Bài 4");
        String str1 = "Xin chào các bạn";
        System.out.println("Input: \"" + str1 + "\" -> Output: " + demSoTu(str1));
        String str2 = "Hello World";
        System.out.println("Input: \"" + str2 + "\"       -> Output: " + demSoTu(str2));
//        bài 5
        System.out.println("Bài 5");
        String strInit1 = "Xin chào các bạn";
        System.out.println("Input: \"" + strInit1 + "\" -> Output: \"" + layChuCaiDau(strInit1) + "\"");
        String strInit2 = "Hello World";
        System.out.println("Input: \"" + strInit2 + "\"       -> Output: \"" + layChuCaiDau(strInit2) + "\"");
//        bài 6
        System.out.println("Bài 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (đồng): ");
        if (scanner.hasNextDouble()) {
            double thuNhapDong = scanner.nextDouble();
            if (thuNhapDong < 0) {
                System.out.println("Thu nhập không hợp lệ!");
            } else {
                // Đổi từ đồng sang triệu đồng
                double thuNhapTrieu = thuNhapDong / 1000000.0;
                double thue = tinhThueThuNhap(thuNhapTrieu);
                System.out.printf("Mức thu nhập: %.0f đồng%n", thuNhapDong);
                System.out.printf(
                        "Số thuế phải trả: %.0f đồng%n",
                        thue * 1000000
                );
            }
        } else {
            System.out.println("Vui lòng nhập một số hợp lệ!");
        }
        scanner.close();
//        bài 7
        System.out.println("Bài 7");
        // Test nhanh với 2 ví dụ trong đề bài
        String test1 = "madam";
        String test2 = "hello";
        System.out.println("Input: \"" + test1 + "\" -> Output: " + isPalindrome(test1)); // true
        System.out.println("Input: \"" + test2 + "\" -> Output: " + isPalindrome(test2)); // false
//        bài 8
        System.out.println("Bài 8");
        String input3 = "programming";
        String input4 = "abca";
        System.out.println("Input: \"" + input3 + "\" -> Output: \"" + removeDuplicates(input3) + "\""); // progamin
        System.out.println("Input: \"" + input4 + "\" -> Output: \"" + removeDuplicates(input4) + "\""); // abc
//        bài 9
        System.out.println("Bài 9");
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println("Input: numbers = " + Arrays.toString(numbers) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result)); // [1, 2]
//        bài 10
        System.out.println("Bài 10");
        String input5 = "babad";
        String input6 = "cbbd";
        System.out.println("Input: \"" + input5 + "\" -> Output: \"" + longestPalindrome(input5) + "\""); // "bab" hoặc "aba"
        System.out.println("Input: \"" + input6 + "\" -> Output: \"" + longestPalindrome(input6) + "\""); // "bb"
//        bài 11
        System.out.println("Bài 11");
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result1 = minWindow(s, t);
        System.out.println("Input: s = \"" + s + "\", t = \"" + t + "\"");
        System.out.println("Output: \"" + result1 + "\""); // Kết quả: "BANC"
    }
}