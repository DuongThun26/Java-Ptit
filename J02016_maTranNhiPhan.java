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
public class j02016_maTranNhiPhan {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][3];
        int cnt = 0, dem1 = 0, dem0 = 0;
        for(int i = 0; i < n; i++){
            dem1 = 0; 
            dem0 = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1) dem1++;
                else dem0++;
            }
            if(dem1 > dem0) cnt++;
        }
        System.out.println(cnt);
    }
}
