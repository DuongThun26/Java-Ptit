
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class J03015_HIeuSoNguyenLon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = sc.next();         
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                continue;
            }
            else{
                s = s.substring(i);
                break;
            }
        }
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == '0'){
                continue;
            }
            else{
                x = x.substring(i);
                break;
            }
        }
        int len = Math.max(s.length(), x.length());
        BigInteger a = new BigInteger(s);
        BigInteger b = new BigInteger(x);
        String c = a.subtract(b).toString();
//        if(c.length() != len && c.length() != 0){
//            for(int i = 0; i < len - c.length(); i++){
//                System.out.print("0");
//            }
//        }
        if(c == "-0") System.out.println("0");
        else System.out.println(c);
    }
}
//000123456789012345678901234567890
//00000000000000001234567890