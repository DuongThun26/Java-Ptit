/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaptit;
import java.util.Scanner;
public class J01006_tinhSoFiBo {
    
    public static long fiBo(int n){
        if(n <= 2) return 1;
        else{
            long f2 = 1, f1 = 1, fn = 0;
            for(int i = 3; i <= n; i++){
                fn = f2 + f1;
                f2 = f1;
                f1 = fn;
            }
            return fn;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t --;
            int n = sc.nextInt();
            System.out.println(fiBo(n));
        }
    }
}

