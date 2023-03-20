package Homework;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getRectangle();

        Circle circle = new Circle();

        circle.getCircle();

        for (int i = 0; i < 1; i++) {
            System.out.println("Circle  is "+ circle.area());
            System.out.println("Circle is "+circle.perimeter());
            System.out.println("Rectangle is "+ rectangle.perimeter());
            System.out.println("Rectangle is "+ rectangle.area());
        }
              /*  Rectangle
                Circle
                Circle is 78.53981633974483
                Circle is 31.41592653589793
                Rectangle is 14.0
                Rectangle is 14.0 */



        }
    }