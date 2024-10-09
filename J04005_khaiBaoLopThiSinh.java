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
class ThiSinh{
    private String hoTen, ngaySinh;
    private double diem1, diem2, diem3, tongDiem;
    public ThiSinh(){
    }
    public ThiSinh(String name, String ns, double diem1, double diem2, double diem3){
        this.hoTen = name;
        this.ngaySinh = ns;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongDiem = 0;
    }
    public String toString(){
        return hoTen + " " + ngaySinh + " " + String.format("%.1f", diem1 + diem2 + diem3);
    }
}
public class J04005_khaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        ThiSinh ac = new ThiSinh(a, b, c, d, e);
        System.out.println(ac.toString());
    }
}

//Nguyen Hoang Ha
//11/10/2001
//4,5
//10,0
//5,5