/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.*;
public class J02017_thuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        int i = 0;
        while(i >= 0 && i < a.size() - 1){
            if((a.get(i) + a.get(i + 1)) % 2 == 0){
                a.remove(i + 1);
                a.remove(i);
                if(i > 0) i --;
            }
            else{
                i++;
            }
        }
        System.out.println(a.size());
    }
}
