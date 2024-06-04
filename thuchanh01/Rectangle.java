package btsession03.thuchanh01;

public class Rectangle {
    private  double width;
    private  double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public String display(){
        return "Width: "+width + " Height: "+height;
    }
}
