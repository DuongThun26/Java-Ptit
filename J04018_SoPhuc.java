
import java.util.Scanner;

class SoPhuc{
    private int x, y;
    public SoPhuc(){
        
    }
    public SoPhuc(int x, int y){
        this.x = x;
        this.y = y;
    }
    public SoPhuc cong(SoPhuc a){
        SoPhuc b = new SoPhuc();
        b.x = this.x + a.x;
        b.y = this.y + a.y;
        return b;
    }
    public SoPhuc nhan(SoPhuc a){
        SoPhuc b = new SoPhuc();
        b.x = this.x * a.x - this.y * a.y;
        b.y = this.x * a.y + this.y * a.x;
        return b;
    }
    public static SoPhuc C(SoPhuc a, SoPhuc b){
        SoPhuc c = new SoPhuc();
        c = a.cong(b);
        c = c.nhan(a);
        return c;
    }
    public static SoPhuc D(SoPhuc a, SoPhuc b){
        SoPhuc d = new SoPhuc();
        d = a.cong(b);
        d = d.nhan(d);
        return d;
    }
    
    @Override
    public String toString() {
        return x + " + " + y + "i";
    }
    
}
public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = SoPhuc.C(a, b);
            SoPhuc d = SoPhuc.D(a, b);
            System.out.println(c + ", " + d);
        }
    }
}
//3
//1 2 3 4
//2 3 4 5
//1 -2 5 -6