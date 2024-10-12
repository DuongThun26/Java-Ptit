
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
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String x = sc.next();
            int len = Math.max(s.length(), x.length());
            BigInteger a = new BigInteger(s);
            BigInteger b = new BigInteger(x);
            String c = a.subtract(b).abs().toString();
            if(c.length() != len){
                for(int i = 0; i < len - c.length(); i++){
                    System.out.print("0");
                }
            }
            System.out.println(c);
        }
    }
}
//2
//978
//12977
//100
//1000000