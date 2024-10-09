/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
public class J03009_tapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String a[]= s1.split("\\s+");
            String b[] = s2.split("\\s+");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            for(int i = 0; i < a.length; i++){
                set1.add(a[i]);
            }
            for(int i = 0; i < b.length; i++){
                set2.add(b[i]);
            }
            for(String x : set1){
                if(set2.contains(x) == false){
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }
    }
}

