/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class J03007_soDep2 {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        int sum = 0;
        if(s.charAt(0) != '8') return false;
        while(l <= r){
            sum += 2 * Character.getNumericValue(s.charAt(l));
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l ++;
            r--;
        }
        if(sum % 10 != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
