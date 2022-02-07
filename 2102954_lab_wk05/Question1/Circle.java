import static java.lang.Math.PI;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
    }
    public Circle(double radius){
        this.radius  = radius;
    }
    public Circle(double radius, String color, Boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area = PI *Math.pow(radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*PI*radius;
        return perimeter;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){

    }
}
