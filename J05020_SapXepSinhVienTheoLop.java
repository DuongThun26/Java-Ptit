
import java.util.Arrays;
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

    public String getLop() {
        return lop;
    }
    
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
    
}
public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for(int i = 0; i < n; i++){
            ds[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds, new Comparator <SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                if(a.getLop().compareTo(b.getLop()) == 0){
                    return a.getMa().compareTo(b.getMa());
                }
                else{
                    return a.getLop().compareTo(b.getLop());
                }
            }
        });
        for(SinhVien sv : ds){
            System.out.println(sv);
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
//D15CQKT03-B
//sv4@stu.ptit.edu.vn