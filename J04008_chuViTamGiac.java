/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class Point{
    private double x, y;
    public Point(){
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point a){
        this.x = a.x;
        this.y = a.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public static String chuVi(Point a, Point b, Point c){
        double x = distance(a, b);
        double y = distance(a, c);
        double z = distance(b, c);
        return String.format("%.3f", x + y + z);
    }
}
public class J04008_chuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = Point.distance(p1, p2);
            double b = Point.distance(p2, p3);
            double c = Point.distance(p1, p3);
            if(a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else{
                System.out.println(Point.chuVi(p1, p2, p3));
            }
        }
    }
}
