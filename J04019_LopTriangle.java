
import java.util.Scanner;


class Point{
    private float x, y;
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point a){
        double kc = Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
        return kc;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(Float.parseFloat(sc.next()), Float.parseFloat(sc.next()));
    }
}
class Triangle{
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        if(ab + bc <= ac || ab + ac <= bc || bc + ac <= ab) return false;
        return true;
    }
    public String getPerimeter(){
        double cv = a.distance(b) + a.distance(c) + b.distance(c);
        return String.format("%.3f", cv);
    }
}
public class J04019_LopTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0