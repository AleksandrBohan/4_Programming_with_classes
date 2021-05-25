package EasyClassesAndObjects;

import java.util.Scanner;

class Point{
    public double pointX, pointY;
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public Point() {
        this(0, 0);
    }
    public static double distance(Point pointFirst, Point pointSecond) {
        double dx = pointFirst.pointX - pointSecond.pointX;
        double dy = pointFirst.pointY - pointSecond.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void print() {
        System.out.println("x: " + pointX + ", y: " + pointY);
    }
    public void read(Scanner scanner) {
        System.out.print("x: ");
        pointX = scanner.nextDouble();
        System.out.print("y: ");
        pointY = scanner.nextDouble();
    }
}

public class Triangle {
    private Point a, b, c;
    public Triangle(Point pointA, Point pointB, Point pointC) {
        a = pointA;
        b = pointB;
        c = pointC;
    }
    public double square() {
        // формула Герона
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
    public double perimeter() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        return ab + bc + ac;
    }
    public Point median_crossing() {
        return new Point((a.pointX + b.pointX + c.pointX) / 3, (a.pointY + b.pointY + c.pointY) / 3);
    }
    public void print() {
        System.out.print("A: ");
        a.print();
        System.out.print("B: ");
        b.print();
        System.out.print("C: ");
        c.print();
    }

}
