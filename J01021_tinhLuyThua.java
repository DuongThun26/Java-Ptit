
package javaptit;

import java.util.Scanner;
public class J01021_tinhLuyThua {
    public static final long mod = 1000000007;
    public static long luyThua(long a, long b){
        if(b == 0) return 1;
        long x = luyThua(a, b / 2);
        x %= mod;
        if(b % 2 == 0) return (x * x) % mod;
        else return (x * x % mod) * a % mod; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            else{
                System.out.println(luyThua(a, b));
            }
        }
    }
}
