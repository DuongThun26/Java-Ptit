package javaptit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J01018_soKhongLienKe {
    public static boolean check(String s){
        int cnt = Character.getNumericValue(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            cnt += Character.getNumericValue(s.charAt(i));
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i - 1))) != 2){
                return false;
            }
        }
        if(cnt % 10 != 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
