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
public class J03016_chiaHetCho11 {
    public static boolean check(String s){
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0) sum2 += Character.getNumericValue(s.charAt(i));
            else{
                sum1 += Character.getNumericValue(s.charAt(i));
            }
        }
        if(Math.abs(sum1 - sum2) % 11 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
           String s = sc.next();
           if(check(s) == true) System.out.println("1");
           else System.out.println("0");
        }
    }
}
