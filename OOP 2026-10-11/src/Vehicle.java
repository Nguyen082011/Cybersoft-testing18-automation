//tính đóng gói
//private, protected, public
//private:chỉ nội bộ trong class dùng, bên ngoài không thể truy cập kể cả class con
//public:tất cả class bên ngoài đều dùng được
//protected:chỉ cho class con đều dùng được, class không dùng được
//NGUYÊN TẮC: -thuộc tính BẮT BUỘC dùng private, trừ 1 số case thì dùng protected
//-hàm khởi tạo BẮT BUỘC dùng public
//-trong case thuộc tính ở phạm vi private muốn truy cập tới -> dùng getter, setter

//tính trừu tượng
//class cha chỉ dùng cho class con kế thừa, không dùng để tạo object
abstract public class Vehicle {
    private String id;
    private String name;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(){}
    public Vehicle(String id, String name, String model, String color){
        this.id=id;
        this.name=name;
        this.model=model;
        this.color=color;
    }

    abstract void getInfo();

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
