package Homework;

public class Circle implements Shape {
    @Override
    public void getCircle() {
        System.out.println("Circle");

    }

    @Override
    public void getRectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public double area() {
        return  Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    int r;
    int p;
    int radius;

    public Circle(){
        r=5;
        p=3;
        radius=5;
    }

    public int Circle(){
        return r*radius*p;
    }
}


