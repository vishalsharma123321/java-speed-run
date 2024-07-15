package oops;
class Shape {

    public double Area(double width , double length){
        return length*width;
    }

    public double Area(double radius){
        return Math.PI*radius*radius;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        Shape shape= new Shape();

        double Rectangle=shape.Area(56,98);
        System.out.println("The area of the Rectangle = "+Rectangle);

        double circle=shape.Area(56);
        System.out.println("Area of the Circle is = "+ circle);
    }
}
