
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class IntSet{
    private TreeSet<Integer> x;
    public IntSet(){
        this.x = new TreeSet<>();
    }
    public IntSet(TreeSet a){
        this.x = a;
    }
    public IntSet(int[] a){
        this.x = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            this.x.add(a[i]);
        }
    }  
    public IntSet union(IntSet a){
        TreeSet <Integer> set = new TreeSet<>();
        for(Integer x : this.x){
            set.add(x);
        }
        for(Integer x : a.x){
            set.add(x);
        }
        IntSet c = new IntSet(set);
        return c;
    }

    @Override
    public String toString() {
        String s = "";
        for(Integer z : this.x){
            s += (z + " ");
        }
        return s;
    }
    
}
public class J04021_LopIntset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
//5 6
//1 2 3 4 5
//3 4 5 6 7 8