
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
class DoanhNghiep{
    private String ma, ten;
    private int soLuong;

    public DoanhNghiep(String ma, String ten, int soLuong) {
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
public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <DoanhNghiep> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            DoanhNghiep a = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds, new Comparator <DoanhNghiep>(){
            public int compare(DoanhNghiep a, DoanhNghiep b){
                if(a.getSoLuong() != b.getSoLuong()){
                    return b.getSoLuong() - a.getSoLuong();
                }
                else{
                    return a.getMa().compareTo(b.getMa());
                }
            }
        });
        for(DoanhNghiep a : ds){
            System.out.println(a);
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