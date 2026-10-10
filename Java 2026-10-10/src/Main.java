import javax.swing.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    bài 1: xóa các nguyên âm trong chuỗi
    public static String removeVowels(String str){
        if (str==null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            if (lowerCase != 'a' && lowerCase != 'e' && lowerCase != 'o' && lowerCase != 'u' && lowerCase != 'i'){
                sb.append(c);
            }
        }
        return sb.toString();
    }

//    bài 2: đếm từ trong chuỗi
    public static int countWords(String str){
//        b1: tạo mảng các từ trong string
//        "Xin chào các bạn" => ["Xin", "chào", "các", "bạn"]
//        b2: dùng length có sẵn để đếm từ trong mảng
        String[] words = str.split(" ");
        return words.length;
//        return str.split(" ").length;
    }

//    bài 3: đão ngươc chuỗi
    public static String reverseString(String str){
////        c1: dùng for duyệt từ cuối lên đầu
//        if (str==null) return null;
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length()-1; i>=0; i--){
////            System.out.print(str.charAt(i));
//            char c = str.charAt(i);
//            sb.append(c);
//        }
//        return sb.toString();

//        c2: dùng reverse có sẵn trong String
        return new StringBuilder(str).reverse().toString();
    }

//    collection trong java
    public static void learningCollection(){
//        mảng trong collection
        Integer[] arr = {4, 2, 6, 8, 9};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));
        List<String> listStr = new ArrayList<>();
//        1.Sắp xếp mảng
//        tăng dần
        Collections.sort(listInt);
        System.out.println(listInt);
//        giảm dần
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);
//        đảo ngược mảng
        Collections.reverse(listInt);
        System.out.println(listInt);
//        max, min
        System.out.println("Max: " + Collections.max(listInt));
        System.out.println("Min: " + Collections.min(listInt));
//        đếm số lần xuất hiện của item bất kỳ
        System.out.println("Count 4: " + Collections.frequency(listInt, 4));
//        thêm , xóa, sửa item trong mảng
//        thêm item va cuối listStr
        listStr.add("hello");
        listStr.add("world"); //["hello", "world"]
//        thêm item vòa cuối cùng của mảng
        listStr.add(1, "Earth");
        System.out.println(listStr);
//        đọc item
        System.out.println(listStr.get(1));
//        update
        listStr.set(0, "Hello");
        System.out.println(listStr);
//        xóa
//        xóa theo item
        listStr.remove(0);
        System.out.println(listStr);
//        xóa theo item
        listStr.remove("world");
        System.out.println(listStr);
    }

//    bài 1: tính tônổng trong mảng
    public static void sum(){
        List<Integer> list = new ArrayList<>((Arrays.asList(5,3,7,2,9)));
        int sum =0;
        for (int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Sum= " + sum);
//        tính trung bình
        double avg = (double) sum/ list.size();
        System.out.println("Avg= " + avg);
    }

    public static void removeSoAm(){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,-2,8,9,-4));
//        c1: dùng for
        for (int i=0; i< list.size(); i++){
            if (list.get(i)<0){
                list.remove(i);
            }
        }
        System.out.println(list);
//        c2: dùng removeif
        list.removeIf(num -> num<0);    //-> là arrow function
        System.out.println(list);
    }

    public static void main(String[] args) {
        String str = "Cybersoft";
        System.out.println(removeVowels(str));
        String str1 = "Xin chao";
        System.out.println(removeVowels(str1));

        String str2 = "Xin chào các bạn";
        System.out.println(countWords(str2));
        String str3 = "Hello world";
        System.out.println(countWords(str3));

        String str4 = "Hello";
        System.out.println(reverseString(str4));
        String str5 = "Flight";
        System.out.println(reverseString(str5));

        learningCollection();

        removeSoAm();
    }
}