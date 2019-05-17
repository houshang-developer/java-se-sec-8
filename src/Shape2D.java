/**
 * Created by 401-06 on 5/16/2019.
 */
//if we have abstract method -> class is abstract
//    class is not abstract ->we do not have abstract method
    // class abstract -> ?
public abstract class Shape2D {
    public abstract double perimeter();
    public abstract double area();
}

class Circle extends Shape2D {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }
}
class Rectangle extends Shape2D {
    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public double area() {
        return length*width;
    }
}

class Cube extends Rectangle {
   private double height;

    public Cube(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double volume() {
        return super.area()*height;
    }

    @Override
    public double area() {
        return 2*super.area()+2*Math.PI;
    }

}

abstract class Triangle extends Shape2D{


}

class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        //Triangle t = new Triangle();
    }
}