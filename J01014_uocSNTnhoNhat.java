package javaptit;

import java.util.Scanner;
public class J01014_uocSNTnhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long ans = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    ans = Math.max(ans, i);
                    while(n % i == 0){
                        n /= i;
                    }
                }
            }
            if(n > 1){
                ans = Math.max(ans, n);
            }
            System.out.println(ans);   
        }
    }
}
