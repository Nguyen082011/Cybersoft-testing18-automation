public class Rectangcle extends Shape{
    private double width;
    private double height;

//    c1: tạo getter, setter
//    c2: thêm logic kiểm tra width, height, trong hàm khởi tạo
    public Rectangcle(double width, double height){
        if (width<0 || height<0)
            throw new IllegalArgumentException("Width and height must be positive");
        this.height=height;
        this.width=width;
    }
    @Override
    public double area(){
        return width*height;
    }
    @Override
    public double perimeter(){
        return 2*(width+height);
    }
}
