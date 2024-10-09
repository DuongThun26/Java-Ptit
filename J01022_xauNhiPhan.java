/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class J01022_xauNhiPhan {
    
    public static long[] a = new long[93];
    public static String Tryy(int n, long k){
        if(n == 2) return "1";
        if(n == 1) return "0";
        if(k > a[n - 2]){
            return Tryy(n - 1, k = k - a[n - 2]);
        }
        else{
            return Tryy(n - 2, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i < 93; i++){
            a[i] = a[i - 2] + a[i - 1];
        }
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Tryy(n, k));
        }
    }
}
