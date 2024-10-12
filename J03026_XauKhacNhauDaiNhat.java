/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J03026_XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.compareTo(s2) != 0){
                System.out.println(Math.max(s1.length(), s2.length()));
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
//2
//abcd
//defgh
//a
//a