
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class SinhVien2{
    private String ma, ten, lop, email;
    public SinhVien2(){
        
    }
    public SinhVien2(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String getLop(){
        return lop.substring(0, 1);
    }
    public String getNganh(){
        return ma.substring(3, 7);
    }
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }   
}
public class J05024_LietkeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien2[] ds = new SinhVien2[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            s = s.toUpperCase();
            String a[] = s.split("\\s+");
            String z = "DC";
            z =z + a[0].charAt(0) + a[1].charAt(0);
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for(int i = 0; i < n; i++){
                if(ds[i].getNganh().compareTo(z) == 0){
                    if(ds[i].getNganh().compareTo("DCCN") == 0 || ds[i].getNganh().compareTo("DCAT") == 0){
                       if(ds[i].getLop().compareTo("E") != 0){
                           System.out.println(ds[i]);
                       }
                    }
                    else 
                        System.out.println(ds[i]);
                }
            }
        }        
    }
}

