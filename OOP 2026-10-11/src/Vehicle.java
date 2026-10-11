public class Vehicle {
    String id;
    String name;
    String model;
    String color;

    public Vehicle(){}
    public Vehicle(String id, String name, String model, String color){
        this.id=id;
        this.name=name;
        this.model=model;
        this.color=color;
    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
