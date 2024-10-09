package javaptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J02008_boiSoNhoNhat {
    public static long ucln(long a, long b){
        if(b == 0) return a;
        return ucln(b, a % b);
    }
    public static long bcnn(long a, long b){
        return a / ucln(a, b) * b;
    }
    public static long ans(int n){
        long res = 1;
        for(int i = 2;  i < n + 1; i++){
            res = bcnn(res, i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(ans(n));
        }
    }
}
