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
public class J03005_chuanHoaHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String []a = s.split("\\s+");
            for(int i = 1; i < a.length; i++){
                StringBuilder st = new StringBuilder();
                st.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1).toLowerCase());
                System.out.print(st.toString());
                if(i != a.length - 1) System.out.print(" ");
                else System.out.print(", ");
            }
            System.out.print(a[0].toUpperCase());
            System.out.println();
        }
    }
}
