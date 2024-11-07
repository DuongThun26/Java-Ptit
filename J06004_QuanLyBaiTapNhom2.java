
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class SinhVien3{
    private String ma, ten, sdt;
    private int stt;

    public SinhVien3(String ma, String ten, String sdt, int stt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }
    public int getStt(){
        return stt;
    }
    public String getMa(){
        return ma;
    }
    public String toString(){
        return ma + " " + ten + " " + sdt + " " + stt + " ";
    }
}

public class J06004_QuanLyBaiTapNhom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        SinhVien3[] ds = new SinhVien3[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien3(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            
        }
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 1; i <= m; i++){
            String x = sc.nextLine();
            map.put(i, x);
        }
        Arrays.sort(ds, new Comparator <SinhVien3>(){
            public int compare(SinhVien3 a, SinhVien3 b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(SinhVien3 sv : ds){
            System.out.print(sv);
            System.out.println(map.get(sv.getStt()));
        }
    }
}
//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19

