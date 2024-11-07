
import java.util.ArrayList;
import java.util.Collections;
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
class DoanhNghiep1{
    private String ma, ten;
    private int soLuong;

    public DoanhNghiep1(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + soLuong; 
    }
    
}
public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <DoanhNghiep1> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            DoanhNghiep1 a = new DoanhNghiep1(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds, new Comparator <DoanhNghiep1>(){
            public int compare(DoanhNghiep1 a, DoanhNghiep1 b){
                if(a.getSoLuong() != b.getSoLuong()){
                    return b.getSoLuong() - a.getSoLuong();
                }
                else{
                    return a.getMa().compareTo(b.getMa());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep1 dn : ds){
                if(dn.getSoLuong() >= a && dn.getSoLuong() <= b){
                    System.out.println(dn);
                }
            }
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
