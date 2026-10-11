public class Car extends Vehicle{
    int seats;
    String fuelType;

    public Car(){
        super();    //kế thửa hàm khởi tạo ko tham số của class cha
    }
    public Car(String id,
               String name,
               String model,
               String color,
               int seats,
               String fuelType){
        super(id, name, model, color);  //kế thừa hàm khởi tạo có tham số của class cha
        this.seats=seats;
        this.fuelType=fuelType;
    }
    public void display(){
        super.display();
        System.out.println("Seat: " + seats);
        System.out.println("Fuel type: " + fuelType);
    }
}
