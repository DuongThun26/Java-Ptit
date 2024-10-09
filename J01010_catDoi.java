package javaptit;

import java.util.Scanner;
public class J01010_catDoi {
    public static String chuanHoa(String s){
        String a = "";
        int j = 0;
        boolean ok = true;
        while(j < s.length() && (s.charAt(j) == '0' || s.charAt(j) == '9' || s.charAt(j) == '8')){
            j++;
        }
        for(int i = j; i < s.length(); i++){
            if(s.charAt(i) == '0' || s.charAt(i) == '9' || s.charAt(i) == '8'){
                a += "0";
            }
            else if(s.charAt(i) == '1'){
                ok = false;
                a += "1";
            }
            else{
                return "INVALID";
            }
        }
        if(ok == true){
            return "INVALID";
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = chuanHoa(s);
            System.out.println(s);
        }
    }
}
