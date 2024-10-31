
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
class WordSet{
    private TreeSet<String> x;
    public WordSet(String s){ 
        this.x = new TreeSet<>();
        String a [] = s.split("\\s+");
        for(String z : a){
            z = z.toLowerCase();
            this.x.add(z);
        }       
    }
    public WordSet(TreeSet a){
        this.x = a;
    }
    public WordSet union(WordSet a){
        TreeSet <String> set = new TreeSet<>();
        for(String z : this.x){
            set.add(z);
        }
        for(String z : a.x){
            set.add(z);
        }
        WordSet w = new WordSet(set);
        return w;
    }
    public WordSet intersection(WordSet a){
        TreeSet <String> set = new TreeSet<>();
        for(String z : this.x){
            if(a.x.contains(z)){
                set.add(z);
            }
        }
        return new WordSet(set);
    }

    @Override
    public String toString() {
        String s = "";
        for(String z : this.x){
            s += (z + " ");
        }
        return s;
    }
    
}
public class J04022_Wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++