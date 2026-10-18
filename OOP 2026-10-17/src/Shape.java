abstract public class Shape {
//    vì các hình khác thuộc tính nhau -> không tao6 thuộc tính chung, tạo function tính chu vi, diện tích
    abstract double area();
    abstract double perimeter();
//    toString()-hàm đặc biệt của Java
//    System.out.println(Shape);
//    do toString là hàm có sẵn của Java nên muốn define tại logic=>them override
//    Note: không define ham khởi tạo -> java s4 tự tạo hàm khởi tạo
    @Override
    public String toString(){
//        hàm perimeter và area lấy của class con
        return "P: " + perimeter() + " A: " + area();
    }
}
