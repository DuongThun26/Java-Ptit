/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J03024_SoUuThe {
    public static boolean check(String s){
        int c = 0, l = 0;
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i) % 2 == 0) c++;
            else l++;
        }
        if(s.length() % 2 == 0 && c > l)
            return true;
        else if(s.length() % 2 == 1 && l > c)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            boolean ok = true;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(Character.isAlphabetic(c)){
                    System.out.println("INVALID");
                    ok = false;
                    break;
                }
            }
            if(ok && check(s)) System.out.println("YES");
            else if(ok) System.out.println("NO");
        }
    }
}
//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999