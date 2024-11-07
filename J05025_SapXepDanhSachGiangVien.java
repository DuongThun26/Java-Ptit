
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class GiangVien1{
    private String ma, ten, mon;

    public GiangVien1(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon;
    }
    public String getTen(){
        String a[] = ten.split("\\s+");
        return a[a.length - 1];
    }
    public String getMon() {
        String s = mon.toUpperCase();
        String a[] = s.split("\\s+");
        String res = "";
        for(int i = 0; i < a.length; i++){
            res += a[i].charAt(0);
        }
        return res;
    }
    public String toString(){
        return ma + " " + ten + " " +getMon();
    }
    
}
public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien1[] ds = new GiangVien1[n];
        for(int i = 0; i < n; i++){
            ds[i] = new GiangVien1(i + 1, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds, new Comparator <GiangVien1>(){
            public int compare(GiangVien1 a, GiangVien1 b){
                return a.getTen().compareTo(b.getTen());
            }
        });
        for(GiangVien1 gv : ds){
            System.out.println(gv);
        }
    }
}
