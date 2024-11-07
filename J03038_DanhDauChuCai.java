/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.HashSet;
import java.util.Scanner;
public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet <Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
//2
//18 7
//3 123