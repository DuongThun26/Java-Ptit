package javaptit;

import java.util.Scanner;
public class J03004_chuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String [] a = s.split("\\s+");
            for(String x : a){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Character.toUpperCase(x.charAt(0)))
                                    .append(x.substring(1).toLowerCase())
                                     .append(" ");         
                System.out.print(stringBuilder.toString());
            } 
            System.out.println();
        }
    }
}
