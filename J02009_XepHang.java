import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pair{
    private int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] p = new Pair[n];
        for(int i = 0; i < n; i++){
            p[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(p, new Comparator <Pair>(){
            public int compare(Pair a, Pair b){
                if(a.getX() == b.getX()){
                    return Integer.compare(a.getY(), b.getY());
                }
                else{
                    return Integer.compare(a.getX(), b.getX());
                }
            }
        });
        int sum = p[0].getX() + p[0].getY();
        for(int i = 1; i < n; i++){
            if(p[i].getX() <= sum) sum += p[i].getY();
            else{
                sum = p[i].getX() + p[i].getY();
            }
        }
        System.out.println(sum);
        
    }
}
