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
public class J02020_lietKeToHop {
    public static boolean ok = true;
    public static int cnt = 0;
    public static void Init(int a[], int n, int k){
        for(int i = 0; i < k; i++){
            a[i] = i + 1;
        }
    }
    public static void result(int a[], int n, int k){
        cnt++;
        for(int i = 0; i < k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void Next(int a[], int n, int k){
        int i = k - 1;
        while(i >= 0 && a[i] == n - k + i + 1){
            i--;
        }
        if(i >= 0){
            a[i] = a[i] + 1;
            for(int j = i + 1; j < k; j++){
                a[j] = a[i] + j - i;
            }
        }
        else{
            ok = false;
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[k];
        Init(a, n, k);
        while(ok){
            result(a, n, k);
            Next(a, n, k);
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
