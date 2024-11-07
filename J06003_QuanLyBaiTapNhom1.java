
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
class SinhVien2{
    private String ma, ten, sdt;
    private int stt;

    public SinhVien2(String ma, String ten, String sdt, int stt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }
    public int getStt(){
        return stt;
    }
    public String toString(){
        return ma + " " + ten + " " + sdt;
    }
}

public class J06003_QuanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s+");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        SinhVien2[] ds = new SinhVien2[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien2(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            
        }
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 1; i <= m; i++){
            String x = sc.nextLine();
            map.put(i, x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            int nhom = sc.nextInt();
            System.out.println("DANH SACH NHOM " + nhom + ":");
            for(int i = 0; i < n; i++){
                if(ds[i].getStt() == nhom){
                    System.out.println(ds[i]);
                }
            }
            System.out.println("Bai tap dang ky: " + map.get(nhom));
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
//1
//1