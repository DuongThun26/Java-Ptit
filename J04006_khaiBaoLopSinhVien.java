/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
class SinhVien{
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;
    public SinhVien(){
        maSV = hoTen = lop = ngaySinh = "";
        gpa = 0;
    }
    public SinhVien(String ten, String lop, String ns, float gpa){
        this.hoTen = ten;
        this.lop = lop;
        this.ngaySinh = ns;
        this.gpa = gpa;
    }
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }
    public String toString(){
        return "B20DCCN001" + " " + hoTen + " " + lop + " " + chuanHoa(ngaySinh) + " " + String.format("%.2f", gpa);
    }
}
public class J04006_khaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(a.toString());
    }
}
