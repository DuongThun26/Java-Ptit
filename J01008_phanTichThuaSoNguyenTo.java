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
import java.util.Arrays;
public class J01008_phanTichThuaSoNguyenTo {
    @SuppressWarnings("empty-statement")
    public static void phanTich(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int dem = 0;
                System.out.print(" " + i);
                while(n % i == 0){
                    dem ++;
                    n /= i;
                }
                System.out.print("(" + dem + ")");
            }
        }
        if(n > 1) System.out.print(" " + n + "(1)");
        System.out.println("");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            System.out.print("Test " + i + ':');
            phanTich(n);
        }
    }
}
