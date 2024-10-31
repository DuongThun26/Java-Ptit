
import java.io.File;
import java.io.IOException;
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
    public IntSet(TreeSet x){
        this.x = x;
    }
    public IntSet(){
        this.x = new TreeSet<>();
    }
    public IntSet(int [] a){
        this.x = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            this.x.add(a[i]);
        }
    }
    public IntSet intersection(IntSet b){
        IntSet a = new IntSet();
        for(Integer z : this.x){
            if(b.x.contains(z)){
                a.x.add(z);
            }
        }
        return a;
    }
    public String toString(){
        String s = "";
        for(Integer z : this.x){
            s = s + ("" + z + " ");
        }
        return s;
    }
}
public class J07009_LopIntset2 {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    } 
}
