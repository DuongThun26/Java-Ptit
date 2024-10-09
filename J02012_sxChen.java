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
public class J02012_sxChen {
    public static void insertionSort(int a[], int n){
        for(int i = 0; i < n; i++){
            int vtc = i - 1;
            int gtc = a[i];
            while(vtc >= 0 && gtc < a[vtc]){
                a[vtc + 1] = a[vtc];
                vtc--;
            }
            vtc++;
            a[vtc] = gtc;
            System.out.print("Buoc " + i + ": ");
            for(int j = 0;  j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        insertionSort(a, n);
    }
}
