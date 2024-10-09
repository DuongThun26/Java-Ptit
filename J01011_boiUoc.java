
package javaptit;

import java.util.Scanner;
public class J01011_boiUoc {
    public static long gcdd(long a, long b){
        if(b == 0) return a;
        return gcdd(b, a % b);
    }
    public static long lcmm(long a, long b){
        return a / gcdd(a, b) * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();                                                                               
        while(t > 0){
            t --;
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(lcmm(a, b) + " " + gcdd(a, b));
        }
    }
}
