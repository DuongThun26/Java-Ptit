/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] a = s.split("\\s+");
            String ans = "";
            ans += a[a.length - 1].toLowerCase();
            for(int i = 0; i < a.length - 1; i++){
                char r = a[i].charAt(0);
                if (r >= 'A' && r <= 'Z'){
                    r += 32;
                }
                ans += r;
            }
            if(map.containsKey(ans)){
                int x = map.get(ans);
                x++;
                map.put(ans, x);
            }
            else{
                map.put(ans, 1);
            }
            if(map.get(ans) != 1){
                ans = ans + ("" + map.get(ans));
            }
            ans += "@ptit.edu.vn";
            System.out.println(ans);
        }
    }
}
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH