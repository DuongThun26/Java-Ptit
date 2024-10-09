/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.HashSet;
import java.util.Scanner;
public class J02013_sxNoiBot {
    public static void bubbleSort(int a[], int n){
        for(int i = 0; i < n - 1; i++){
            boolean ok = true;
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    ok = false;
                    int tmp  =a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if(!ok){
                System.out.print("Buoc " + (i + 1) + ": ");
                for(int j = 0; j < n; j++){
                    System.out.print(a[j] + " ");
                }
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
        bubbleSort(a, n);
    }
}
