public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0) throw new IllegalArgumentException("radius must be positive");
        this.radius = radius;
    }

    Circle(double radius){
//        this.radius=radius;
        setRadius(radius);
    }

    @Override
    public double area(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
