
package javaptit;
import java.util.Scanner;
public class J01012_uocSoChiaHetCho2 {
    public static long dem(long n){
        if(n % 2 == 1){
            return 0;
        }
        else{
            long c = 0;
            while(n % 2 == 0){
                c ++;
                n /= 2;
            }
            long soUoc = 0;
            for(long i = 1; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    soUoc += 2;
                    if(i == n/ i) soUoc--; 
                }
            }
            return soUoc * c;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            System.out.println(dem(n));
        }    
    }
}
