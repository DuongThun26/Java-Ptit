/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class ThoiGian{
    private int gio, phut, giay;
    public ThoiGian(){
        
    }
    public ThoiGian(int h, int m, int s){
        this.gio = h;
        this.phut = m;
        this.giay = s;
    }
    public int getTG(){
        return gio * 3600 + phut * 60 + giay;
    }
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
}
public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ThoiGian t = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ds.add(t);
        }
        Collections.sort(ds, new Comparator<ThoiGian>(){
            public int compare(ThoiGian a, ThoiGian b){
                return a.getTG() - b.getTG();
            }
        });
        for(ThoiGian t : ds){
            System.out.println(t);
        }
    }
}
//3
//11 20 20
//14 20 14
//11 15 12