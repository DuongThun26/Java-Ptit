/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;
import java.util.Scanner;
import java.util.Arrays;

public class J01007_kiemTraFiBO {
    
    public static void main(String [] args){
        long[] arr = new long[93];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < 93; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t --;
            long n = sc.nextLong();
            if(Arrays.binarySearch(arr, n) >= 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
