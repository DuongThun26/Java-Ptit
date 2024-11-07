
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
class GiangVien2{
    private String ma, ten, mon;

    public GiangVien2(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon;
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
public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien2[] ds = new GiangVien2[n];
        for(int i = 0; i < n; i++){
            ds[i] = new GiangVien2(i + 1, sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            String a[] = s.split("\\s+");
            String z = "";
            for(int i = 0; i < a.length; i++){
                z += a[i].charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + z + ":");
            for(GiangVien2 gv : ds){
                if(gv.getMon().compareTo(z) == 0){
                    System.out.println(gv);
                }
            }
        }
    }
}
