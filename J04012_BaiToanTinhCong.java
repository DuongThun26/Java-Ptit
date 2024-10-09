/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class NhanVien{
    private String hoTen, chucVu;
    private long luongCoBan, soNgayCong;
    public NhanVien(String hoten, long luong, long cong, String chuc){
        this.hoTen = hoten;
        this.luongCoBan = luong;
        this.soNgayCong = cong;
        this.chucVu = chuc;
    }
    public long Luong(){
        return soNgayCong * luongCoBan;
    }
    public long Thuong(){
        if(soNgayCong >= 25) return (long)(Luong() * 0.2);
        else if(soNgayCong >= 22) return (long)(Luong() * 0.1);
        return 0;
    }
    public long PhuCap(){
        if(chucVu.equals("GD")) return 250000;
        else if(chucVu.equals("PGD")) return 200000;
        else if(chucVu.equals("TP")) return 180000;
        return 150000;
    }
    public String toString(){
        return "NV01" + " " + hoTen + " " + Luong() + " " + Thuong() + " " + PhuCap() + " " + (Luong() + Thuong() + PhuCap());
    }
}
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
        System.out.println(a);
    }
}