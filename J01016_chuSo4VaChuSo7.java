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
public class J01016_chuSo4VaChuSo7 {
    public static boolean check(String s){
        int dem4 = 0, dem7  = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4') dem4++;
            else if(s.charAt(i) == '7') dem7++;
        }
        if(dem4 + dem7 == 4 || dem4 + dem7 == 7) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
