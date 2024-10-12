
import static java.lang.Math.abs;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class J03021_DienThoaiCucGach {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if((int)s.charAt(l) != (int)s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next().toLowerCase();   
            int[] a = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
            String x = "";
            for(int i = 0; i < s.length(); i++){
                x = x + (a[s.charAt(i) - 'a'] + "");
            }
            if(check(x)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//2
//BOHIMA
//IamACoder