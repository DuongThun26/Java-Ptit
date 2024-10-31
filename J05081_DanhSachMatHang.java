
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
class MatHang{
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    public MatHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH0";
        if(ma < 10) this.ma = this.ma + "0" + ("" + ma);
        else this.ma += ("" + ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public int getLoiNhuan(){
        return giaBan - giaMua;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
    
}
public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            MatHang mh = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(mh);
        }
        Collections.sort(ds, new Comparator<MatHang>(){
            public int compare(MatHang a, MatHang b){
                return b.getLoiNhuan() - a.getLoiNhuan();
            }
        });
        for(MatHang mh : ds){
            System.out.println(mh);
        }
    }
}
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000