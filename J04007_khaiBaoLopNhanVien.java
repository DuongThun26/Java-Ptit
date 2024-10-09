/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class NhanVien{
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKi;
    public NhanVien(String ten, String gt, String ns, String dc, String thue, String k){
        this.hoTen = ten;
        this.gioiTinh = gt;
        this.ngaySinh = ns;
        this.maThue = thue;
        this.ngayKi = k;
        this.diaChi = dc;
    }
    public String toString(){
        return "00001" + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maThue + " " + ngayKi;
    }
}
public class J04007_khaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(a.toString());
    }
}
