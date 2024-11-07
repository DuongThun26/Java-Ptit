
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien{
    private String ma, ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKi;

    public NhanVien(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKi) {
        this.ma = String.format("%05d", ma);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKi = ngayKi;
    }
    public String getNgaySinh(){
        String s = ngaySinh;
        return s.substring(6) + s.substring(3, 5) + s.substring(0, 2);      
    }
    public String toString(){
        return ma + " " + ten + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maThue + " " + ngayKi;
    }
}
public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] ds = new NhanVien[n];
        for(int i = 0; i < n; i++){           
            NhanVien a = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds[i] = a;
        }
        Arrays.sort(ds, new Comparator<NhanVien>(){
            public int compare(NhanVien a, NhanVien b){
                return Integer.parseInt(a.getNgaySinh()) - Integer.parseInt(b.getNgaySinh());               
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(ds[i]);
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011