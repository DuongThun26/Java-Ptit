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
public class J03032_DaoXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            Stack <Character> st = new Stack<>();
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(int j = 0; j < a.length; j++){
                for(int i = 0; i < a[j].length(); i++){
                    st.push(a[j].charAt(i));
                }
                while(!st.empty()){
                    System.out.print(st.pop());
                }       
                if(j != a.length - 1)
                    System.out.print(" ");
            }           
            System.out.println();
        }
    }
}
//2
//ABC DEF
//123 456