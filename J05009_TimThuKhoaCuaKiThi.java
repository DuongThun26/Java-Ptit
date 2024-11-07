
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
class SinhVien{
    private String ma, ten, ngaySinh;
    private float diem1, diem2, diem3;

    public SinhVien(int ma, String ten, String ngaySinh, float diem1, float diem2, float diem3) {
        this.ma = ("" + ma);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public float tongDiem(){
        return diem1 + diem2 + diem3;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + ngaySinh + " " + tongDiem();
    }
}
public class J05009_TimThuKhoaCuaKiThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for(int i = 0; i < n; i++){
            SinhVien a = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds[i] = a;
        }
        Arrays.sort(ds, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                if(a.tongDiem() < b.tongDiem()) return 1;
                else if(a.tongDiem() > b.tongDiem()) return -1;
                return 0;
            }
        });
        float x = ds[0].tongDiem();
        for(int i = 0; i < n; i++){
            if(ds[i].tongDiem() == x){
                System.out.println(ds[i]);
            }
        }
    }
}
