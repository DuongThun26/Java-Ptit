package javaptit;

import java.util.Scanner;
public class J01013_tongUocSo {
    public static int [] tach(int maxx){
        int a[] = new int[maxx  + 1];
        for(int i = 1; i <= maxx; i++){
            a[i] = i;
        }
        for(int i = 2; i <= Math.sqrt(maxx); i++){
            if(a[i] == i){
                for(int j = i * i; j <= maxx; j += i){
                    if(a[j] == j){
                        a[j] = i;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        int maxx = 0;
        int []a = new int [n];
        for(int j = 0; j < n; j++){
            a[j] = sc.nextInt();
            maxx = Math.max(a[j], maxx);
        }
        int arr [] = tach(maxx);
        for(int i = 0; i < n; i++){
            while(a[i] > 1){
                s += arr[a[i]];
                a[i] /= arr[a[i]];
            }
        }
        System.out.println(s);
    }
}