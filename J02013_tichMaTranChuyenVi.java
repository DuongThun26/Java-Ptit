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
public class J02013_tichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int dem = 1;
        while(t-- > 0){
            System.out.println("Test " + dem + ": ");
            dem++;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int b[][] = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] = a[j][i];
                }
            }
            int [][]c = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int s = 0;
                    for(int k = 0; k < m; k++){
                        s += a[i][k] * b[k][j];
                    }
                    c[i][j] = s;
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
