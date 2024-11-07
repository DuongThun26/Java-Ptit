import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien1{
    private String ma, ten, lop, email;
    public SinhVien1(){
        
    }
    public SinhVien1(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getKhoa(){
        return "20" + lop.substring(1, 3);
    }
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }   
}
public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien1[] ds = new SinhVien1[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(int i = 0; i < n; i++){
                if(ds[i].getKhoa().compareTo(s) == 0){
                    System.out.println(ds[i]);
                }
            }
        }        
    }
}

//4
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
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015