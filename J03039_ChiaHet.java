/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.math.BigInteger;
import java.util.Scanner;
public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String [] s = sc.nextLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if(a.compareTo(b) < 0){
                BigInteger tmp = new BigInteger((a + ""));
                a = b;
                b = tmp;
            }
            if(a.mod(b) == BigInteger.ZERO){
                    System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//2
//18 7
//3 123