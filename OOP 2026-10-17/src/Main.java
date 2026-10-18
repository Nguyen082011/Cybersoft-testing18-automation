//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Vd1: quản lý staff
//        staff full time, part time
//        id, name, lương
//        full time: bonus
//        part time: hours, rate
//        phân tích;
//        employee - class cha
//        fulltime - class con
//        parttime - class con
        Employee[] listEmployee={   //tính đa hình
                new FullTime("F01", "An", 10_000_000, 5_000_000),
                new PartTime("P01", "Bình", 10, 500_000)
        };
        for (Employee e : listEmployee){
            System.out.println(e.getName() + " - " + e.caculateSalary());
        }
        System.out.println("==========");
//        Vd2: hình học
//        Circle, Rectangle. Tính chu vi, diện tích
//        Shape-class cha
//        Circle-class con
//        Rectangle-class con
        Shape[] listShape={
                new Circle(10),
                new Rectangcle(10,20)
        };
        for (Shape s : listShape){
//            Java auto gọi hàm toString() để in area và perimeter
            System.out.println(s);
        }
    }
}