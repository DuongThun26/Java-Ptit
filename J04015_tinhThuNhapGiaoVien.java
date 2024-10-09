/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class ThuNhap{
    private String ma, hoTen;
    private long luong;

    public ThuNhap(String ma, String hoTen, long luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public long PhuCap(){
        StringBuilder x = new StringBuilder(ma);
        String z = x.substring(0, 2);
        if(z.equals("HT")) return 2000000;
        else if(z.equals("HP")) return 900000;
        return 500000;
    }
    public long BacLuong(){
        StringBuilder x = new StringBuilder(ma);
        String z = x.substring(2, 4);
        Long b = Long.parseLong(z);
        return b;
    }
    public long Luong(){
        return luong * BacLuong();
    }
    public void out(){
        System.out.println(ma + " " + hoTen + " " + BacLuong() + " " + PhuCap() + " " + (Luong() + PhuCap()));
    }
}
public class J04015_tinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuNhap a = new ThuNhap(sc.nextLine(), sc.nextLine(), sc.nextLong());
        a.out();
    }
}
//HP04
//Tran Quoc Huy
//1578000