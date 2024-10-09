/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J02014_diemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int d = 0;
            boolean ok = false;
            for(int i = 1; i < n - 1; i++){
                d += a[i - 1];
                if(sum - a[i] - d == d){
                    ok = true;
                    System.out.println(i + 1);
                    break;
                }
            }
            if(!ok) System.out.println("-1");
        }
    }
}
