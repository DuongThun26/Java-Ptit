import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    private String ma, ten, lop, email;
    public SinhVien(){
        
    }
    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }
    
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        while(sc.hasNext()){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(sv);
        }
        Collections.sort(ds, new Comparator <SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                return a.getMa().compareTo(b.getMa());
            }
        });
        for(SinhVien sv : ds){
            System.out.println(sv);
        }
    }
}
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT03-B
//sv4@stu.ptit.edu.vn

