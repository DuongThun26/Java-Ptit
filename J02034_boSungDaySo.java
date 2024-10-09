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
import java.util.Collections;
import java.util.Scanner;
public class J02034_boSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        Collections.sort(a);
        boolean ok = true;
        for(int i = 0; i < n; i++){
            if(a.get(i) != i + 1){
                ok = false;
                if(i > 0){
                    for(int j = a.get(i - 1) + 1; j < a.get(i); j++){
                        System.out.println(j);
                    }
                }
                else{
                    for(int j = 1;  j < a.get(i); j++){
                        System.out.println(j);
                    }
                }
            } 
        }
        if(ok) System.out.println("Excellent!");
    }
}
