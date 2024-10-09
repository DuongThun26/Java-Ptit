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
public class J02005_giaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        int [] cnt1 = new int[1002];
        int [] cnt2 = new int[1002];
        Arrays.fill(cnt1, 0);
        Arrays.fill(cnt2, 0);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt1[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            cnt2[b[i]] = 1;
        }
        for(int i = 1; i <= 1000; i++){
            if(cnt1[i] == 1 && cnt2[i] == 1) System.out.print(i + " ");
        }
        System.out.println();
    }
}
