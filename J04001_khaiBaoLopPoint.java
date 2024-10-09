/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
import static javaptit.Point.distance;
class Point{
    private double x, y;
    public Point(){
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondPoint){
        double kc = Math.sqrt(Math.pow((this.x - secondPoint.x), 2) + Math.pow((this.y - secondPoint.y), 2));
        return kc;
    }
    public static double distance(Point p1, Point p2){
        double kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return kc;
    }

}
public class J04001_khaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            double t = sc.nextDouble();
            Point p1 = new Point(x, y);
            Point p2 = new Point(z, t);
            double kc = distance(p1, p2);
            System.out.printf("%.4f", kc);
            System.out.println();
        }
    }
}
