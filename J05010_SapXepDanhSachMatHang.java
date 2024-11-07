
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
class MatHang{
    private String ma, ten, nhom;
    private float giaMua, giaBan;

    public MatHang(int ma, String ten, String nhom, float giaMua, float giaBan) {
        this.ma = ma + "";
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public float LoiNhuan(){
        return giaBan - giaMua;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", LoiNhuan());
    }
    
}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] ds = new MatHang[n];
        for(int i = 0; i < n; i++){
            MatHang a = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds[i] = a;
        }
        Arrays.sort(ds, new Comparator <MatHang>(){
            public int compare(MatHang a, MatHang b){
                if(a.LoiNhuan() > b.LoiNhuan()) return -1;
                else if(a.LoiNhuan() < b.LoiNhuan()) return 1;
                return 0;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(ds[i]);
        }
    }
}
