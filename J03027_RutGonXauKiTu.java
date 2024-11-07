/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
import java.util.Stack;
public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else{
                if(Character.compare(s.charAt(i), st.peek()) == 0){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.empty()){
            System.out.println("Empty String");
        }
        else{
            String x = "";
            while(!st.empty()){
                x += st.pop();
            }                          
            for(int i = x.length() - 1; i >= 0; i--){
                System.out.print(x.charAt(i));
            }
            System.out.println();
        }
    }
}
