/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.next();
            int cnt = 0;
            int l = 0, r = s.length() - 1;
            while(l <= r){
                if(Character.compare(s.charAt(l), s.charAt(r)) != 0){
                    cnt++;
                }
                l++;
                r--;
            }
            if(s.length() % 2 == 0 && cnt == 1){
                System.out.println("YES");
            }
            else if(s.length() % 2 == 1 && cnt <= 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//3
//abccaa
//abbcca
//abcda