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
class Point{
    private double x, y;
    public Point(){
        
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point Point(Point a){
        a.x = this.x;
        a.y = this.y;
        return a;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double distance(Point a){
        double kc = Math.sqrt(Math.pow(a.x - x, 2) + Math.pow(a.y - y, 2));
        return kc;
    }
}
public class J04009_DienTichTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);
            if(ab + bc <= ac || ab + ac <= bc || ac + bc <= ab){
                System.out.println("INVALID");
            }
            else{
                double p = (ab + bc + ac) / 2;
                double s = Math.sqrt(p * (p - ac)* (p - ab) * (p - bc));
                System.out.printf("%.2f", s);
                System.out.println();
            }
        }
    }
}
