/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class J02006_hopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        int [] cnt = new int[1002];
        Arrays.fill(cnt, 0);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            cnt[b[i]]++;
        }
        for(int i = 1; i <= 1000; i++){
            if(cnt[i] != 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
